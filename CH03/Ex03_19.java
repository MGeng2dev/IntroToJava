/** Compute the perimeter of a triangle
 *  Write a program that reads three edges for a triangle and computes
 *  the perimeter if the input is valid. Otherwise, display that the input
 *  is invalid. The input is valid if the sum of every pair of 
 *  two edges is greater than the remaining edge.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_19 {
   public static void main(String[] args) {
      // Create a scanner & get 3 edges from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 3 edges: ");
      double side1 = input.nextDouble();
      double side2 = input.nextDouble();
      double side3 = input.nextDouble();
      
      // If triangle is valid, display perimeter
      if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
         System.out.print("Perimeter of triangle = " + (side1 + side2 + side3));
      else
         System.out.print("Not a valid triangle");
         
   }
}