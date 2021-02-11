/** Game: Find The Flipped Cell
 *  Suppose you are given a 6x6 matrix filled with 0s and 1s. All rows and all columns have
 *  an even number of 1s. Let the user flip one cell (i.e., flip from 1 to 0 or from 0 to 1) 
 *  and write a program to find which cell was flipped. Your program should prompt the user
 *  to enter a 6x6 array with 0s and 1s and find the first row r and first column c where the
 *  even number of the 1s property is violated (i.e., the number of 1s is not even). The
 *  flipped cell is at (r, c).
 *
 */
 
import java.util.Scanner;
 
public class Ex08_23 {
   public static void main(String[] args) {
      // Initialize
      int size = 6;
      int[][] m = new int[size][size];
      Scanner input = new Scanner(System.in);
      
      // Prompt user
      System.out.print("Enter a " + size + "-by-" + size + " matrix row by row: ");
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            m[i][j] = input.nextInt();
         }
      }
      
      // Print array
      System.out.print("You entered: \n");
      for (int i = 0; i < m.length; i++) {
         System.out.println(java.util.Arrays.toString(m[i]));
      }
      
      // Call method & display result
      int[] result = findFlippedCell(m);
      System.out.print("The flipped cell is at (" + result[0] + ", " + result[1] + ")");
      
   }
   
    /** Find flipped cell */
   public static int[] findFlippedCell(int[][] m) {
      // Initialize
      int[] flippedCell = new int[2];
      
      // Check rows
      int rowOnesCount = 0;
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            if (m[i][j] == 1) {
               rowOnesCount++;
            }
         }
         if (rowOnesCount % 2 != 0) {
            flippedCell[0] = i;
         }
         rowOnesCount = 0;
      }
      
      // Chekc cols
      int colOnesCount = 0;
      for (int i = 0; i < m[0].length; i++) {
         for (int j = 0; j < m.length; j++) {
            if (m[j][i] == 1) {
               colOnesCount++;
            }
         }
         if (colOnesCount % 2 != 0) {
            flippedCell[1] = i;
         }
         colOnesCount = 0;
      }
      
      return flippedCell;
   }
   
}