/** Geometry: Area Of A Hexagon
 *  The area of a hexagon can be computed using the following formula (s is the
 *  length of a side):
 *
 *     Area = (6*s^2) / (4*tan(PI/6))
 *
 *  Write a program that prompts the user to enter the side of a hexagon
 *  and displays its area. 
 *
 */
 
import java.util.Scanner;
 
public class Ex04_04 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the side: ");
      double s = input.nextDouble();
      
      // Calculate area
      double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
      area = Math.round(area * 100) / 100.0;  // round per sample run
      
      // Display result
      System.out.print("The area of the hexagon is " + area);
   }
   
}