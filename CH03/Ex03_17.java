/** Game: scissor, rock, paper
 *  Write a program that plays the popular scissor-rock-paper game. 
 *  (A scissor can cut a paper, a rock can knock a scissor, and a paper
 *  can wrap a rock.) 
 *  The program randomly generates a number 0, 1 or 2 representing scissor, rock,
 *  and paper. The program prompts the user to enter a number 0, 1, or 2 and
 *  displays a message indicating whether the user or the computer wins, 
 *  loses, or draws.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_17 {
   public static void main(String[] args) {
      // Create a scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 0 (scissor), 1 (rock), or 2 (paper): " );
      int user = input.nextInt();
      
      // Generate random integer 0, 1, or 2
      int computer = (int)(Math.random() * 3);
      
      // Display result
      if (computer == 0) { // computer is scissor 
         System.out.print("The computer is scissor. ");
         if (user == 0)
            System.out.print("You are scissor too. It is a draw.");
         else if (user == 1)
            System.out.print("You are rock. You won.");
         else if (user == 2)
            System.out.print("You are paper. You lose.");
      }
      if (computer == 1) {  // computer is rock
         System.out.print("The computer is rock. ");
         if (user == 0) 
            System.out.print("You are scissor. You lose.");
         else if (user == 1) 
            System.out.print("You are rock too. It is a draw.");
         else if (user == 2) 
            System.out.print("You are paper. You win.");
      }
      if (computer == 2) { // computer is paper
         System.out.print("The computer is paper. ");
         if (user == 0) 
            System.out.print("You are scissor. You win.");
         else if (user == 1) 
            System.out.print("You are rock. You lose.");
         else if (user == 2) 
            System.out.print("You are paper too. It is a draw.");
      }
         
   }
}
