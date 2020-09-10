/** Geometry: point on line segment
 *  Programming Exercise 3.32 shows how to test whether a point is on an unbounded line.
 *  Revise Programming Exercise 3.32 to test whether a point is on a line segment.
 *  Write a program that prompts the user to enter the three points for p0, p1, and p2
 *  and displays whether p2 is on the line segment from p0 to p1. 
 *  
 *    (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0) = { >0, p2 is on the left side of the line
 *                                      { =0, p2 is on the same line
 *                                      { <0, p2 is on the right side of the line
 *
 *
 */
 
import java.util.Scanner;
 
public class Ex03_34 {
   public static void main(String[] args) {
      // Create scanner and get points from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three points for p0, p1, and p2: ");
      double x0 = input.nextDouble();
      double y0 = input.nextDouble();
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble(); // point to check
      double y2 = input.nextDouble(); // point to check
      
      // Determine equation value
      double value = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
      
      // If value is >0 or <0, it is not on the unbounded line
      if (value != 0) {
         System.out.print("(" + x2 + ", " + y2 + ") is NOT on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
      }
      
      // If value is 0, check if on line segment 
      else {
         if ((x2 >= x0 && x2 <= x1) || (x2 >= x1 && x2 <= x0)) { // x2 must fall between x0 and x1
            if ((y2 >= y0 && y2 <= y1) || (y2 >= y1 && y2 <= y0)) {  // y2 must fall between y0 and y1
               System.out.print("(" + x2 + ", " + y2 + ") is ON the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
            }
            else
               System.out.print("(" + x2 + ", " + y2 + ") is NOT on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
         }
         else
            System.out.print("(" + x2 + ", " + y2 + ") is NOT on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
      }
      
   }
}