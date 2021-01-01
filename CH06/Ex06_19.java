/** The MyTriangle Class
 *  Create a class named MyTriangle that contains the following two methods:
 * 
 *    // Return true if the sum of any two sides is 
 *    // greater than the third side. 
 *    public static boolean isValid(double side1, double side2, double side3)
 * 
 *    // Return the area of the triangle
 *    public static double area(double side1, double side2, double side3)
 *
 *  Write a test program that reads three sides for a triangle and computes 
 *  the area if the input is valid. Otherwise, it displays that the input is
 *  invalid. The formula for computing the area of a triangle is given in 
 *  Programming Exercise 2.19. 
 *
 */
 
import java.util.Scanner;
 
public class Ex06_19 {
   public static void main(String[] args) {
      // Create a scanner and get sides from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three sides of triangle: ");
      double side1 = input.nextDouble();
      double side2 = input.nextDouble();
      double side3 = input.nextDouble();
      
      // Return area if valid inputs
      if (isValid(side1, side2, side3)) {
         System.out.print("The area of the triangle is: " + area(side1, side2, side3));
      }
      else {
         System.out.print("Invalid inputs");
      }
   }
   
    /** Method returns true if the sum of any two sides is greater than the third */
   public static boolean isValid(double side1, double side2, double side3) {
      if (!(side1 + side2 > side3) || !(side1 + side3 > side2) ||
         !(side2 + side3 > side1)) {
         return false;
      }
      else
         return true;
   }
   
    /** Method returns the area of the triangle */
   public static double area(double side1, double side2, double side3) {
      // Calculate s
      double s = (side1 + side2 + side3) / 2;
      // Calculate area
      double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
      // Return area
      return area;      
   }
}