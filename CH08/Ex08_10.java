/** Largest Row And Column 
 *  Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix, 
 *  prints the matric, and finds the first row and column with the most 1s.
 *
 */
 
public class Ex08_10 {
   public static void main(String[] args) {
      // Initialize variables
      int[][] a = new int[4][4];
      
      // Randomly fill with 0s and 1s
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            a[i][j] = (int)(0 + Math.random() * 2);
         }
      }
      
      // Print matrix
      System.out.println("Matrix: ");
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            System.out.print(a[i][j] + " ");
         }
         System.out.print("\n");
      }
      
      // Call methods & print results
      System.out.println("Largest Row Index: " + largestRow(a));
      System.out.println("Largest Column Index: " + largestColumn(a));
      
   }   
      
    /** Returns largest row index */
   public static int largestRow(int[][] a) {
      int largestRowIndex = 0;
      int largestRowSum = 0;
      int currentRowSum = 0;
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            currentRowSum = currentRowSum + a[i][j];
         }
         if (currentRowSum > largestRowSum) {
            largestRowSum = currentRowSum;
            largestRowIndex = i;
         }
         currentRowSum = 0;
      }
      return largestRowIndex;
   }
   
    /** Returns largest column index */
   public static int largestColumn(int[][] a) {
      int largestColIndex = 0;
      int largestColSum = 0;
      int currentColSum = 0;
      for (int i = 0; i < a[0].length; i++) {
         for (int j = 0; j < a.length; j++) {
            currentColSum =+ a[j][i];
         }
         if (currentColSum > largestColSum) {
            largestColIndex = i;
         }
         currentColSum = 0;
      }
      return largestColIndex;
   }
   
}
