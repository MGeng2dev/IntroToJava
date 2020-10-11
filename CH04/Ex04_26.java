/** Financial Application: Monetary Units
 *  Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when
 *  converting a float value to an int value. Read the input as a string suchs as "11.56".
 *  Your program should extract the dollar amount before the decimal point and the cents
 *  after the decimal amount using the indexOf and substring methods.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_26 {
   public static void main(String[] args) {
      // Create a scanner
      Scanner input = new Scanner(System.in);
      
      // Receive the amount
      System.out.print("Enter an amount in string, for example 11.56: ");
      String s = input.next();
      
      // Convert string to doubles for dollars & cents
      int decimalIndex = s.indexOf(".");
      int dollars = Integer.parseInt(s.substring(0, decimalIndex));
      int cents = Integer.parseInt(s.substring(decimalIndex + 1));
      
      // Find number of one dollars
      int numberOfOneDollars = dollars;
      
      // Find the number of quarters
      int numberOfQuarters = cents / 25;
      cents = cents % 25;
      
      // Find the number of dimes
      int numberOfDimes = cents / 10;
      cents = cents % 10;
      
      // Find the number of nickels
      int numberOfNickels = cents / 5;
      cents = cents % 5;
      
      // Find the number of pennies
      int numberOfPennies = cents;
      
      // Display results
      System.out.print("Your amount $" + s + " consists of" + 
         "\n\t" + numberOfOneDollars + (numberOfOneDollars == 1 ? " dollar" : " dollars") +
         "\n\t" + numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters") +
         "\n\t" + numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes") +
         "\n\t" + numberOfNickels + (numberOfNickels == 1 ? " nickel" : " nickels") +
         "\n\t" + numberOfPennies + (numberOfPennies == 1 ? " penny" : " pennies"));
   }
}