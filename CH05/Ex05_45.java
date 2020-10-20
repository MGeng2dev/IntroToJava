/** Statistics: Compute Mean And Standard Deviation
 *  In business applications, you are often asked to compute the mean and standard deviation 
 *  of data. The mean is simply the average of the numbers. The standard deviation is a 
 *  statistic that tells you how tightly all the various data are clustered around the mean 
 *  in a set of data.
 *  For example, what is the average age of the students in a class? How close are the ages?
 *  If all students are the same age, the deviation is 0.
 *  
 *  Write a program that prompts the user to enter ten numbers, and displays the mean and 
 *  standard deviations of these numbers using the following formula: 
 *
 *    Mean = (x1 + x2 + ... + xn) / n
 *
 *    Deviation = sqrt(((sum x)^2 - ((sum x)^2 / n)) / (n-1))
 *
 */
 
import java.util.Scanner;
 
public class Ex05_45 {
   public static void main(String[] args) {
      // Create scanner & prompt user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ten numbers: ");
      
      // Initialize variables
      double sum = 0;
      double devSum = 0;
        
      // Use for loop to capture all number inputs
      for (int i = 1; i <= 10; i++) {
         double value = input.nextDouble(); // capture individual number
         sum = sum + value; // sum all the numbers for mean calculation
         devSum = devSum + Math.pow(value, 2); // sum the squares of all numbers for std dev calculation
      }
      
      // Calculate meand & standard deviation
      double mean = sum / 10;
      double deviation = Math.sqrt((devSum - (Math.pow(sum, 2) / 10)) / (10 - 1));
      
      // Display results
      System.out.print("The mean is " + mean);
      System.out.print("\nThe standard deviation is " + deviation);
   }
}