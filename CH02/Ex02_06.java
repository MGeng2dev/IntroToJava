/** Sum the digits in an integer
 *  Write a program that reads an integer between 0 and 1000 and adds
 *  all the digits in the integer.
 *  For example, if the integer is 932, the sum of all digits is 14.
 *  Hint: Use the % operator to extract digits, and use the / operator
 *  to remove the extracted digit.
 *
 */
 
import java.util.Scanner;
 
public class Ex02_06 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number between 0 and 1000 (integer): ");
      int num = input.nextInt();
   
      // Perform math operations to sum digits
      int result = 0;
      int digit = 0;
      
      digit = num % 10;
      result = result + digit;
      
      num = num / 10;
      digit = num % 10;
      result = result + digit;
      
      num = num / 10;
      digit = num % 10;
      result = result + digit;
      
      // Display results
      System.out.print("The sum of the digits is " + result);
   
   }
}
      
