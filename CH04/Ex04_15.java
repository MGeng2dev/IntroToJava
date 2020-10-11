/** Phone Key Pads
 *  The interational standard letter/number mapping found on the telephone is shown.
 *  Write a program that prompts the user to enter a letter and displays
 *  its corresponding number.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_15 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter: ");
      char ch = input.next().charAt(0);
      
      // Determine if input is a valid letter
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
         char chUp = Character.toUpperCase(ch); // convert input to upper case for simplicity
         // Determine corresponding number & display
         if (chUp == 'A' || chUp == 'B' || chUp == 'C') 
            System.out.print("The corresponding number is 2");
         else if (chUp == 'D' || chUp == 'E' || chUp == 'F') 
            System.out.print("The corresponding number is 3");
         else if (chUp == 'G' || chUp == 'H' || chUp == 'I') 
            System.out.print("The corresponding number is 4");
         else if (chUp == 'J' || chUp == 'K' || chUp == 'L') 
            System.out.print("The corresponding number is 5");
         else if (chUp == 'M' || chUp == 'N' || chUp == 'O') 
            System.out.print("The corresponding number is 6");
         else if (chUp == 'P' || chUp == 'Q' || chUp == 'R' || chUp == 'S') 
            System.out.print("The corresponding number is 7");
         else if (chUp == 'T' || chUp == 'U' || chUp == 'V') 
            System.out.print("The corresponding number is 8");
         else if (chUp == 'W' || chUp == 'X' || chUp == 'Y' || ch == 'Z') 
            System.out.print("The corresponding number is 9");
      }
      else 
         System.out.print(ch + " is an invalid input");
   }
}