/** Decimal To Hex
 *  Write a program that prompts the user to enter an integer between 0 and 15
 *  and displays its corresponding hex number.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_11 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a decimal value (0 to 15): ");
      int dec = input.nextInt();
      
      // Determine hex value & display result
      System.out.print("The hex value is ");
      if (dec >= 0 && dec <= 9)
         System.out.print(dec);
      else {
         switch (dec) {
            case (10): System.out.print("A");
               break;
            case (11): System.out.print("B");
               break;
            case (12): System.out.print("C");
               break; 
            case (13): System.out.print("D");
               break;
            case (14): System.out.print("E");
               break;
            case (15): System.out.print("F");
         }
      }
   }
}