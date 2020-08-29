/** Algebra: solve 2x2 linear equations
 *  A linear equation can be solved using Cramer's rule given in Programming Exercise 1.13.
 *  Write a program that prompts the user to enter a, b, c, d, e, and f and displays
 *  the result. If ad - bc is 0, report that "The equation has no solution".
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_03 {
   public static void main(String[] args) {
      // Create a scanner and get a, b, c, d, e, f from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a, b, c, d, e, f: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      double d = input.nextDouble();
      double e = input.nextDouble();
      double f = input.nextDouble();
     
      // If ad-bc is 0, equation has no solutions
      if (a*d - b * c == 0) {
         System.out.print("The equation has no solution");
      }
      
      // Otherwise, solve the equations
      else {
         double x = (e*d - b*f) / (a*d - b*c);
         double y = (a*f - e*c) / (a*d - b*c);
         System.out.print("x is " + x + " and y is " + y);
      }
   }
}