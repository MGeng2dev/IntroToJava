/** Cost of shipping
 *  A shipping company uses the following function to calculate the cost (in 
 *  dollars) of shipping based on the weight of the package (in pounds). 
 * 
 *       c(w) = { 3.5, if 0 < w <= 1
 *              { 5.5, if 1 < w <= 3
 *              { 8.5, if 3 < w <= 10
 *              { 10.5, if 10 < w <= 20
 *
 *  Write a program that prompts the user to enter the weight of the package
 *  and display the shipping cost. If the weight is greater than 50, 
 *  display a message "the package cannot be shipped". 
 *
 */
 
import java.util.Scanner;
 
public class Ex03_18 {
   public static void main(String[] args) {
      // Create a scanner & get weight input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight of the package: ");
      double weight = input.nextDouble();
      
      // Determine shipping cost & display
      if (weight <= 0)
         System.out.print("Invalid weight.");
      else if (weight <= 1) 
         System.out.print("Shipping cost for " + weight + " lbs is $3.50");
      else if (weight <= 3)
         System.out.print("Shipping cost for " + weight + " lbs is $5.50");
      else if (weight <= 10)
         System.out.print("Shipping cost for " + weight + " lbs is $8.50");
      else if (weight <= 20)
         System.out.print("Shipping cost for " + weight + " lbs is $10.50");
      else if (weight <= 50)
         System.out.print("Shipping cost is unclear"); // problem statement doesn't provide this
      else
         System.out.print("The package cannot be shipped");
   
   }
}
