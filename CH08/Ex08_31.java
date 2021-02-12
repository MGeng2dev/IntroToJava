/** Geometry: Intersecting Point 
 *  Write a method that returns the intersecting point of two lines. The intersecting point
 *  of two lines can be found by using the formula shown in Programming Exercise 3.25. Assume 
 *  that (x1, y1) and (x2, y2) are the two points on line 1 and (x3, y3) and (x4, y4) are on
 *  line 2. The method header is:
 *
 *    public static double[] getIntersectingPoint(double[][] points)
 * 
 *  The points are stored in a 4-by-2 two-dimensional array points with (points[0][0], points[0][1])
 *  for (x1, y1). The method returns the intersecting point or null if the two lines are 
 *  parallel. Write a program that prompts the user to enter four points and displays the
 *  intersecting point. 
 *
 */
 
import java.util.Scanner;
 
public class Ex08_31 {
   public static void main(String[] args) {
      // Initialize
      Scanner input = new Scanner(System.in);
      double[][] points = new double[4][2];
      
      // Prompt user
      System.out.print("Enter points: ");
      for (int i = 0; i < points.length; i++) {
         for (int j = 0; j < points[0].length; j++) {
            points[i][j] = input.nextDouble();
         }
      }
      
      // Call method & print result
      double[] result = getIntersectingPoint(points);
      if (result == null) 
         System.out.print("The two lines are parallel");
      else
         System.out.print("The intersecting point is (" + result[0] + ", " + result[1] + ")");
      
   }
   
    /** Return intersecting point of 2 lines */
   public static double[] getIntersectingPoint(double[][] points) {
      // Initialize return array
      double[] intersectingPoint = new double[2];
      
      // Get variables from array
      double x1 = points[0][0];
      double y1 = points[0][1];
      double x2 = points[1][0];
      double y2 = points[1][1];
      double x3 = points[2][0];
      double y3 = points[2][1];
      double x4 = points[3][0];
      double y4 = points[3][1];
      
      // Calculate variables for Cramer's rule
      double a = y1 - y2;
      double b = -1 * (x1 - x2);
      double c = y3 - y4;
      double d = -1 * (x3 - x4);
      double e = a * x1 + b * y1;
      double f = c * x3 + d * y3;
      
      // Determine if lines are parallel, or determine intersecting point
      if (a*d - b*c == 0) {
         return null;
      }
      else {
         double x = (e * d - b * f) / (a * d - b * c);
         double y = (a * f - e * c) / (a * d - b * c);
         intersectingPoint[0] = x;
         intersectingPoint[1] = y;
         return intersectingPoint;
      }
   }
   
}
      
