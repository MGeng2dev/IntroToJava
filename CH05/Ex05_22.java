/** Financial Application: Loan Amortization Schedule
 *  The monthly payment for a given loan pays the prinicipal and the interest. The
 *  monthly interest is computed by multiplying the monthly interest rate and the
 *  balance (the remaining principal). The principal paid for the month is therefore
 *  the monthly payment minus the monthly interest. Write a program that lets the
 *  user enter the loan amount, number of years, and interest rate and display the
 *  amortization schedule for the loan.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex05_22 {
   public static void main(String[] args) {
      // Create scanner
      Scanner input = new Scanner(System.in);
      
      // Get loan info from user
      System.out.print("Loan amount: ");
      double loanAmount = input.nextDouble();
      System.out.print("Number of Years: ");
      int numOfYears = input.nextInt();
      System.out.print("Annual Interest Rate: ");
      double annualIntRate = input.nextDouble();
      
      // Initialize/declare variables
      double monthlyIntRate = annualIntRate / 1200; 
      double interestPayment, principal;
      double balance = loanAmount;
      double monthlyPayment = loanAmount * monthlyIntRate / (1 - 1 / Math.pow(1 +
            monthlyIntRate, numOfYears * 12)); // monthly payment does not change
      double totalPayment = monthlyPayment * numOfYears * 12;
      
      // Display monthly payment & total payment
      System.out.println();
      System.out.printf("Monthly Payment: $%5.2f", monthlyPayment);
      System.out.printf("\nTotal Payment: $%8.2f", totalPayment);
      System.out.println();
      
      // Use for loop to calculate amounts for each payment
      System.out.print("\nPayment#\t\tInterest\t\tPrincipal\t\tBalance");
      for (int payment = 1; payment <= 12; payment++) {
         // Calculate table values 
         interestPayment = monthlyIntRate * balance;
         principal = monthlyPayment - interestPayment;
         balance -= principal; // update remaining balance
         // Print row
         System.out.printf("\n%-8d\t\t%-8.2f\t\t%-9.2f\t\t%7.2f", payment, interestPayment, principal, balance);
      }
      
   }
}