/** Phone Keypads
 *  The international standard letter/number mapping for telephones is shown
 *  in Programming Exercise 4.15. Write a method that returns a number, given an
 *  uppercase letter, as follows:
 *
 *    int getNumber(char uppercaseLetter)
 *
 *  Write a test program that prompts the user to enter a phone number as a 
 *  string. The number may contain letters. The program translates a letter 
 *  (uppercase of lowercase) to a digit and leaves all other characters
 *  intact.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_21 {
   public static void main(String[] args) {
      // Create a scanner an get user string
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputString = input.nextLine();
      
      // Loop thru each character of string
      String outputString = ""; // initialize output string
      for (int i = 0; i < inputString.length(); i++) {
         char ch = Character.toUpperCase(inputString.charAt(i)); // get current character
         if (Character.isLetter(ch)) {
            int newChar = getNumber(ch); // call method to get number
            outputString = outputString + newChar;
         }
         else {
            outputString = outputString + ch;
         }
      }
      
      // Display result
      System.out.print(outputString);     
   }
   
   /** Method returns numbers for letters based on standard telephone mapping */
   public static int getNumber(char uppercaseLetter) {
      if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C')
         return 2;
      else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F')
         return 3;
      else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I')
         return 4;
      else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L')
         return 5;
      else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O')
         return 6;
      else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S')
         return 7;
      else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V')
         return 8;
      else
         return 9;
   }
}
