/** Compute The Greatest Common Divisor
 *  Another solution for Listing 5.9 to find the greatest common divisor of two integers
 *  n1 and n2 is as follows: First find d to be the minimum of n1 and n2, then check
 *  whether d, d-1, d-2, ... , 2, or 1 is a divisor for both n1 and n2 in this order.
 *  The first such common divisor is the greatest common divisor for n1 and n2. 
 *  Write a program that prompts the user to enter two positive integers and displays
 *  the gcd.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_14 {
   public static void main(String[] args) {
      // Create scanner
      Scanner input = new Scanner(System.in);
      // Prompt user to enter 2 positive integers
      System.out.print("Enter first integer (positive): ");
      int n1 = input.nextInt();
      System.out.print("Enter second integer (positive): ");
      int n2 = input.nextInt();
      
      // Assign minimum of n1 and n2 to d
      int d = Math.min(n1, n2);
      
      // Check if d is a divisor of n1 and n2
      while (n1 % d != 0 && n2 % d != 0) {
         d = d - 1; // if not, decrease d by 1
      }
      
      // Display result
      System.out.print("The greatest common divisor for " + n1 + " and " + n2 + " is " + d);
   }
}