import java.lang.Math;


    public class Point {
        public int pointX;
        public int pointY;

        public Point(int pointX, int pointY) {
            this.pointX = pointX;
            this.pointY = pointY;
        }

        public double distanceFromOrigin() {
            return Math.sqrt((pointX * pointX) + (pointY * pointY));


        }

    }


