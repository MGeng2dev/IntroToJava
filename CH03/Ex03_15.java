/** Game: lottery
 *  Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit number.
 *  The program prompts the user to enter a three-digit number and 
 *  determines whether the user wins according to the following rules:
 *     1. If the user input maches the lottery number in the exact order,
            the award is $10,000
       2. If all digits in the user input match all digits in the lottery number, 
            the award is $3,000
       3. If one digit in the user input matches a digit in the lottery number,
            the award is $1,000
 *
 */
 
import java.util.Scanner;
 
public class Ex03_15 {
   public static void main(String[] args) {
      // Create a scanner & get user guess
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three-digit interger: ");
      int guess = input.nextInt();
      
      // Generate lottery number
      int lottery = 100 + (int)(Math.random() * 900);
      
      // Get each digit of lottery number and guess number
      int l1 = lottery / 100;
      int l2 = (lottery - (l1 * 100)) / 10;
      int l3 = lottery - (l1 * 100) - (l2 * 10);
      
      int g1 = guess / 100;
      int g2 = (guess - (g1 * 100)) / 10;
      int g3 = guess - (g1 * 100) - (g2 * 10);
               
      // Determine if winner
      if (guess == lottery) // If guess matches lottery number exactly
         System.out.println("Winner! Lottery was " + lottery + ". Award is $10,000.");
      else if ((g1 == l1 && g2 == l3 && g3 == l2) ||  // if all digits of guess match all digits of lottery number
         (g1 == l2 && g2 == l1 && g3 == l3) || (g1 == l2 && g2 == l3 && g3 == l1) ||
         (g1 == l3 && g2 == l2 && g3 == l1) || (g1 == l3 && g2 == l1 && g3 == l2))
         System.out.println("Winner! Lottery was " + lottery + ". Award is $3,000.");
      else if (g1 == l1 || g1 == l2 || g1 == l3 || g2 == l1 || g2 == l2 || 
         g2 == l3 || g3 == l1 || g3 == l2 || g3 == l3) // if one digit of guess matches one digit of lottery number
         System.out.println("Winner! Lottery was " + lottery + ". Award is $1,000.");
      else
         System.out.println("Sorry, you are not a winner. Lottery was " + lottery + ".");
      
   }
}