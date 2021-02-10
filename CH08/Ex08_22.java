/** Even Number of 1s
 *  Write a program that generates a 6x6 matrix filled with 0s and 1s, displays the matrix, 
 *  and checks if every row and every column have an even number of 1s.
 *
 */
 
public class Ex08_22 {
   public static void main(String[] args) {
      // Intialize array
      int[][] m = new int[6][6];
      // Randomly fill with 0s and 1s
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            m[i][j] = (int)(Math.random() * 2);
         }
      }
      // Print array
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[i][j] + " ");
         }
         System.out.print("\n");
      }
      
      // Check if every row & col has even number of 1s
      if (!checkForOnes(m))   
         System.out.print("All rows and columns do not have an even number of 1s");
      else
         System.out.print("All rows and columns have an even number of 1s");
      
      
   }
   
    /** Checks all rows and columns for even number of 1s */
   public static boolean checkForOnes(int[][] m) {
      // Check rows
      int rowOnesCount = 0;
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            if (m[i][j] == 1) {
               rowOnesCount++;
            }
         }
         if (rowOnesCount % 2 != 0) {
            return false;
         }
         rowOnesCount = 0;
      }
      
      // Check columns
      int colOnesCount = 0;
      for (int i = 0; i < m[0].length; i++) {
         for (int j = 0; j < m.length; j++) {
            if (m[j][i] == 1) {
               colOnesCount++;
            }
         }
         if (colOnesCount % 2 != 0) {
            return false;
         }
         colOnesCount = 0;
      } 
      
      return true; 
   }
   
}
            
