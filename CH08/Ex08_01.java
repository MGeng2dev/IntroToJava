/** Sum Elements Column by Column
 *  Write a method that returns the sum of all the elements in a 
 *  specified column in a matrix using the following header:
 *
 *    public static double sumColumn(double[][] m, int columnIndex)
 *
 *  Write a rest program that reads a 3-by-4 matrix and displays 
 *  the sum of each column.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_01 {
   public static void main(String[] args) {
      // Initilize matrix
      double[][] array = new double[3][4];
      
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a 3-by-4 matrix row by row: ");
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[0].length; j++) {
            array[i][j] = input.nextDouble();
         }
      }
      
      // Call method and display result
      for (int i = 0; i < array[0].length; i++) {
         System.out.print("Sum of the elements at column " + i + " is " + sumColumn(array, i) + "\n");
      }   
      
   }
   
    /** Method returns the sum of a specified column */
   public static double sumColumn(double[][] m, int columnIndex) {
      double sum = 0; 
      for (int i = 0; i < m.length; i++) {
         sum = sum + m[i][columnIndex];
      }
      return sum;
   }
      
}