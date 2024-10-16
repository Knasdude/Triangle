import java.lang.Math;

 public class Line {
     public int point1X;
     public int point1Y;
     public int point2X;
     public int point2Y;

     public Line(int point1X, int point1Y, int point2X, int point2Y) {
         this.point1X = point1X;
         this.point1Y = point1Y;
         this.point2X = point2X;
         this.point2Y = point2Y;
     }

     public double pointDistance() {
         double deltaX = point1X - point2X;
         double deltaY = point1Y - point2Y;
         return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));

     }


     public double scalarIncrease() {
         return 0;

         }

     }

