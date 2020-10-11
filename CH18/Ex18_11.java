/** Sum The Digits In An Integer Using Recursion
 *  Write a recursive method that computes the sum of the digits in an integer.
 *  Use the following method header:
 *
 *     public static int sumDigits(long n);
 *
 *  For example, sumDigits(234) returns 2 + 3 + 4 = 9. 
 *  Write a test program that prompts the user to enter an integer and displays its sun.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex18_11 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a integer: ");
      int n = input.nextInt();
      
      // Call method and display result
      System.out.print("Sum of digits: " + sumDigits(n));
      
   }
   
   public static long sumDigits(long n) {
      if (n < 10)
         return n;
      
      else
         return (n % 10) + sumDigits(n / 10);
         
   }
   
}