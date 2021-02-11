/** Row Sorting
 *  Implement the following method to sort the rows in a two-dimensional array. A new
 *  array is returned and the original array is intact.
 *
 *    public static double[][] sortRows(double[][] m)
 *
 *  Write a test program that prompts the user to enter a 3x3 matric of double values
 *  and displays a new row-sorted matrix.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_26 {
   public static void main(String[] args) {
      // Initialize
      double[][] m = new double[3][3];
      Scanner input = new Scanner(System.in);
      
      // Prompt user
      System.out.print("Enter a 3-by-3 matrix row by row: ");
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            m[i][j] = input.nextDouble();
         }
      }
      
      // Display original array
      System.out.print("You entered: \n");
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[i][j] + " ");
         }
         System.out.print("\n");
      }
      
      // Call method & display result
      double[][] mSorted = sortRows(m);
      System.out.print("The row-sorted array is: \n");
      for (int i = 0; i < mSorted.length; i++) {
         for (int j = 0; j < mSorted[0].length; j++) {
            System.out.print(mSorted[i][j] + " ");
         }
         System.out.print("\n");
      }
      
   }
   
    /** Sorts matrix rows */
   public static double[][] sortRows(double[][] m) {
      // Create a new matrix & copy values from m
      double[][] mSorted = new double[m.length][m[0].length];
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            mSorted[i][j] = m[i][j];
         }
      }
      
      // Sort rows 
      for (int k = 0; k < mSorted.length; k++) {  // k is the row index
      
         for (int i = 0; i < mSorted.length - 1; i++) {  // i is the current element in the row
            double currentMin = mSorted[k][i];
            int currentMinIndex = i;
         
            for (int j = i + 1; j < mSorted[0].length; j++) { // j is the element being compared to i
               if (currentMin > mSorted[k][j]) {
                  currentMin = mSorted[k][j];
                  currentMinIndex = j;
               }
            }
            
            // swap m[k][i] with currentMin if necessary
            if (currentMinIndex != i) {
               mSorted[k][currentMinIndex] = mSorted[k][i];
               mSorted[k][i] = currentMin;
            }
         }
      }
   
      return mSorted;
   
   }
   
}