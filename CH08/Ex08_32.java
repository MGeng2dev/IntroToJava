/** Geometry: Area Of A Triangle
 *  Write a method that returns the area of a triangle using the following header:
 *
 *    public static double getTriangleArea(double[][] points)
 *
 *  The points are stored in a 3-by-2 two-dimensional array points with points[0][0]
 *  and points[0][1] for (x1, y1). The triangle area can be computed using the formula 
 *  in Programming Exercise 2.19. The method returns 0 if the three points are on the 
 *  same line. Write a program that prompts the user to enter three points of a triangle
 *  and displays the triangle's area.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_32 {
   public static void main(String[] args) {
      // Initialize
      Scanner input = new Scanner(System.in);
      double[][] points = new double[3][2];
      
      // Prompt user
      System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
      for (int i = 0; i < points.length; i++) {
         for (int j = 0; j < points[0].length; j++) {
            points[i][j] = input.nextDouble();
         }
      }
      
      // Call method & print result
      double area = getTriangleArea(points);
      if (Double.isNaN(area))
         System.out.print("The three points are on the same line");
      else
         System.out.print("The area of the triangle is " + area);
         
   }
   
    /** Calculate triangle area */
   public static double getTriangleArea(double[][] points) {
      // Assign variables from array values
      double x1 = points[0][0];
      double y1 = points[0][1];
      double x2 = points[1][0];
      double y2 = points[1][1];
      double x3 = points[2][0];
      double y3 = points[2][1];
      
      // Calculate area
      // First, have to calculate length of sides using distance formula
      double side1 = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
      double side2 = Math.pow((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)), 0.5);
      double side3 = Math.pow((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)), 0.5);
      // Second, use formula from problem to calculate s
      double s = (side1 + side2 + side3) / 2;
      // Third, use formula from problem to calculate area
      double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
      return area;
   }
      
}
