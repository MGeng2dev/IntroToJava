/** Game: add three numbers
*  The program in Listing 3.1, AdditionQuiz.java, generates two integers
*  and prompts the user to enter the sum of these 2 integers. 
*  Revise the program to generate 3 single-digit integers and prompt
*  the user to enter the sum of these 3 integers.
*
*/ 

import java.util.Scanner;

public class Ex03_02 {
   public static void main(String[] args) {
      // Generate 3 single-digit integers
      int num1 = (int)(Math.random() * 10);
      int num2 = (int)(Math.random() * 10);
      int num3 = (int)(Math.random() * 10);      
      
      // Create scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user for answer
      System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");
      int answer = input.nextInt();
      
      // Display result
      System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + answer + " is " + 
         (num1 + num2 + num3 == answer));
      
   }
}