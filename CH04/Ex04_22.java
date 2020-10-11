/** Check Substring
 *  Write a program that prompts the user to enter two strings and reports whether
 *  the second string is a substring of the first string.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex04_22 {
   public static void main(String[] args) {
      // Create a scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter string s1: ");
      String s1 = input.nextLine();
      System.out.print("Enter string s2: ");
      String s2 = input.nextLine();
      
      // Determine if s2 contains s1 & display result
      if (s1.contains(s2))
         System.out.print(s2 + " is a substring of " + s1);
      else
         System.out.print(s2 + " is not a substring of " + s1);
   }
}