/** Reverse A String
 *  Write a program that prompts the user to enter a string and displays the string
 *  in reverse order.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_46 {
   public static void main(String[] args) {
      // Create a scanner & prompt user to enter a string
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputString = input.nextLine();
           
      System.out.print("The reversed string is: ");
      
      // Use for loop to print characters starting from end of string
      for (int i = 1; i <= inputString.length(); i++) {
         System.out.print(inputString.charAt(inputString.length() - i));
      }
      
   }
}