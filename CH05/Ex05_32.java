/** Game: Lottery 
 *  Revise Listing 3.8, Lottery.java, to generate a lottery of a two-digit number. The two
 *  digits in the number are distinct. (Hint: Generate the first digit. Use a loop to 
 *  continuously generate the second digit until it is different from the first digit.)
 *
 */
 
import java.util.Scanner;
 
public class Ex05_32 {
   public static void main(String[] args) {
      // Create a scanner
      Scanner input = new Scanner(System.in);
      
      // Generate a lottery number
      int firstDigit = (int)(Math.random() * 10);
      int secondDigit = (int)(Math.random() * 10);
      while (secondDigit == firstDigit) {
         secondDigit = (int)(Math.random() * 10);
      }
      
      // Prompt the user to enter a guess
      System.out.print("Enter your lottery pick (two digits): ");
      int guess = input.nextInt();
      int firstDigitGuess = guess / 10;
      int secondDigitGuess = guess % 10;
      
      System.out.print("\nThe lottery number is: " + firstDigit + secondDigit);
      
      // Check the guess
      if (firstDigitGuess == firstDigit && secondDigitGuess == secondDigit) {
         System.out.print("\nExact match: You win $10,000");
      }
      else if (firstDigitGuess == secondDigit && secondDigitGuess == firstDigit) {
         System.out.print("\nMatch all digits: You win $3,000");
      }
      else if (firstDigitGuess == firstDigit || firstDigitGuess == secondDigit ||
         secondDigitGuess == firstDigit || secondDigitGuess == secondDigit) {
         System.out.print("\nMatch one digit: You win $1,000");
      }
      else { 
         System.out.print("\nSorry, no match");
      }

   }
}