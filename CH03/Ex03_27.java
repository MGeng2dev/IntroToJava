/** Geometry: points in triangle?
 *  Suppose a right triangle is placed in a plane as shown below.
 *  The right-angle point is placed at (0, 0), and the other two
 *  points are placed at (200, 0) and (0, 100). 
 *  Write a program that prompts the user to enter a point with 
 *  x- and y- coordinates and determines whether the point is 
 * inside the triangle. 
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_27 {
   public static void main(String[] args) {
      // Create a scanner and get coordinates from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a point's x- and y- coordinates: ");
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      
      // One point of triangle is at (200, 0)
      double x0 = 200;
      double y0 = 0;
      
      // Another point of triangle is at (0, 100);
      double x1 = 0; 
      double y1 = 100;
      
      // Determine if input is to the left of right of the triangle line
      double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
      
      if (x2 < 0 || y2 < 0) // eliminate all points that have a negative coordinate
         System.out.print("The point is not in the triangle");
      else if (x2 >= 0 && x2 <= 200 && y2 == 0) // points on vertical leg of triangle
         System.out.print("The point is on the triangle");
      else if (y2 >= 0 && y2 <= 100 && x2 == 0) // points on horizontal leg of triangle
         System.out.print("The point is on the triangle"); 
      else {
         if (result > 0)
            System.out.print("The point is in the triangle");
         else if (result == 0)
            System.out.print("The point is on the triangle");
         else if (result < 0)
            System.out.print("The point is not in triangle");
      }
      
   }
}