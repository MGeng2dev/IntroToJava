/** Geometry: Area Of A Regular Polygon
 *  A regular polygon is an n-sided polygon in which all sides are of the same 
 *  length and all angles have the same degree (i.e., the polygon is both
 *  equilateral and equiangular). The formula for computing the area
 *  of a regular polygon is:
 *
 *      Area = (n*s^2) / (4*tan(PI/n))
 *
 *  Here, s is the length of a side. Write a program that prompts the user
 *  to enter the number of sides and the length of a regular polygon and 
 *  displays its area.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_05 { 
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of sides: ");
      int n = input.nextInt();
      System.out.print("Enter the side length: ");
      double s = input.nextDouble();
      
      // Calculate area
      double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
      
      // Display result
      System.out.print("The area of the polygon is " + area);
   }
}