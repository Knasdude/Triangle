import java.util.Arrays;

public class RightAngledTriangle extends Triangle {

    public RightAngledTriangle(int point1X, int point1Y, int point2X, int point2Y, int point3X, int point3Y) throws Exception {
        super(point1X, point1Y, point2X, point2Y, point3X, point3Y);

        double[] sides = this.GetSides();

        Arrays.sort(sides); //first side is smallest

        if (Math.pow(sides[0], 2) + (Math.pow(sides[1], 2)) != (Math.pow(sides[2], 2))) {
            throw new Exception("Not rightangled");
        }

    }

}