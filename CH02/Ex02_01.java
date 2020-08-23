/** Convert Celsius to Fahrenheit
 *  Write a program that reads a Celsius degree in a double value
 *  from the console, then converts it to Fahrenheit and displays the result.
 *  The formula for the conversion is as follows:
 *     fahrenheit = (9 / 5) * celsius + 32
 *  Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.9.
 *
 */
 
import java.util.Scanner;
 
public class Ex02_01 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter degrees in Celsius (double): ");
      double c_degrees = input.nextDouble();
      
      // Perform degrees Fahrenheit
      double f_degrees;
      f_degrees = (9.0 / 5) * c_degrees + 32;
      
      // Display result
      System.out.println(c_degrees + " degrees Celsius is " + f_degrees + " degrees Fahrenheit");
      
   }
}