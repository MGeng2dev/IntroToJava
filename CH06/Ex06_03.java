/** Palindrome Integer
 *  Write the methods with the following headers:
 *
 *    // Return the reversal of an integer, i.e., reverse(456) returns 654
 *    public static int reverse(int number)
 *
 *    // Return true if number is a palindrome
 *    public static boolean isPalindrome(int number)
 *
 *  Use the reverse method to implement isPalindrome. A number is a palindrome
 *  if its reversal is the same as itself. 
 *  Write a test program that prompts the user to enter an integer and reports
 *  whether the integer is a palindrome.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_03 {
   public static void main(String[] args) {
      // Create scanner & prompt user to enter integer
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int n = input.nextInt();
      
      // Call isPalindrome method & display result
      if (isPalindrome(n))
         System.out.print(n + " is a palindrome");
      else  
         System.out.print(n + " is NOT a palindrome. The reversal is " + reverse(n) + ".");
   }
   
    /** Method returns the reversal of an integer */
   public static int reverse(int number) {
      String numberReversed = ""; // reverse stored as string until returned
      // While loop thru all the digits except the last
      while (number >= 10) {
         int digit = number % 10;
         numberReversed = numberReversed + digit;
         number = number / 10;
      }
      numberReversed = numberReversed + number;
      return Integer.parseInt(numberReversed);
   }
   
    /** Method returns true if number is a palindrome */
   public static boolean isPalindrome(int number) {
      int numberReversed = reverse(number); // call reverse method
      // Compare to check for palindrome
      if (number == numberReversed)
         return true;
      else
         return false;  
   }
}