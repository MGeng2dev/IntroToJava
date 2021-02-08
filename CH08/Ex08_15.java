/** Geometry: Same Line?
 *  Programming Exercise 6.39 gives a method for testing whether three points are on the
 *  same line. 
 *  Write the following method to test whether all the points in the array points are
 *  on the same line.
 *
 *    public static boolean sameLine(double[][] points)
 *
 *  Write a program that prompts the user to enter five points and displays whether they 
 *  are on the same line.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_15 {
   public static void main(String[] args) {
      // Create scanner & initialize array variable
      Scanner input = new Scanner(System.in);
      double[][] points = new double[5][2];
      
      // Prompt user
      System.out.print("Enter five points: ");
      for (int i = 0; i < points.length; i++) {
         for (int j = 0; j < points[0].length; j++) {
            points[i][j] = input.nextDouble();
         }
      }
      
      // Check if points are on same line
      if (sameLine(points) == true) {
         System.out.print("The five points are on the same line");
      }
      else { 
         System.out.print("The five points are not on the same line");
      }
      
   }
   
    /** Check if points are on same line */
   public static boolean sameLine(double[][] points) {
      // Check points
      for (int i = 0; i < points.length - 2; i++) {
         int j = i + 1;
         int k = i + 2;
         double x0 = points[i][0]; 
         double y0 = points[i][1];
         double x1 = points[j][0];
         double y1 = points[j][1];
         double x2 = points[k][0];
         double y2 = points[k][1];
         // Use formula from Exercise 3.32
         double check = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
         if (check != 0) {
            return false; // points fail check
         }
      }
      
      return true; // on same line
   }
   
}