/** Geometry: intersecting point
 *  Two points on line 1 are given as (x1, y1) and (x2, y2) and
 *  on line 2 as (x3, y3) and (x4, y4). 
 *  The intersecting point of the two lines can be found by 
 *  solving the following linear equation:
 *
 *  (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 *  (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 *
 *  The linear equation can be solved using Cramer's rule.
 *  Cramer's Rule:
 *     ax + by = e    x = (ed - bf) / (ad - bc)
 *     cx + dy = f    y = (af - ec) / (ad - bc) 
 *
 *  If the equation has no solutions, the two lines are parallel.
 *  If ad - bc = 0, the equation has no solutions.
 *
 *  Write a program that prompts the user to enter four points 
 *  and displays the intersecting point.
 *
 */ 
 
 
import java.util.Scanner;
 
public class Ex03_25 {
   public static void main(String[] args) {
      // Create a scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();
      double x4 = input.nextDouble();
      double y4 = input.nextDouble();
      
      // Calculate variables for Cramer's rule
      double a = y1 - y2;
      double b = -1 * (x1 - x2);
      double c = y3 - y4;
      double d = -1 * (x3 - x4);
      
      double e = a * x1 + b * y1;
      double f = c * x3 + d * y3;
      
      // Determine if lines are parallel, or determine intersecting point
      if (a*d - b*c == 0) {
         System.out.print("The two lines are parallel");
      }
      else {
         double x = (e * d - b * f) / (a * d - b * c);
         double y = (a * f - e * c) / (a * d - b * c);
         System.out.print("The intersecting point is at: (" + x + ", " + y + ")");
         
      }
      
   }
}
