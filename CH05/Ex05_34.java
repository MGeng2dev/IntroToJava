/** Game: Scissor, Rock, Paper
 *  Programming Exercise 3.17 gives a program that plays the scissor-rock-paper
 *  game. Revise the program to let the user continuously play until either the 
 *  user or the computer wins more than two times than its opponent.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_34 { 
   public static void main(String[] args) {
      // Create a scanner & initialize variables
      Scanner input = new Scanner(System.in);
      int userWins = 0;
      int computerWins = 0;
      
      // While loop stops when difference between scores > 2
      while (Math.abs(computerWins - userWins) <= 2) {
         // Prompt user to make their selection
         System.out.print("\nEnter 0 (scissor), 1 (rock), or 2 (paper): " );
         int user = input.nextInt();
       
         // Generate random integer 0, 1, or 2
         int computer = (int)(Math.random() * 3);
      
         // Display result
         if (computer == 0) { // computer is scissor 
            System.out.print("The computer is scissor. ");
            if (user == 0) {
               System.out.print("You are scissor too. It is a draw.");
            }
            else if (user == 1) {
               System.out.print("You are rock. You won.");
               userWins++;
            }
            else if (user == 2) {
               System.out.print("You are paper. You lose.");
               computerWins++;
            }
         }
         if (computer == 1) {  // computer is rock
            System.out.print("The computer is rock. ");
            if (user == 0) {
               System.out.print("You are scissor. You lose.");
               computerWins++;
            }
            else if (user == 1) {
               System.out.print("You are rock too. It is a draw.");
            }   
            else if (user == 2) {
               System.out.print("You are paper. You win.");
               userWins++;
            }
         }
         if (computer == 2) { // computer is paper
            System.out.print("The computer is paper. ");
            if (user == 0) {
               System.out.print("You are scissor. You win.");
               userWins++;
            }
            else if (user == 1) {
               System.out.print("You are rock. You lose.");
               computerWins++;
            } 
            else if (user == 2) {
               System.out.print("You are paper too. It is a draw.");
            }
         }
                    
      }
      
      // Display final score
      System.out.print("\nFinal score - You: " + userWins + ", Computer: " + computerWins);
   
   }
}