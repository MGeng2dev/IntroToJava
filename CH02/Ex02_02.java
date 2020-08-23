/** Compute the volume of a cylinder
 *  Write a program that reads in the radius and length of a cylinder
 *  and computes the area and volume using the following formulas: 
 *     area = radius * radius * pi
 *     volume = area * length
 *
 */
 
import java.util.Scanner;
 
public class Ex02_02 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter radius and length of a cylinder: ");
      double radius = input.nextDouble();
      double length = input.nextDouble();
      
      // Calculate area and volume
      double area = radius * radius * Math.PI;
      double volume = area * length;
      
      // Display results
      System.out.println("The area is " + area);
      System.out.println("The volume is " + volume);
      
   }
}