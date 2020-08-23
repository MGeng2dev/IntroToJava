/** Geometry: area of a hexagon
 *  Write a program that prompts the user to enter the side of a hexagon 
 *  and displays its area. 
 *  The formula for computing the area of a hexagon is:
 *     area = (3 * sqrt(3) * s^2) / 2
 *        Where s is the length of a side
 *
 */
 
import java.util.Scanner;
 
public  class Ex02_16 {
   public static void main(String[] args) {
      // Create scanner and get side length from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the side length: ");
      double s = input.nextDouble();
      
      // Compute area
      double area = 3 * Math.pow(3, 0.5) * Math.pow(s, 2) / 2;
      
      // Display result
      System.out.print("The area of the hexagon is " + area);
      
   }
}