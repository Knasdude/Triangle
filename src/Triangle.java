public class Triangle {
    int point1X;
    int point1Y;
    int point2X;
    int point2Y;
    int point3X;
    int point3Y;

    public Triangle(int point1X, int point1Y, int point2X, int point2Y, int point3X, int point3Y){
        this.point1X = point1X;
        this.point1Y = point1Y;
        this.point2X = point2X;
        this.point2Y = point2Y;
        this.point3X = point3X;
        this.point3Y = point3Y;

        //toString(point1X, point1Y,point2X, point2Y, point3X, point3Y);
    }

    double[] GetSides(){
        double sideA = Math.sqrt(Math.pow(point2X-point1X, 2) + Math.pow(point2Y-point1Y, 2));
        double sideB = Math.sqrt(Math.pow(point3X-point2X, 2) + Math.pow(point3Y-point2Y, 2));
        double sideC = Math.sqrt(Math.pow(point3X-point1X, 2) + Math.pow(point3Y-point1Y, 2));
        System.out.println(sideA + sideB + sideC);

        Area(sideA, sideB, sideC);
        Circumference(sideA, sideB, sideC);

        double[] sideArray = {sideA, sideB, sideC};
        return sideArray;
    }

    double Circumference(double sideA, double sideB, double sideC){
        return sideA + sideB + sideC;
    }

    void Area(double sideA, double sideB, double sideC){

        double HalfCircum = 0.5*(sideA + sideB + sideC);

        //Herons formel:
        double area = Math.sqrt(HalfCircum * (HalfCircum - sideA) * (HalfCircum - sideB) * (HalfCircum - sideC));

        System.out.println(area);
    }


    public String toString(){
        return "(" + point1X + "," + point1Y + ")" + ("\n") + "(" + point2X + "," + point2Y + ")" + ("\n") + "(" + point3X + "," + point3Y + ")";
    }
}
