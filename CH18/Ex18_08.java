/** Print The Digits In An Integer Reversely
 *  Write a recursive method that displays an int value reversely on the console
 *  using the following header:
 * 
 *     public static void reverseDisplay(int value)
 *
 *  For example, reverseDisplay(12345) displays (54321). Write a test program
 *  that prompts the user to enter an integer and displays its reversal.
 *
 */
 
import java.util.Scanner;
 
public class Ex18_08 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int value = input.nextInt();
      
      // Call method & display result
      System.out.print("Reversal: ");
      reverseDisplay(value);
      
   }
   
   /** Method to reverse digits in integer **/
   public static void reverseDisplay(int value) {
      if (value < 10)
         System.out.print(value);  // base case
      else {
         System.out.print(value % 10);
         reverseDisplay(value / 10);  // recursive call
      }
      
   }
   
}