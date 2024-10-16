public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(int point1X, int point1Y, int point2X, int point2Y, int point3X, int point3Y) throws Exception {
        super(point1X, point1Y, point2X, point2Y, point3X, point3Y);

        double[] sides = this.GetSides();

        double sideA = sides[0];
        double sideB = sides[1];
        double sideC = sides[2];

        if (!((sideA == sideB) && (sideA != sideC)) || ((sideA == sideC) && (sideA != sideB)) || ((sideC == sideB) && (sideC != sideA))) {
            throw new Exception("Not Isoceles triangle");
        }

    }

    public double circumference(){
        double sideA = Math.sqrt(Math.pow(point2X - point1X, 2) + Math.pow(point2Y - point1Y, 2));
        double sideB = Math.sqrt(Math.pow(point3X - point2X, 2) + Math.pow(point3Y - point2Y, 2));
        double sideC = Math.sqrt(Math.pow(point3X - point1X, 2) + Math.pow(point3Y - point1Y, 2));
        //TriangleCheck(sideA, sideB, sideC);

        return sideA + sideB + sideC;
    }

}