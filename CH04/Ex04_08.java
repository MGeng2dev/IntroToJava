/** Find The Character Of An ASCII Code
 *  Write a program that receives an ASCII code (an integer between 0 and 127)
 *  and displays its character. 
 *
 */
 
import java.util.Scanner;
 
public class Ex04_08 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an ASCII code (0 - 127): ");
      int code = input.nextInt();
      
      // Display result
      System.out.print("The character for ASCII code " + code + " is " + (char)code);
   }
}