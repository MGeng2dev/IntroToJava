/** Occurrences Of A Specified Character In An Array
 *  Write a recursive method that finds the number of occurrences of a specified
 *  character in an array. You need to define the following 2 methods. The 
 *  second one is a helper method.
 *
 *     public static int count(char[] chars, char ch)
 *     public static int count(char[] chars, char ch, int high)
 *
 *  Write a test program that promps the user to enter a list of characters
 *  in one line, and a character, and displays the occurences of the 
 *  character in the list.
 *
 */
 
import java.util.Scanner;
 
public class Ex18_17 {
   public static void main(String[] args) {
      // Create a scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a list of characters in one line: ");
      char[] chars = input.nextLine().toCharArray();
      System.out.print("Enter a character: ");
      char ch = input.nextLine().charAt(0);
      
      // Call method & display result
      System.out.print("Occurrences of " + ch + " in the list: " + count(chars, ch));
   }
   
   /** Method to count number of uppercase letters **/
   public static int count(char[] chars, char ch) {
      int high = chars.length - 1; 
      return count(chars, ch, high);  // call helper method 
   }
   
   /** Helper method **/
   public static int count(char[] chars, char ch, int high) {
      int count = 0;  // initialize count
      
      if (high < 0)  // base case
         return 0;
      else {
         if (chars[high] == ch) 
            return 1 + count(chars, ch, high - 1);  // increase count and recursive call
         else
            return count(chars, ch, high - 1);  // recursive call without increasing count
      }
   }
}