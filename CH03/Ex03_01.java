/** Algebra: solve quadratic equations
 *  The two roots of a quadratic equation ax^2 + bx + c = 0 can be
 *  obtain using the following formula:
 *  r1 = (-b + sqrt(b^2 - 4ac)) / (2a) and
 *  r2 = (-b - sqrt(b^2 - 4ac)) / (2a)
 *  b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, 
 *  the equation has 2 real roots. If it is zero, the equation has one root. If it 
 *  is negative, the equation has no real roots.
 *
 *  Write a program that prompts the user to enter values for a, b, and c and 
 *  displays the result based on the discriminant. If the discriminant is positive, 
 *  display 2 roots. If the discriminant is 0, display one root. Otherwise, display
 *  "The equation has no real roots".
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_01 {
   public static void main(String[] args) {
      // Create scanner and get a, b, c values from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a, b, c: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      
      // Get discriminant
      double discriminant = Math.pow(b, 2) - 4 * a * c;
      
      // If discriminant is positive, calculate 2 roots
      if (discriminant > 0) {
         double root1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
         double root2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
         System.out.print("The equation has two roots " + root1 + " and " + root2);
      }
      
      // If the discriminant is 0, calculate 1 root
      if (discriminant == 0) {
         double root3 = -b / (2 * a);
         System.out.print("The equation has one root " + root3);
      }
      
      // If the discriminant if negative, the equation has no roots to calculate
      if (discriminant < 0) {
         System.out.print("The equation has no real roots");
      }
      
   }
}
         
