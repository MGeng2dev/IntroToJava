/** Financial application: monetary units
 *  Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only, 
 *  using singular words for single units such as 1 dollar and 1 penny, and plural words
 *  for more than one unit such as 2 dollars and 3 pennies.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_07 {
   public static void main(String[] args) {
      // Create a scanner and receive the amount
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an amount in double, for example 11.56: ");
      double amount = input.nextDouble();
      
      int remainingAmount = (int)(amount * 100);
      
      // Find the number of one dollars
      int numberOfDollars = remainingAmount / 100;
      remainingAmount = remainingAmount % 100;
      
      // Find the number of quarters in the remaining amount
      int numberOfQuarters = remainingAmount / 25;
      remainingAmount = remainingAmount % 25;
      
      // Find the number of dimes in the remaining amount
      int numberOfDimes = remainingAmount / 10;
      remainingAmount = remainingAmount % 10;
      
      // Find the number of nickels in the reamining amount
      int numberOfNickels = remainingAmount / 5;
      remainingAmount = remainingAmount % 5;
      
      // Find the number of pennies in the remaining amount
      int numberOfPennies = remainingAmount;
      
      // Display results
      System.out.println("Your amount $" + amount + " consists of: ");
      System.out.println("    " + numberOfDollars + ((numberOfDollars == 1) ? " Dollar" : " Dollars"));
      System.out.println("    " + numberOfQuarters + ((numberOfQuarters == 1) ? " Quarter" : " Quarters"));
      System.out.println("    " + numberOfDimes + ((numberOfDimes == 1) ? " Dime" : " Dimes"));
      System.out.println("    " + numberOfNickels + ((numberOfNickels == 1) ? " Nickel" : " Nickels"));
      System.out.println("    " + numberOfPennies + ((numberOfPennies == 1) ? " Penny" : " Pennies"));
   }
}