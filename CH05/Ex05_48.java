/** Process String
 *  Write a program that prompts the user to enter a string and displays the characters at
 *  odd positions. 
 *
 */
 
import java.util.Scanner;
 
public class Ex05_48 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputString = input.nextLine();
      
      // For loop to print every other letter
      for (int i = 0; i < inputString.length(); i += 2) {
         System.out.print(inputString.charAt(i));
      }
   }
}