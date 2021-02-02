/** Algebra: Multiply Two Matrices
 *  Write a method to multiply two matrices. The header of the method is:
 *
 *    public static double[][] multiplyMatrix(double[][] a, double[][] b)
 *
 *  To multiply matrix a by matrix b, the number of columns in a must be 
 *  the same as the number of rows in b, and the two matrices must have 
 *  elements of the same or compatible types. Let c be the result of matrix
 *  multiplication. Assume the column size of matrix a is n. Each element cij
 *  is ai1 x b1j + ai2 x b2j + ... + ain x bnj.
 *
 *  Write a test program that prompts the user to enter two 3 x 3 matrices
 *  and displays their product. 
 *
 */ 
 
import java.util.Scanner;
 
public class Ex08_06 {
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
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            b[i][j] = input.nextDouble();
         }
      } 
      
      // Call method & display result
      double[][] result = multiplyMatrix(a, b);
      System.out.print("The multiplication of the matrices is: \n");
      for (int i = 0; i < result.length; i++) {
         for (int j = 0; j < result[0].length; j++) {
            System.out.printf("%-3.1f", result[i][j]);
            System.out.print(" ");
         }
         System.out.print("\n");
      }
      
   }
   
    /** Method multiplies matrices */
   public static double[][] multiplyMatrix(double[][] a, double[][] b) {
      int aRows = a.length;
      int aCols = a[0].length;
      int bCols = b[0].length;
      
      double[][] c = new double[aRows][bCols];
      
      for (int i = 0; i < aRows; i++) {
         for (int j = 0; j < bCols; j++) {
            for (int k = 0; k < aCols; k++) {
               c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
         }
      }
   
      return c;
   }
   
}