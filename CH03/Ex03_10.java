/** Game: addition quiz
 *  Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
 *  Revise the program to randomly generate an addition question with 
 *  two integers less than 100.
 *
 */

import java.util.Scanner;

public class Ex03_10 {
   public static void main(String[] args) {
      // Generate two random integers less than 100
      int num1 = (int)(Math.random() * 100);
      int num2 = (int)(Math.random() * 100);
      
      // If num1 < num2, swap num1 with num2
      if (num1 < num2) {   
         int temp = num1;
         num1 = num2;
         num2 = temp;
      }
      
      // Ask the user to answer, "What is num1 - num2?"
      System.out.print("What is " + num1 + " - " + num2 + "? ");
      Scanner input = new Scanner(System.in);
      int answer = input.nextInt();
      
      // Grade the answer and display result
      if (num1 - num2 == answer)
         System.out.print("You are correct!");
      else {
         System.out.println("Your answer is wrong.");
         System.out.println(num1 + " - " + num2 + " should be " + (num1 - num2));
      }
      
   }
}