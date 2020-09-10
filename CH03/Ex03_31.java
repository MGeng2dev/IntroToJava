/** Financials: Currency Exchange
 *  Write a program that prompts the user to enter the exchange rate
 *  from currency in U.S. dollars to Chinese RMB. Prompt the user
 *  to enter 0 to convert from U.S. dollars to Chinese RMB and 1
 *  to convert from Chinese EMB to U.S. dollars. Prompt the user
 *  to enter the amount in U.S. dollars or Chinese RMB to conver
 *  it to Chinese RMB or U.S. dollars, respectively. 
 *
 */
 
import java.util.Scanner;
 
public class Ex03_31 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the exchange rate from dollars to RMB: ");
      double rate = input.nextDouble();
      System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
      int conversion = input.nextInt();
      
      // If user entered 0 (dollars to RMB)
      if (conversion == 0) {
         System.out.print("Enter the dollar amount: ");
         double amt = input.nextDouble();
         System.out.print("$" + amt + " is " + (amt * rate) + " yuan");
      }
      
      // If user entered 1 (RMB to dollars)
      if (conversion == 1) {
         System.out.print("Enter the RMB amount: ");
         double amt = input.nextDouble();
         System.out.print(amt + " yuan is $" + (amt / rate));
      }
     
   }
}
