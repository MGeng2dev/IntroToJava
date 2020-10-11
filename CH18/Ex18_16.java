/** Find The Number Of Uppercase Letters In An Array
 *  Write a recursive method to return the number of uppercase letters in an array
 *  of characters. You need to define the following 2 methods. The second
 *  is a recursive helper method.
 *
 *     public static int count(char[] chars)
 *     public static int count(char[] chars, int high)
 *
 *  Write a test program that prompts the user to enter a list of characters
 *  in one line and displays the number of uppercase letters in the list.
 *
 */
 
import java.util.Scanner;
 
public class Ex18_16 {
   public static void main(String[] args) {
      // Create a scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a list of characters in one line: ");
      char[] ch = input.nextLine().toCharArray();
      
      // Call method & display result
      System.out.print("Number of capital letters in list: " + count(ch));
   }
   
   /** Method to count number of uppercase letters **/
   public static int count(char[] ch) {
      int high = ch.length - 1; 
      return count(ch, high);  // call helper method 
   }
   
   /** Helper method **/
   public static int count(char[] ch, int high) {
      int count = 0;  // initialize count
      
      if (high < 0)  // base case
         return 0;
      else {
         if (Character.isUpperCase(ch[high])) 
            return 1 + count(ch, high - 1);  // increase count and recursive call
         else
            return count(ch, high - 1);  // recursive call without increasing count
      }
   }
}