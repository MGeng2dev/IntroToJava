/** Occurrences Of A Specified Character
 *  Write a method that finds the number of occurrences of a specified character
 *  in a string using the following header:
 *
 *    public static int count(String str, char a)
 *
 *  For example, count("Welcome", 'e') returns 2. Write a test program that prompts
 *  the user to enter a string followed by a character and displays the number
 *  of occurrences of the character in the string.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_23 {
   public static void main(String[] args) {
      // Create a scanner and get user string and character
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputString = input.nextLine();
      System.out.print("Enter a character: ");
      char inputCh = input.next().charAt(0);
      
      // Call method & display result
      System.out.print("String contains " + count(inputString, inputCh) + 
         " occurrences of " + inputCh);
   }
   
    /** Method counts occurrences of character */
   public static int count(String str, char a) {
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == a)
            count++;
      }
      return count;
   }
}