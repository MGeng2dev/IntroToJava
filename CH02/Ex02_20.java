/** Financial application: calculate interest
 *  If you know the balance and the annual percentage interest rate, you can compute
 *  the interest on the next monthly patment using the following formula:
 *     interest = balance * (annualInterestRate / 1200)
 * 
 *  Write a program that reads the balance and the annual percentage interest rate
 *  and displays the interest for the next month.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex02_20 {
   public static void main(String[] args) {
      // Create sccanner and get ba;ance and interest rate from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
      double balance = input.nextDouble();
      double annualInterestRate = input.nextDouble();
      
      // Calculate interest
      double interest = balance * (annualInterestRate / 1200);
      
      // Display result
      System.out.print("The interest is " + interest);
      
   }
}