/** Hex To Binary
 *  Write a program that prompts the user to enter a hex digit and displays its 
 *  corresponding binary number.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_12 {
   public static void main(String[] args) {
      // Create scanenr & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a hex digit: ");
      char ch = input.next().charAt(0);
      
      // Determine binary value & display result
      String result = "";
      
      if ((ch >= 0 && ch <= 9) || (ch >= 'A' && ch <= 'F')) {
         switch (ch) {
            case '0': result = "0";
               break;
            case '1': result = "1";
               break;
            case '2': result = "10";
               break;
            case '3': result = "11";
               break;
            case '4': result = "100";
               break;
            case '5': result = "101";
               break;
            case '6': result = "110";
               break;
            case '7': result = "111";
               break;
            case '8': result = "1000";
               break;
            case '9': result = "1001";
               break; 
            case 'A': result = "1010";
               break;
            case 'B': result = "1011";
               break;
            case 'C': result = "1100";
               break;
            case 'D': result = "1101";
               break;
            case 'E': result = "1110";
               break;
            case 'F': result = "1111";
         }
         System.out.print("The binary value is " + result);
      }
      else 
         System.out.print(ch + " is an invalid input");
   }
}