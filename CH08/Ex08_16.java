/** Sort Two-Dimensional Array
 *  Write a method to sort a two-dimensional array using the following header:
 *
 *    public static void sort(int m[][])
 *
 *  The method performs a primary sort on rows and a secondary sort on columns.
 *  For example, the following array
 *
 *    {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}}
 *
 *  will be sorted to
 *
 *    {{1, 1}, {1, 2}, {1, 7}, {4, 1}, {4, 2}, {4, 5}}
 *
 */
 
public class Ex08_16 {
   public static void main(String[] args) {
      // Initialize array
      int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
      // Print original array
      System.out.print("Original array: \n");
      for (int i = 0; i < m.length; i++) {
         System.out.println(java.util.Arrays.toString(m[i]));
      }
         
      // Call method
      sort(m);
      // Print sorted array
      System.out.print("Sorted array: \n");
      for (int i = 0; i < m.length; i++) {
         System.out.println(java.util.Arrays.toString(m[i]));
      }
      
   }
   
    /** Sorts array */
   public static void sort(int[][] m) {
      int[] currentMin; // currentMin is a 1D array (one row of m)
      int currentMinIndex;
     
     // Primary sort by row
      for (int i = 0; i < m.length - 1; i++) {
         currentMin = m[i];
         currentMinIndex = i;
         
         for (int j = i + 1; j < m.length; j++) {
            if (currentMin[0] > m[j][0]) {
               currentMin = m[j];
               currentMinIndex = j;
            }
         }
         
         // swap m[i] with currentMin if necessary
         if (currentMinIndex != i) {
            m[currentMinIndex] = m[i];
            m[i] = currentMin;
         }
      }
      
      // Secondary sort by column
      for (int i = 0; i < m.length - 1; i++) {
         currentMin = m[i];
         currentMinIndex = i;
         
         for (int j = i + 1; j < m.length; j++) {
            if (currentMin[0] == m[j][0] && currentMin[1] > m[j][1]) {
               currentMin = m[j];
               currentMinIndex = j;
            }
         }
         
         // swap m[i] with currentMin if necessary
         if (currentMinIndex != i) {
            m[currentMinIndex] = m[i];
            m[i] = currentMin;
         }
      }
      
   }
   
}
