/** Count Positive And Negative Numbers And Compute The Average Of Numbers
 *  Write a program that reads an unspecified number of integers, determines how
 *  many positive and negative values have been read, and computes the total and
 *  average of the input values (not counting zeros). Your program ends with the 
 *  input 0. Display the average as a floating-point number.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_01 {
   public static void main(String[] args) {
      // Create scanner & prompt user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer, the input ends if it is 0: ");
      int value = input.nextInt();
      
      // Initialize variables
      double sum = 0;
      int countPositive = 0;
      int countNegative = 0;
      
      // Use while loop to save inputs until 0 is input
      if (value == 0)
         System.out.print("No numbers are entered except 0");
      else {
         while (value != 0) {
            sum = sum + value;
            if (value > 0)
               countPositive++;
            else
               countNegative++;
            value = input.nextInt();
         }
      
         // Calculate average
         double average = sum / (countPositive + countNegative);
         
         // Display result
         System.out.print("The number of positives is " + countPositive);
         System.out.print("\nThe number of negatives is " + countNegative);
         System.out.print("\nThe total is " + sum);
         System.out.print("\nThe average is " + average);
      }
   }
}