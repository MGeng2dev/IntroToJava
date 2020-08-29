/** Game: heads or tails
 *  Write a program that lets the user guess whether the flip of a coin
 *  results in heads or tails. The program randomly generates an integer 0 or 1, 
 *  which represents head or tail. The program prompts the user to enter a 
 *  guess and reports whether the guess is correct or incorrect.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_14 {
   public static void main(String[] args) {
      // Create scanner and prompt user input
      Scanner input = new Scanner(System.in);
      System.out.print("Coin flipped! Enter 0 to guess heads, 1 to guess tails: ");
      int guess = input.nextInt();
      
      // Generate random integer
      int coin = (int)(Math.random() * 2);
      
      // Display results
      if (guess == coin) 
         System.out.print("Correct! Coin was " + (coin == 0 ? "heads" : "tails"));
      else  
         System.out.print("Incorrect! Coin was " + (coin == 0 ? "heads" : "tails"));
      
   }
}