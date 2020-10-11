/** Find The Number Of Uppercase Letters In A String
 *  Write a recursive method to return the number of uppercase letters in a string.
 *  Write a test program that prompts the user to enter a string and 
 *  displays the number of uppercase letters in the string.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex18_14 {
   public static void main(String[] args) {
      // Create scanner and get string from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      
      // Call method and display result
      int result = countUpper(s);
      System.out.print("Entered string contains " + result + " uppercase " + (result == 1 ? "letter" : "letters"));
   }
   
   /** Method to count number of uppercase letters in a string **/
   public static int countUpper(String s) {
      int count = 0;  // initialize count variable   
      return countUpper(s, count); 
   }
   
   /** Helper method **/
   public static int countUpper(String s, int count) {
      if (s.length() == 0)
         return count;
      if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
         count++;
      return countUpper(s.substring(1), count);
   }
}