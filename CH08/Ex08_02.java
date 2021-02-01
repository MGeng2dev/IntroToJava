/** Sum The Major Diagonal In A Matrix
 *  Write a method that sums all the numbers in the major diagonal in an 
 *  n-by-n matrix of double values using the following header:
 *
 *    public static double sumMajorDiagonal(double[][] m)
 *
 *  Write a test program that reads a 4-by-4 matrix and displays the sum
 *  of all its elements on the major diagonal.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_02 {
   public static void main(String[] args) {
      // Initialize matrix
      double[][] array = new double[4][4];
      
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a 4-by-4 matrix row by row: ");
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[0].length; j++) {
            array[i][j] = input.nextDouble();
         }
      }
      
      // Call method & display result
      System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(array));
   }
   
    /** Method returns the sum of the major diagonal */
   public static double sumMajorDiagonal(double[][] m) {
      double sumDiagonal = 0;
      for (int i = 0; i < m.length; i++) {
         sumDiagonal = sumDiagonal + m[i][i];
      }
      return sumDiagonal;
   }
}