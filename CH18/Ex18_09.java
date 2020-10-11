/** Print The Characters In A String Reversely
 *  Write a recursive method that displays a string reversely on the console
 *  using the following header:
 *
 *     public static void reverseDisplay(String value)
 *
 *  For example, reverseDisplay("abcd") displays dcba. 
 *  Write a test program that prompts the user to enter a string and displays its reversal.
 *
 */
 
import java.util.Scanner;
 
public class Ex18_09 {
   public static void main(String[] args) {
      // Create scanner and get string from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      
      // Call method and display result
      System.out.print("saReversal: ");
      reverseDisplay(s);
      
   }
   
   /** Method to reverse characters in a string **/
   public static void reverseDisplay(String s) {
      if (s.length() == 1)
         System.out.print(s);  // base case -  print only remaining character
      else {
         System.out.print(s.charAt(s.length() - 1));  // print last character in string
         reverseDisplay(s.substring(0, s.length() - 1));  // recursive call - remove last character
      }
      
   }
}