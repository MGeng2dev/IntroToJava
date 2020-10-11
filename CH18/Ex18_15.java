/** Occurrences Of A Specified Character In A String
 *  Rewrite Programming Exercise 18.10 using a helper method to pass the substring
 *  high index method. 
 *  The method header is:
 *     public static int count(String str, char a, int high)
 *  
 */
 
import java.util.Scanner;
 
public class Ex18_15 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      System.out.print("Enter a character: ");
      char ch = input.nextLine().charAt(0);
      
      // Call method & display the result
      int count = count(s, ch);
      System.out.print("Character " + ch + " appears " + count + (count == 1 ? " time" : " times"));
      
   }
   
   /** Method to count instances of character in a string **/
   public static int count(String s, char ch) {
      int high = s.length() - 1;  // highest index value of string
      return count(s, ch, high);
   }
   
   /** Helper method **/
   public static int count(String s, char ch, int high) {
      int count = 0;
      
      if (high < 0)     // base case
         return 0;
      else {
         if (s.charAt(high) == ch)
            return 1 + count(s, ch, high - 1);  // add 1 to count and recursive call
         else
            return count(s, ch, high - 1);  // recursive call without increasing count
      }
   }
}