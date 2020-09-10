/** Geometry: two circles
 *  Write a program that prompts the user to enter the center coordinates and radii of two
 *  circles and determines whether the second circle is inside the first or overlaps the
 *  first, as shown in Figure 3.10. 
 * 
 *  Hint: circle2 is inside circle1 if the distance between the two centers <= |r1 - r2|
 *  and circle 2 overlapes circle 1 if the distance between the two centeres <= r1 + r2.
 *
 */
 
import java.util.Scanner;
 
public class Ex03_29 {
   public static void main(String[] args) {
      // Create scanner and get points from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter cricle1's center x-, y-coordinates, and radius: ");
      double c1x = input.nextDouble();
      double c1y = input.nextDouble();
      double c1r = input.nextDouble();
      System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
      double c2x = input.nextDouble();
      double c2y = input.nextDouble();
      double c2r = input.nextDouble();
      
      // Evaluate distance between the centers
      double dist = Math.pow(Math.pow(c2x - c1x, 2) + Math.pow(c2y - c1y, 2), 0.5);
      
      if (dist <= Math.abs(c1r - c2r)) {
         System.out.print("circle2 is inside circle1");
      }
      else if (dist <= c1r + c2r) {
         System.out.print("circle2 overlaps circle1");
      }
      else {
         System.out.print("circle2 is not inside circle1. circle2 does not overlap circle1.");
      }
      
      
   }
}