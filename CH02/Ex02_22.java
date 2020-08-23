/** Financial application: monetary units
 *  Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when 
 *  converting a double value to an int value. Enter the input as an integer whose
 *  last two digits represent the cents.
 *
 */
 
import java.util.Scanner;
 
public class Ex02_22 {
   public static void main(String[] args) {
      // Create scanner and get input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integer amount with last two digits representing cents: ");
      int inputAmt = input.nextInt();
      
      // Calculate monetary units
      int remainingAmt = inputAmt;
      int numOfDollars = inputAmt / 100;
      remainingAmt = remainingAmt % 100;
      
      int numOfQuarters = remainingAmt / 25;
      remainingAmt = remainingAmt % 25;
      
      int numOfDimes = remainingAmt / 10;
      remainingAmt = remainingAmt % 10;
      
      int numOfNickels = remainingAmt / 5;
      remainingAmt = remainingAmt % 5;
      
      int numOfPennies = remainingAmt;
      
      // Display result
      System.out.println("Your amount " + inputAmt + " consists of");
      System.out.println("    " + numOfDollars + " dollars");
      System.out.println("    " + numOfQuarters + " quarters");
      System.out.println("    " + numOfDimes + " dimes");
      System.out.println("    " + numOfNickels + " nickels");
      System.out.println("    " + numOfPennies + " pennies");
      
   }
}