/** Process A String
 *  Write a program that prompts the user to enter a string and displays its 
 *  length and its first character.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_20 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      
      // Determine input string length & display
      System.out.print("Length of string: " + s.length());
      
      // Determine first character of string & display
      System.out.print("\nFirst character: " + s.charAt(0));
   }
}