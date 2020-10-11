/** Vowel Or Consonant?
 *  Write a program that prompts the user to enter a letter and check
 *  whether the letter is a vowel or a consonant.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_13 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter: ");
      char ch = input.next().charAt(0);
      
      // Check for valid input (letter)
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
         char chUp = Character.toUpperCase(ch); // convert to upper case for vowel check
         if (chUp == 'Y')
            System.out.print(ch + " is a vowel sometimes");
         else if (chUp == 'A' || chUp == 'E' || chUp == 'I' || chUp == 'O' || chUp == 'U')
            System.out.print(ch + " is a vowel");
         else
            System.out.print(ch + " is a consonant");
      }
      else
         System.out.print(ch + " is an invalid input");
   }
}