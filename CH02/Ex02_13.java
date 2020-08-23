/** Financial application: compound value
 *  Suppose you save $100 each month into a savings account with the annual
 *  interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417.
 *  After the first month, the value in the account becomes:
 *     100 * (1 + 0.00417) = 100.417
 *  After the second month, the value in the account becomes:
 *     (100 + 100.417) * (1 + 0.00417) = 201.252
 *  After the third month, the value in the account becomes:
 *     (100 + 201.252) * (1 + 0.00417) = 302.507
 *  and so on...
 * 
 *  Write a program that prompts the user to enter a monthly saving amount and
 *  displays the account value after the sixth month. 
 * 
 */
 
import java.util.Scanner;
 
public class Ex02_13 {
   public static void main(String[] args) {
      // Create scanner and get monthly savings amount from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the monthly saving amount: ");
      double monthlySavings = input.nextInt();
      
      // Calculate the account value after 6th month
      double accountValue = 0;
      accountValue = 100 * (1 + 0.00417); // value after 1st month
      accountValue = (100 + accountValue) * (1 + 0.00417); // value after 2nd month
      accountValue = (100 + accountValue) * (1 + 0.00417); // value after 3rd month
      accountValue = (100 + accountValue) * (1 + 0.00417); // value after 4th month
      accountValue = (100 + accountValue) * (1 + 0.00417); // value after 5th month
      accountValue = (100 + accountValue) * (1 + 0.00417); // value after 6th month
      
      // Display result
      System.out.print("After the sixth month, the account value is $" + accountValue);
      
   }
}