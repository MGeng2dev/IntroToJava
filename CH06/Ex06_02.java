/** Sum The Digits In An Integer
 *  Write a method that computes the sum of the digits in an integer. Use the following
 *  method header:
 *
 *    public static int sumDigits(long n)
 *
 *  For example, sumDigits(234) returns 9 (2+3+4). 
 *  Hint: Use the % operator to extract digits, and / operators to remove the extracted
 *  digit. For instance, to extract 4 from 234, use % 10 = 4. To remove 4 from 234, use
 *  234 / 10 = 23. Use a loop to repeatedly extract and remove the digit until all the 
 *  digits are extracted. 
 *  
 *  Write a test program that prompts the user to enter an integer and displays the sum
 *  of all its digits.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex06_02 { 
   public static void main(String[] args) {
      // Create scanner and prompt user for integer
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int n = input.nextInt(); 
      
      // Call method & display result
      System.out.print("The sum of the digits in " + n + " is " + sumDigits(n));
      
   }
   
    /** Method returns the sum of the digits of a integer */
   public static long sumDigits(long n) {
      long sum = 0; 
      
      // While loop to go thru all digits 
      while (n >= 1) {
         long digit = n % 10; // extract last digit
         sum = sum + digit; // add last digit to sum
         n = n / 10; // remove last digit
      }
      return sum;  
   }
   
}