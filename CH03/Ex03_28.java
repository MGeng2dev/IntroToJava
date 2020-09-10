/** Geometry: two rectangles
 *  Write a program that prompts the user to enter the center, 
 *  x- and y-coordinates, width, and height of two rectangles
 *  and determines whether the second rectangle is inside the first
 *  or overlaps with the first. 
 *
 *  Note: Sample Run 1 indicates r2 is considered inside r1 even if
 *  they share an edge. 
 *
 *
 */
 
import java.util.Scanner;
 
public class Ex03_28 {
   public static void main(String[] args) {
      // Create scanner and get user inputs
      Scanner input = new Scanner(System.in);
      System.out.print("Enter rectangle 1's center x- and y- coordinates, width, and height: ");
      double r1_x0 = input.nextDouble();
      double r1_y0 = input.nextDouble();
      double r1_w = input.nextDouble();
      double r1_h = input.nextDouble();
      System.out.print("Enter rectangle 2's center x- and y- coordinates, width, and height: ");
      double r2_x0 = input.nextDouble();
      double r2_y0 = input.nextDouble();
      double r2_w = input.nextDouble();
      double r2_h = input.nextDouble();
      
      
      // Determine r1's min and max values of x & y
      double r1x_min = r1_x0 - r1_w / 2;
      double r1x_max = r1_x0 + r1_w / 2;
      double r1y_min = r1_y0 - r1_h / 2;
      double r1y_max = r1_y0 + r1_h / 2;
      
      // Determine r2's min and max values of x & y
      double r2x_min = r2_x0 - r2_w / 2;
      double r2x_max = r2_x0 + r2_w / 2;
      double r2y_min = r2_y0 - r2_h / 2;
      double r2y_max = r2_y0 + r2_h / 2;
      
      
      // Determine if r2 is inside of r1
      // r2 is inside of r1 if all points if: r2's x-values are within (or equal to) r1's x_min and x_max AND
      // r2's y-values are within (or equal to) r1's y_min and y_max values
      if ((r2x_min >= r1x_min && r2x_min <= r1x_max) && (r2x_max >= r1x_min && r2x_max <= r1x_max) &&     // check if both of r2's x-values are between r1's x-values (inclusive)
            (r2y_min >= r1y_min && r2y_min <= r1y_max) && (r2y_max >= r1y_min && r2y_max <= r1y_max)) {   // check if both of r2's y-values are between r1's y-values (inclusive)
         System.out.print("r2 is inside r1");
      }
      
      // Determine if r2 is outside r1
      // r2 is outside r1 if: r2's x-values are all less than or all greater than r1's x-values AND
      // r2's y-values are all less than or all greater than r1's y-values 
      else if ((r2x_min < r1x_min && r2x_max < r1x_min) || (r2x_min > r1x_max && r2x_max > r1x_max) || // check if r2's x values are both either less than or greater than r1's
         (r2y_min < r1y_min && r2y_max < r1y_min) || (r2y_min > r1y_max && r2y_max > r1y_max)) {       // check if r2's y values are both either less than or greater than r1's
         System.out.print("r1 is not inside r1. r2 does not overlap r1.");
      }
      
      // Otherwise, r2 overlaps r1
      else {
         System.out.print("r2 overlaps r1");
      }
      
     
      
   }
}
      
