/** Geometry: Point Position
 *  Programming Exercise 3.32 shows how to test whether a point is on the left side of a directed line,
 *  on the right, or on the same line. Write the methods with the following headers: 
 *
 *    // Return true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1)
 *    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2)
 *
 *    // Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1)
 *    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2)
 *
 *    // Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1)
 *    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2)
 *
 *  Write a program that prompts the user to enter the 3 points for p0, p1 and p2 and displays whether p2
 *  is on the left of the line from p0 to p1, right, the line, or on the line segment.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex06_39 {
   public static void main(String[] args) {
      // Create scanner and get p0, p1, and p2 from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three points for p0, p1 and p2: ");
      double x0 = input.nextDouble();
      double y0 = input.nextDouble();
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      
      // Check conditions
      if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
         System.out.print("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
      else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
         System.out.print("(" + x2 + ", " + y2 + ") is on the same line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
      else if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
         System.out.print("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
      else
         System.out.print("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
         
   }
   
    /** Method returns true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1) */
   public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
      if (((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0)
         return true;
      else
         return false;
   }

    /** Method returns true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1) */
   public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
      if (((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0)
         return true;
      else
         return false;
   }

    /** Method returns true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1) */
   public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
      if (((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0) {
         double xMin = Math.min(x0, x1);
         double xMax = Math.max(x0, x1);
         double yMin = Math.min(y0, y1);
         double yMax = Math.max(y0, y1);
         if (x2 >= xMin && x2 <= xMax && y2 >= yMin && y2 <= yMax) {
            return true;
         }
         return false;
      }
      else
         return false;
   }
  
}