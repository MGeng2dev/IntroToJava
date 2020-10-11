/** Student Major And Status
 *  Write a program that prompts the user to enter two characters and displays the major
 *  and status represented in the characters. The first character indicates the major and
 *  the second is number character 1, 2, 3, 4, which indicates whether a student is a 
 *  freshman, sophomore, junior, or senior. Suppose the following characters are uses
 *  to denote the majors:
 *     M: Mathematics
 *     C: Computer Science
 *     I: Information Technology
 *
 */ 
 
import java.util.Scanner;
 
public class Ex04_18 {
   public static void main(String[] args) {
      // Create a scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two characters: ");
      String s = input.next();
      String major = Character.toString(s.charAt(0));
      String status = Character.toString(s.charAt(1));
      
      // Determine major and display result
      if (major.equalsIgnoreCase("M"))
         System.out.print("Mathematics ");
      else if (major.equalsIgnoreCase("C"))
         System.out.print("Computer Science ");
      else if (major.equalsIgnoreCase("I"))
         System.out.print("Information Techonology ");
      else
         System.out.print("Invalid major character");
         
      // Determine status and display result
      if (status.equals("1"))
         System.out.print("\nFreshman");
      else if (status.equals("2"))
         System.out.print("\nSophomore");
      else if (status.equals("3"))
         System.out.print("\nJunior");
      else if (status.equals("4"))
         System.out.print("\nSenior");
      else
         System.out.print("\nInvalid status character");
   }
}