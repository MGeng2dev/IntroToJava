/** Financial Application: Compute The Future Investment Value
 *  Write a method that computes future investment value at a given interest rate for a 
 *  specified number of years. The future investment is determined using the formula in
 *  Programming Exercise 2.21.
 *  Use the following header: 
 *
 *     public static double futureInvestmentValue(double investmentAmount,
 *       double monthlyInterestRate, int years)
 *
 *  For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 *
 *  Write a test program that prompts the user to enter the investment amount (e.g., 1000)
 *  and the interest rate (e.g., 9%) and prints a table that displays future value for the
 *  years from 1 to 30, as shown.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_07 {
   public static void main(String[] args) {
      // Create a scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the investment amount: ");
      double investmentAmount = input.nextDouble();
      System.out.print("Enter the interest rate: ");
      double yearlyInterestRate = input.nextDouble();
      
      // Print table
      System.out.print("\nYears\t\tFuture Value");
      for (int i = 1; i <= 30; i++) {
         System.out.printf("\n%-5d", i);
         System.out.print("\t\t");
         double futureValue = futureInvestmentValue(investmentAmount, yearlyInterestRate / 1200, i);
         System.out.printf("%11.2f", futureValue);
      }
   }
   
    /** Method returns future value of an investment */
   public static double futureInvestmentValue(double investmentAmount, 
      double monthlyInterestRate, int years) {
      return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
   }
}
