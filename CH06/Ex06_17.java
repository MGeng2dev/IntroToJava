/** Display Matrix of 0s and 1s
 *  Write a method that displays an n-by-n matrix using the following header:
 *
 *    public static void printMatrix(int n)
 *
 *  Each element is 0 or 1, which is generated randomly. Write a test program
 *  that prompts the user to enter n and displays an n-by-n matrix.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_17 {
   public static void main(String[] args) {
      // Create scanner and get n from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int n = input.nextInt();
      
      // Call method to print matrix
      printMatrix(n);
      
   }
   
    /** Method prints an n-by-n matrix */
   public static void printMatrix(int n) {
      for (int i = 1; i <= n; i++) { 
         for (int j = 1; j <= n; j++) {
            System.out.print((int)(0 + Math.random() * 2) + " ");
         }
         System.out.print("\n");  // start next row
      }
   }
}