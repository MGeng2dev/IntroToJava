/** Count The Letters In A String
 *  Write a method that counts the number of letters in a string using the 
 *  following header: 
 *
 *    public static int countLetters(String s)
 *
 *  Write a test program that prompts the user to enter a string and displays
 *  the number of letters in the string.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_20 {
   public static void main(String[] args) {
      // Create scanner & get string from  user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputString = input.nextLine();
      
      // Call method & display result
      System.out.print("String contains " + countLetters(inputString) + " letters");
   }
   
    /** Method counts the number of letters in a string */
   public static int countLetters(String s) {
      int count = 0;
      for (int i = 0; i <= s.length() - 1; i++) {
         char ch = s.charAt(i);
         if (Character.isLetter(ch)) {
            count++;
         }
      }
      return count;
   }
}