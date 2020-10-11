/** Occurrences Of A Specified Character In A String
 *  Write a recursive method that finds the number of occurrences of a specified letter
 *  in a string using the following method header:
 * 
 *     public static int count(String str, char a) 
 *
 *  For example, count("Welcome", 'e') returns 2. 
 *  Write a test program that prompts the user to enter a string and a character, and 
 *  displays the number of occurrences for the character in the string. 
 *
 *  Comment: I have designed this to be case-sensitive.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex18_10 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      System.out.print("Enter a character: ");
      char ch = input.nextLine().charAt(0);
      
      // Call method & display the result
      int count = count(s, ch);
      System.out.print("Character: " + ch + " appears " + count + (count > 1 ? " times" : " time"));
      
   }
   
   /** Method to count instances of character in a string **/
   public static int count(String s, char ch) {
      int count = 0;
      
      if (s.length() > 0) {
         if (s.charAt(0) == ch)
            count = 1 + count(s.substring(1), ch); // increase count, recursive call
         else
            count = count(s.substring(1), ch); // don't increase count, recursive call
      }   
      
      return count; 
      
   }
   
}