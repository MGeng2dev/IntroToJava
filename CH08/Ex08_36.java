/** Latin Square 
 *  A Latin square is an n-by-n array filled with n different Latin letters, each occurring
 *  exactly once in each row and once in each column. Write a program that prompts the
 *  user to enter the number n and the array of characters, as shown in the sample output,
 *  and checks if the input array is a Latin square. The characters are the first n characters
 *  starting from A.
 *
 *     Test input for n = 4:
 *     A B C D B A D C C D B A D C A B
 *
 */
 
import java.util.Scanner;
 
public class Ex08_36 {
   public static void main(String[] args) {
      // Initialize
      Scanner input = new Scanner(System.in);
      
      // Prompt user
      System.out.print("Enter number n: ");
      int n = input.nextInt();
      char[][] m = new char[n][n];
      System.out.print("Enter " + n + " rows of letters separated by spaces: ");
      for (int i = 0; i < m.length; i++) {
         for (int j  = 0; j < m[0].length; j++) {
            m[i][j] = input.next().charAt(0);
         }
      }
      
      // Re-print original array
      System.out.print("Original array: \n");
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[i][j] + " ");
         }
         System.out.print("\n");
      }
      
      // Call method & display result
      if (isLatinSquare(m))
         System.out.print("\nThe input array is a Latin square");
      else
         System.out.print("\nThe input array is not a Latin square");
      
   }
   
    /** Checks for Latin square */
   public static boolean isLatinSquare(char[][] m) {
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            if (!isLatinSquare(i, j, m) || !validLetter(i, j, m)) {
               return false;
            }
         }
      }
      return true; // array must be latin square
   }
   
     /** Checks if m[i][j] is valid */
   public static boolean isLatinSquare(int i, int j, char[][] m) {
      // check whether m[i][j] is unique in i's row
      for (int col = 0; col < m.length; col++) {
         if (col != j && m[i][col] == m[i][j]) {
            return false;
         }
      }
   
      // check whether m[i][j] is unique in j's column
      for (int row = 0; row < m.length; row++) {
         if (row != i && m[row][j] == m[i][j]) {
            return false;
         }
      }
      
      return true;
   }
   
    /** Checks for valid letters */
   public static boolean validLetter(int i, int j, char[][] m) {
      int n = m.length;
      char[] validLetters = new char[n];
      validLetters[0] = 'A';
      for (int k = 1; k < m.length; k++) {
         validLetters[k] = (char)('A' + k);
      }
      boolean isValid = false;
      for (int k = 0; k < validLetters.length; k++) {
         if (m[i][j] == validLetters[k]) {
            return true;
         }
      }
      System.out.print("Wrong input: the letters must be from " + validLetters[0] + 
         " to " + validLetters[validLetters.length - 1]);
      return false;
   }
   
}