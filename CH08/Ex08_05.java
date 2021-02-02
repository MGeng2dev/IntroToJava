/** Algebra: Add Two Matrices
 *  Write a method to add two matrices. The header of the method is as follows:
 *
 *    public static double[][] addMatrix(double[][] a, double[][] b)
 *
 *  In order to be added, the two matrices must have the same dimensions and 
 *  the same or compatible types of elements. Let c be the resulting matrix.
 *  Each element cij is aij + bij.
 * 
 *  Write a test program that prompts the user to enter two 3 x 3 matrices and
 *  displays their sum.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_05 {
   public static void main(String[] args) {
      // Initialize variables
      double[][] a = new double[3][3];
      double[][] b = new double[3][3];
      
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter matrix1: ");
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            a[i][j] = input.nextDouble();
         }
      }
      System.out.print("Enter matrix2: ");
      for (int i = 0; i < b.length; i++) {
         for (int j = 0; j < b[0].length; j++) {
            b[i][j] = input.nextDouble();
         }
      }
      
      // Call method to sum matrices
      System.out.print("The matrices are added as follows: \n");
      double[][] c = addMatrix(a, b);
      //System.out.print(java.util.Arrays.toString(a));
      for (int i = 0; i < c.length; i++) {
         for (int j = 0; j < c[0].length; j++) {
            System.out.print(c[i][j] + " ");
         }
         System.out.print("\n");
      }
      
   }
   
    /** Returns the sum of two matrices */
   public static double[][] addMatrix(double[][]a, double[][] b) {
      double[][] c = new double[a.length][a[0].length];
      // Add each element in a to corresponding element in b
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            c[i][j] = a[i][j] + b[i][j];
         }
      }
      return c;
   }
   
}
