/** Financial Application: Compound Value
 *  Suppose you save $100 each month into a savings account with the annual interest rate 5%.
 *  So, the monthly interest rate is 0.05 / 12 = 0.00417. After the first month, the value 
 *  in the account becomes:
 *     100 * (1 + 0.00417) = 100.417
 *
 *  After the second month, the value in the account becomes:
 *     (100 + 100.417) * (1 + 0.00417) = 201.52
 *
 *  After the third month, the value in the account becomes:
 *     (100 + 201.252) * (1 + 0.00417) = 302.507
 *
 *  and so on.
 *  Write a program that prompts the user to enter an amount (e.g., 100), the annual interest
 *  rate (e.g., 5), and the number of months (e.g., 6) and displays the amount in the savings
 *  acount after the given month.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_30 {
   public static void main(String[] args) {  
      // Create a scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter info
      System.out.print("Enter an amount: ");
      double amount = input.nextDouble();
      System.out.print("Enter annual interest rate: ");
      double annualInterestRate = input.nextInt();
      System.out.print("Enter number of months: ");
      int numOfMonths = input.nextInt();
      
      // Initialize/ declare variables
      double balance = 0;
      double monthlyInterestRate = annualInterestRate / 1200;
      
      // For loop to calculate compound value
      for (int i = 0; i < numOfMonths; i++) {
         balance = (amount + balance) * (1 + monthlyInterestRate);
      }
      
      // Display results
      System.out.printf("Account balance after %d months: $%-6.2f", numOfMonths, balance);
      
   }
}