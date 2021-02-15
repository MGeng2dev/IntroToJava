/** Geometry: Rightmost Lowest Point
 *  In computational geometry, often you need to find the rightmost point in a set of points.
 *  Write the following method that returns the rightmost lowest point in a set of points.
 *
 *    public static double[] getRightmostLowestPoint(double[][] points)
 *
 *  Write a test program that prompts the user the enter the coordinates of six points and
 *  displays the rightmost lowest point.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_34 {
   public static void main(String[] args) {
      // Initialize
      double[][] points = new double[6][2];
      Scanner input = new Scanner(System.in);
      
      // Prompt user
      System.out.print("Enter 6 points: ");
      for (int i = 0; i < points.length; i++) {
         for (int j = 0; j < points[0].length; j++) {
            points[i][j] = input.nextDouble();
         }
      }
      
      // Call method & print result
      double[] result = getRightmostLowestPoint(points);
      System.out.print("The rightmost lowest point is (" + result[0] + ", " + result[1] + ")");
      
   }
   
    /** Returns the rightmost lowest point */
   public static double[] getRightmostLowestPoint(double[][] points) {
      // Initialize
      int index = 0;
      double rightmost = points[0][0];
      double lowest = points[0][1];
      double[] result = new double[2];
      
      // Loop thru array
      for (int i = 0; i < points.length; i++) {
         if ((points[i][0]  > rightmost && points[i][1] <= lowest) ||
            (points[i][0] >= rightmost && points[i][1] < lowest)) {
            index = i;
            rightmost = points[i][0];
            lowest = points[i][1];
         }
      }
        
      result[0] = rightmost;
      result[1] = lowest;
      return result;
   }
   
}
        
