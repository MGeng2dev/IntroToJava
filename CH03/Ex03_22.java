/**  Geometry: point in a circle?
 *  Write a program that prompts the user to enter a point (x, y) and checks 
 *  whether the point is within the circle cenetered at (0, 0) with radius 10.
 *  For example, (4, 5) is inside the circle and (9, 9) is outside the 
 *  circle, as shown in Figure 3.7a. 
 *
 *  Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * 
 *  The forumla for computing the distance is: sqrt((x2 - x1)^2 + (y2 - y1)^2)
 *
 */
 
import java.util.Scanner;
 
public class Ex03_22 {
   public static void main(String[] args) {
      // Create a scanner & get coordinates from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a point with two coordinates: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      
      // Determine if distance from 0,0 is < 10
      double x2 = 0;
      double y2 = 0;
      
      double dist = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
      
      // Display result
      if (dist <= 10)
         System.out.print("Point (" + x1 + ", " + y1 + ") is in the circle");
      else
         System.out.print("Point (" + x1 + ", " + y1 + ") is not in the circle");
         
   }
}