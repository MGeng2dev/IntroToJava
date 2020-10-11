/** Corner Point Coordinates
 *  Suppose a pentagon is centered at (0, 0) with one point at the 0 o'clock position, as
 *  shown in Figure 4.7c. Write a program that prompts the user to enter the radius 
 *  of the bounding circle of a pentagon and displays the coordinates of the five corner
 *  points on the pentagon. 
 *
 */
 
import java.util.Scanner;
 
public class Ex04_07 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the radius of the bounding circle: ");
      double r = input.nextDouble();
      
      // Determine the five coordinates
      double x1 = r * Math.cos(Math.toRadians(90));
      double y1 = r * Math.sin(Math.toRadians(90));
      double x2 = r * Math.cos(Math.toRadians(90 + 72));
      double y2 = r * Math.sin(Math.toRadians(90 + 72));
      double x3 = r * Math.cos(Math.toRadians(90 + 72 + 72));
      double y3 = r * Math.sin(Math.toRadians(90 + 72 + 72));
      double x4 = r * Math.cos(Math.toRadians(90 + 72 + 72 + 72));
      double y4 = r * Math.sin(Math.toRadians(90 + 72 + 72 + 72));
      double x5 = r * Math.cos(Math.toRadians(90 + 72 + 72 + 72 + 72));
      double y5 = r * Math.sin(Math.toRadians(90 + 72 + 72 + 72 + 72));
      
      // Display results
      System.out.print("The coordinates of five points on the pentagon are: ");
      System.out.printf("\n(%6.4f, %6.4f)", x1, y1); 
      System.out.printf("\n(%6.4f, %6.4f)", x2, y2); 
      System.out.printf("\n(%6.4f, %6.4f)", x3, y3); 
      System.out.printf("\n(%6.4f, %6.4f)", x4, y4); 
      System.out.printf("\n(%6.4f, %6.4f)", x5, y5); 
   }
}