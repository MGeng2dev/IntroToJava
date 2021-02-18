/** Algebra: Solve Linear Equations
 *  Write a method that solves the following 2x2 system of linear equations:
 *  
 *    a00x + a01y = b0
 *    a10x + a11y = b1
 *
 *    x = (b0a11 - b1a01) / (a00a11 - a01a10)
 *    y = (b1a00 - b0a10) / (a00a11 - a01a10)
 *
 *  The method header is:
 *    public static double[] linearEquation(double[][] a, double[] b) 
 *
 *  The method returns null if a00a11 - a01a10 is 0. Write a test program that prompts
 *  the user to enter a00, a01, a10, a11, b0 and b1, and displays the result. If
 *  a11a11 - a01a10 is 0, report that "The equation has no solution. 
 *
 */
 
import java.util.Scanner;
 
public class Ex08_30 {
   public static void main(String[] args) {
      // Initialize
      Scanner input = new Scanner(System.in);
      double[][] a = new double[2][2];
      double[] b = new double[2];
      System.out.print("Enter a00, a01, a10, a11: ");
      
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            a[i][j] = input.nextDouble();
         }
      }
      System.out.print("Enter b0 and b1: ");
      for (int i = 0; i < b.length; i++) {
         b[i] = input.nextDouble();
      }
      
      // Call method & display result
      double[] result = linearEquation(a, b);
      if (result != null) {
         System.out.print("x is " + result[0] + " and y is " + result[1]);
      }
      
      
   }
   
   /** Solves system of linear equations */
   public static double[] linearEquation(double[][] a, double[] b) {
     // Intialize variables
      double a00 = a[0][0];
      double a01 = a[0][1];
      double a10 = a[1][0];
      double a11 = a[1][1];
      double b0 = b[0];
      double b1 = b[1];
      double[] result = new double[2];
      
      // Check if equation has a solution
      if ((a00 * a11) - (a01 * a10) == 0) {
         System.out.print("The equation has no solution");
         return null;
      }
      // Perform calculation
      else {
         double x = ((b0 * a11) - (b1 * a01)) / ((a00 * a11) - (a01 * a10));
         double y = ((b1 * a00) - (b0 * a10)) / ((a00 * a11) - (a01 * a10));
         result[0] = x;
         result [1] = y;
         return result;
      }
   }
   
}