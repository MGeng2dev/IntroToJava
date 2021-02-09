/** Shuffle Rows
 *  Write a method that shuffles the rows in a two-dimensional int array using the following header:
 *
 *    public static void shuffle(int[][] m)
 *
 *  Write a test program that shuffles the following matrix:
 *
 *    int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 *
 */
 
public class Ex08_18 {
   public static void main(String[] args) {
      // Initialize 
      int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
      // Print original array
      System.out.print("Original array: \n");
      for (int i = 0; i < m.length; i++) {
         System.out.println(java.util.Arrays.toString(m[i]));
      }
      
      // Call method
      suffle(m);
      // Print shuffled array
      System.out.print("Shuffled array: \n");
      for (int i = 0; i < m.length; i++) {
         System.out.println(java.util.Arrays.toString(m[i]));
      }
      
   }
   
    /** Shuffle rows */
   public static void suffle(int[][] m) {
      for (int i = 0; i < m.length; i++) {
         int randomRow = (int)(Math.random() * m.length);
         int[] temp = m[i];
         m[i] = m[randomRow];
         m[randomRow] = temp;
      }
   }
   
}