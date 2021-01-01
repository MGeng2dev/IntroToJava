/** Display Patterns
 *  Write a method to display a pattern as follows: 
 *
 *                  1
 *                2 1
 *              3 2 1 
 *    ....
 *    n n-1 ... 3 2 1
 *
 *  The method header is:
 *    
 *    public static void displayPattern(int n)
 *
 */
 
import java.util.Scanner;
 
public class Ex06_06 {
   public static void main(String[] args) {
      // Create a scanner & get integer from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int n = input.nextInt();
      
      // Call method to print pattern
      displayPattern(n);
   }
   
    /** Method prints a pattern of integers */
   public static void displayPattern(int n) {
      for (int i = 1; i <= n; i++) { // outer loop controls the rows
         for (int j = (n - i); j > 0; j--) { // whitespace before numbers on each row
            System.out.print("  ");
         }
         for (int k = i; k > 0; k--) { // numbers on each row
            System.out.print(k + " ");
         }
         System.out.println();  // go to next line after inner loops execute
      }
   }
}