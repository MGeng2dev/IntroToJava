/** Longest Common Prefix
 *  Write a program that prompts the user to enter two strings and displays the largest 
 *  common prefix of the two strings.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_51 {
   public static void main(String[] args) {
      // Create scanner & get two strings from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first string: ");
      String s1 = input.nextLine();
      System.out.print("Enter the second string: ");
      String s2 = input.nextLine();
      
      // Initialize variables 
      int index = 0;
      int numOfChars = Math.min(s1.length(), s2.length());
      
      // Loop thru characters
      for (int i = 0; i < numOfChars; i++) {
         if (s1.charAt(i) == s2.charAt(i))
            index++;
         else
            break;
      }
      
      // Display results
      if (index == 0) {
         System.out.print(s1 + " and " + s2 + " have no common prefix");
      }
      else {
         System.out.print(s1.substring(0, index));
      }     
   }
}