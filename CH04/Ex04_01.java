/** Geometry: Area Of A Pentagon
 *  Write a program that prompts the user to enter the length from the center
 *  of a pentagon to a vertex and computes the area of the pentagon,
 *  as shown in the following figure.
 *
 *  The forumla for computing the area of a pentagon is:
 *
 *     Area = (5*s^2)/(4*tan(PI/5)), where s is the length of a side
 *
 *  The side can be computed using the formula:
 *    
 *     s = 2*r*sin(PI/5), where r is the length from the center of a pentagon to a vertex
 *
 *  Round up two digits after the decimal point.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_01 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the length from the center to a vertex: ");
      double r = input.nextDouble();
      
      // Calculate s
      double s = 2 * r * Math.sin(Math.PI / 5);
      
      // Calculate the area
      double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
      area = Math.round(area * 100) / 100.0;   // round per problem statement
      
      // Display result
      System.out.print("The area of the pentagon is " + area);
   }
}