/** Financial Application: Payroll
 *  Write a program that reads the following information and prints a payroll statement:
 *
 *     Employee's name (e.g., Smith)
 *     Number of hours worked in a week (e.g., 10)
 *     Hourly pay rate (e.g., 9.75)
 *     Federal tax withholding rate (e.g., 20%)
 *     State tax withholding rate (e.g., 9%)
 *
 */
 
import java.util.Scanner;
 
public class Ex04_23 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter employee's name: ");
      String name = input.next();
      System.out.print("Enter number of hours worked in a week: ");
      double hours = input.nextDouble();
      System.out.print("Enter hourly pay rate: ");
      double rate = input.nextDouble();
      System.out.print("Enter federal tax withholding rate: ");
      double fedtax = input.nextDouble();
      System.out.print("Enter state tax withholding rate: ");
      double statetax = input.nextDouble();
      
      // Calculate payroll statement items
      double gross = rate * hours;
      double fedwithhold = gross * fedtax;
      double statewithhold = gross * statetax;
      double totalded = fedwithhold + statewithhold;
      double netpay = gross - totalded;
      
      // Display payroll statement
      System.out.print("Employee Name: " + name);
      System.out.printf("\nHours Worked: %4.1f", hours);
      System.out.printf("\nPay Rate: $%4.2f", rate);
      System.out.printf("\nGross Pay: $%4.2f", gross);
      System.out.print("\nDeductions: ");
      System.out.printf("\n   Federal Withholding (%3.1f%%): $%4.2f", (fedtax * 100), fedwithhold);
      System.out.printf("\n   State Withholding (%3.1f%%): $%4.2f", (statetax * 100), statewithhold);
      System.out.printf("\n   Total Deduction: $%4.2f", totalded);
      System.out.printf("\nNet Pay: $%4.2f", netpay);
   }
}