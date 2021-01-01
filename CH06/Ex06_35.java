/** Geometry: Area Of A Pentagon
 *  The area of a pentagon can be computed using the following formula: 
 *    
 *     area = (5*s^2) / (4*tan(PI/5))
 *
 *  Write a method that returns the area of a pentagon using the following header:
 *
 *    public static double area(double side)
 *
 *  Write a main method that prompts the user to enter the side of a pentagon and 
 *  display its area.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_35 {
   public static void main(String[] args) {
      // Create a scanner & get side from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the side: ");
      double side = input.nextDouble();
      
      // Call method & display result
      System.out.print("The area of the pentagon is " + area(side));
   }
      
    /** Method returns pentagon's area */
   public static double area(double side) {
      return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
   }
}