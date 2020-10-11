/** Convert Letter Grade To Number
 *  Write a program that prompts the user to enter a letter grade A, B, C, D, or F and
 *  displays its corresponding numeric value 4, 3, 2, 1, or 0.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_14 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter grade: ");
      char ch = input.next().charAt(0);
      
      // Determine if input character is a valid grade
      if ((ch >= 'a' && ch <='d' || ch == 'f') || (ch >= 'A' && ch <= 'D' || ch == 'F')) {
         char chUp = Character.toUpperCase(ch); // convert to upper case for switch statement simplicity
         String result = "";
         // Determine numeric value for grade
         switch (chUp) {
            case 'A': result = "4";
               break;
            case 'B': result = "3";
               break;
            case 'C': result = "2";
               break;
            case 'D': result = "1";
               break;
            case 'F': result = "0";
         }
         // Display result
         System.out.print("The numeric value for grade " + chUp + " is " + result);
      }
      else
         System.out.print(ch + " is an invalid grade");
   }
}