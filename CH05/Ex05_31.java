/** Financial Application: Compute CD Value
 *  Suppose you put $10,000 into a CD with an annual percentage yield of 5.75%. After one
 *  month, the CD is worth:
 * 
 *    10000 + 10000 * 5.75 / 1200 = 10047.92
 *
 *  After two months, the CD is worth:
 *
 *    10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
 *
 *  After three months, the CD is worth:
 * 
 *    100.96.06 + 10096.06 * 5.75 / 1200 = 10144.44
 * 
 *  ...and so on.
 *
 *  Write a program that prompts the user to enter an amount (e.g., 10000), the annual
 *  percentage yield (e.g., 5.75), and the number of months (e.g., 18) and displays a 
 *  table as shown in the sample run.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_31 {
   public static void main(String[] args) {
      // Create a scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user for inputs
      System.out.print("Enter the initial deposit amount: ");
      double initialAmount = input.nextInt();
      System.out.print("Enter annual percentage yield: ");
      double annualInterestRate = input.nextDouble();
      System.out.print("Enter maturity period (number of months): ");
      int numOfMonths = input.nextInt();
      
      // Intialize and declare other variables
      double monthlyInterestRate = annualInterestRate / 1200;
      double balance = initialAmount;
      
      // Print table heading
      System.out.print("\nMonth\t\tCD Value");
      
      // For loop to calculate values for table
      for (int i = 1; i <= numOfMonths; i++) {
         balance = balance + balance * monthlyInterestRate;
         // Print row
         System.out.printf("\n%-5d\t\t$%-5.2f", i, balance);     
      }
      
   }
}
