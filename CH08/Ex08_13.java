/** Locate The Largest Element
 *  Write the following method that returns the location of the largest element in a two-
 *  dimensional array.
 *
 *    public static int[] locateLargest(double[][] a)
 *
 *  The return value is a one-dimensional array that contains two elements. These two
 *  elements indicate the row and column indices of the largest element in the two-
 *  dimensional array. Write a test program that prompts the user to enter a two-
 *  dimensional array and displays the location of the largest element in the array.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_13 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows and columns of the array: ");
      int rows = input.nextInt();
      int cols = input.nextInt();
      double[][] a = new double[rows][cols];
      System.out.print("Enter the array: ");
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            a[i][j] = input.nextDouble();
         }
      }
      
      // Call method & display result
      int[] indices = locateLargest(a);
      System.out.print("The location of the largest element is at (" + indices[0] + ", " + 
         indices[1] + ")");
      
   }
   
    /** Returns location of largest element */
   public static int[] locateLargest(double[][] a) {
      // Initialize variable - assume first value is largest
      int index1 = 0;
      int index2 = 0;
      double largest = a[index1][index2];
      int[] result = new int[2];
      // Loop thru all elements & compare to largest variable
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            if (a[i][j] > largest) {
               largest = a[i][j];
               index1 = i;
               index2 = j;
            }
         }
      }
      result[0] = index1;
      result[1] = index2;
      return result;
   }
   
}
