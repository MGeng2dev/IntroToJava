/** Find The Unicode Of A Character
 *  Write a program that receives a character and displays its Unicode.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_09 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a character: ");
      char ch = input.nextLine().charAt(0);
      
      // Display result
      System.out.print("The Unicode for the character " + ch + " is " + (int)ch);
   }
}