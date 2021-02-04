/** Locate The Largest Element
 *  Write the following method that returns the location of the largest element in a two-
 *  dimensional array.
 *  
 *    public static int[] locate Largest(double[][] a)
 *
 *  The return value is a one-dimensional array that contains two elements. These two 
 *  elements indicate the row and column indices of the largest element in the two
 *  dimensional array. Write a test program that prompts the user to enter a two-
 *  dimensional array and displays the location of the largest element in the array.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_11 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows and columns of the array: ");
      int rows = input.nextInt();
      int cols = input.nextInt();
      double[][] array = new double[rows][cols];
      System.out.print("Enter the array: ");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            array[i][j] = input.nextDouble();
         }
      }
      
      // Call method
      int[] result = locateLargest(array);
      System.out.print("The location of the largest element is at (" + result[0] + ", " + result[1] + ")");
      
   }
   
   /** Returns the location of the largest element in the array */
   public static int[] locateLargest(double[][] a) {
      int[] result = new int[2];
      int largestIndexRow = 0;
      int largestIndexCol = 0;
      double largest = a[0][0];
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            if (a[i][j] > largest) {
               largest = a[i][j];
               largestIndexRow = i;
               largestIndexCol = j;
            }
         }
      }
      result[0] = largestIndexRow;
      result[1] = largestIndexCol;
      return result;
   }
   
}
