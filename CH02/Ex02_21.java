/** Financial application: calculate future investment value
 *  Write a program that reads in investment amount, annual interest rate, and number of years,
 *  and displays the future investment value using the following formula:
 *     futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numOfYears * 12)
 *  
 */
 
import java.util.Scanner;
 
public class Ex02_21 {
   public static void main(String[] args) {
      // Create scanner and get investment amount, interest rate, and years from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter investment amount: ");
      double investmentAmount = input.nextDouble();
      System.out.print("Enter annual interest rate in percentage: ");
      double annualInterestRate = input.nextDouble();
      System.out.print("Enter number of years: ");
      double numOfYears = input.nextDouble();
      
      // Calculate future investment value
      double monthlyInterestRate = annualInterestRate / 1200;
      double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numOfYears * 12));
      
      // Display result
      System.out.print("Accumulated value is $" + futureInvestmentValue);
      
   }
}