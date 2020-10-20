/** Financial Application: Compare Loans With Various Interest Rates
 *  Write a program that lets the user enter the loan amount and load period in 
 *  number of years and displays the monthly and total payments for each interest
 *  rate starting from 5% to 8%, with an increment of 1/8. 
 *
 *  For the formula to compute monthly payment, see Listing 2.9, ComputeLoan.java.
 *
 *     Math.pow(1 + monthlyInterestRate, numberOfYears * 12)
 *
 */
 
import java.util.Scanner;
 
public class Ex05_21 {
   public static void main(String[] args) {
      // Create a scanner
      Scanner input = new Scanner(System.in);
      
      // Get loan info from user
      System.out.print("Loan Amount: ");
      double loanAmount = input.nextDouble();
      System.out.print("Number of Years: ");
      int numOfYears = input.nextInt();
   
      // Initialize variables
      double annualIntRate, monthlyIntRate, monthlyPayment;
      double totalPayment = 0;
      
      // Print table header
      System.out.print("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
      
      // Use for loop to calculate monthly payment & total payment for each interest rate
      for (annualIntRate = 5.000; annualIntRate <= 8; annualIntRate += 0.125) {
         monthlyIntRate = annualIntRate / 1200; 
         monthlyPayment = loanAmount * monthlyIntRate / (1 - 1 / Math.pow(1 +
            monthlyIntRate, numOfYears * 12));
         totalPayment = monthlyPayment * numOfYears * 12;
         // Display results
         System.out.printf("\n%-4.3f%%\t\t\t\t%-5.2f\t\t\t\t\t%-7.2f", annualIntRate, monthlyPayment,
            totalPayment);
      }
      
   }
}