/** Geometry: Area Of A Regular Polygon
 *  A regular polygon is an n-sided polygon in which all sides are of the same length
 *  and all angles have the same degree (i.e., the polygon is both equilateral and 
 *  equiangular). The formula for computing the area of a regular polygon is:
 *
 *     area = (n*s^2)/(4*tan(PI/n))
 *
 *  Write a method that returns the area of a regular polygon using the following header:
 *
 *    public static double area(int n, double side)
 *
 *  Write a main method that prompts the user to enter the number of sides and the side
 *  of a regular polygon and display its area.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_36 {
   public static void main(String[] args) {
      // Create scanner & get inputs from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of sides: ");
      int n = input.nextInt();
      System.out.print("Enter the side: ");
      double side = input.nextDouble();
      
      // Call method & display result
      System.out.print("The area of the polygon is: " + area(n, side));
   }
   
    /** Method returns area of polygon */
   public static double area(int n, double side) {
      return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
   }
}