/** Display An Integer Reversed
 *  Write a method with the following header to display an integer in reverse order:
 * 
 *    public static void reverse(int number)
 *
 *  For example, reverse(3456) displays 6543. 
 *  Write a test program that prompts the user to enter an integer and displays its
 *  reversal.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_04 {
   public static void main(String[] args) {
      // Create scanner & prompt user to enter an integer
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int n = input.nextInt();
      
      // Call method & display result
      System.out.print("Reversal: ");
      reverse(n);
   }
   
    /** Method returns the reversal of an integer */
   public static void reverse(int number) {
      // While loop thru all the digits except the last
      while (number >= 10) {
         System.out.print(number % 10); // print last digit
         number = number / 10; // remove last digit from number
      }
      System.out.print(number); // print last number
   }
}