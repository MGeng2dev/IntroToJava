/** Column Sorting 
 *  Implement the following method to sort the columns in a two-dimensional array.
 *  A new array is returned and the original array is intact.
 *  
 *    public static double[][] sortColumns(double[][] m)
 *
 *  Write a test program that prompts the user to enter a 3x3 matrix of double values
 *  and displays a new column-sorted matrix.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_27 {
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
            System.out.printf("%5.3f ", m[i][j]);
         }
         System.out.print("\n");
      }
      
      // Call method & display result
      double[][] mSorted = sortColumns(m);
      System.out.print("The column-sorted array is: \n");
      for (int i = 0; i < mSorted.length; i++) {
         for (int j = 0; j < mSorted[0].length; j++) {
            System.out.printf("%5.3f ", mSorted[i][j]);
         }
         System.out.print("\n");
      }
      
   }
   
    /** Sorts matrix columns */
   public static double[][] sortColumns(double[][] m) {
      // Create a new matrix & copy values from m
      double[][] mSorted = new double[m.length][m[0].length];
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            mSorted[i][j] = m[i][j];
         }
      }
      
      // Sort columns 
      for (int k = 0; k < mSorted[0].length; k++) {  // k is the current column index
      
         for (int i = 0; i < mSorted[0].length - 1; i++) {  // i is the current element in the column
            double currentMin = mSorted[i][k];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < mSorted.length; j++) { // j is the element being compared to i
               if (currentMin > mSorted[j][k]) {
                  currentMin = mSorted[j][k];
                  currentMinIndex = j;
               }
            }
            
            // swap mSorted[k][j] with currentMin if necessary
            if (currentMinIndex != i) {
               mSorted[currentMinIndex][k] = mSorted[i][k];
               mSorted[i][k] = currentMin;
            }
         }
      }
      
      return mSorted;
     
   }
 
}