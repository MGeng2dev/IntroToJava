/** Geometry: point in a rectangle?
 *  Write a program that prompts the user to enter a point (x, y) and checks
 *  whether the point is within the rectangle centered at (0, 0) with width 10
 *  and height 5. 
 *  For example, (2, 2) is inside the rectangle and (6, 4) is outside the
 *  rectangle.
 *  Hint: A point is in the rectangle if its horizontal distance to (0, 0) is 
 *  less than or equal to 10/2 and its vertical distance to (0, 0) is less 
 *  than or equal to 5.0/2. 
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_23 {
   public static void main(String[] args) {
      // Create a scannner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a point with two coordinates: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
            
      // Determine result & display
      if (Math.abs(x1) <= 10 / 2) {  // check x-coord. distance from 0
         if (Math.abs(y1) <= 5.0 / 2) {  // check y-coord. distance from 0
            System.out.print("Point (" + x1 + ", " + y1 + ") is in the rectangle.");
         }
      }
      else 
         System.out.print("Point (" + x1 + ", " + y1 + ") is not in the rectangle.");
         
   }
}