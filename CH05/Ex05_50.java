/** Count Uppercase Letters
 *  Write a program that prompts the user to enter a string and displays the number of
 *  uppercase letters in the string. 
 *
 */
 
import java.util.Scanner;
 
public class Ex05_50 {
   public static void main(String[] args) {
      // Create scanner and get string from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      
      // Initialize counter variable
      int numOfUppers = 0;
      
      // Loop thru each letter and count upper case letters
      for (int i = 0; i < s.length(); i++) {
         if (Character.isUpperCase(s.charAt(i))) {
            numOfUppers++;
         }
      }
      
      // Display result
      System.out.print("The number of uppercase letters is: " + numOfUppers);
   }
}