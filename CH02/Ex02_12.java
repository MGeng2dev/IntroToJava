/** Physics: finding runway length
 *  Given an airplane's acceleration a and take-off speed v, 
 *  you can compute the minimum runway length needed for an airplane to 
 *  take off using the following formula:
 *     length = v^2 / 2a
 *  Write a program that prompts the user to enter v in meters/second (m/s)
 *  and the acceleration a in meters/second squared (m/s^2), and
 *  displays the minimum runway length. 
 *
 */ 
 
import java.util.Scanner;
 
public class Ex02_12 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter speed (m/s) and acceleration (m/s^2): ");
      double v = input.nextDouble();
      double a = input.nextDouble();
      
      // Calculate length with user inputs
      double length = Math.pow(v, 2) / (2 * a);
      
      // Display result
      System.out.print("The minimum runway length for this airplane is " + length);
      
   }
}