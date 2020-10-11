/** Random Points On A Circle
 *  Write a program that generates three random points on a circle centered at (0, 0)
 *  with a radius 40 and display three angles in a triangle formed by these three points, as
 *  shown in Figure 4.7a. (Hint: Generate a random angle a in radians between 0 and 2PI, 
 *  as shown in Figure 4.7b and the point determined by this angle is (r*cos(a), r*(sin(a)).
 *  
 */
 
public class Ex04_06 {
   public static void main(String[] args) {
      // Declare radius from problem statement
      final double r = 40;
      
      // Generate three random angles
      double a1 = Math.random() * 360;
      double a2 = Math.random() * 360;
      double a3 = Math.random() * 360;
      
      // Determine x and y coordinates
      double x1 = r * Math.cos(Math.toRadians(a1));
      double y1 = r * Math.sin(Math.toRadians(a1));
      double x2 = r * Math.cos(Math.toRadians(a2));
      double y2 = r * Math.sin(Math.toRadians(a2));
      double x3 = r * Math.cos(Math.toRadians(a3));
      double y3 = r * Math.sin(Math.toRadians(a3));
      
      // Display results
      System.out.print("Point one: " + x1 + ", " + y1);
      System.out.print("\nPoint two: " + x2 + ", " + y2);
      System.out.print("\nPoint three: " + x3 + ", " + y3);
   }
}