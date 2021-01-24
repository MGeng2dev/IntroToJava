/** Statistics: Compute Deviation
 *  Programming Exercise 5.45 computes the standard deviation of numbers. This exercise
 *  uses a different but equivalent formula to compute the standard deviation of n numbers: 
 *  
 *    mean = (x1 + x2 + ... + xn) / n
 *
 *    deviation = sqrt((xi - mean)^2 / (n-1))
 *
 *  To compute the standard deviation with this formula, you have to store the individual
 *  numbers using an array, so that they can be used after the mean is obtained. Your program
 *  should contain the following methods: 
 *
 *     /** Compute the deviation of double values 
 *     public static double deviation(double[] x)
 *
 *     /** Compute the mean of an array of double values
 *     public static double mean(double[] x)
 *
 *  Write a test program that prompts the user to enter ten numbers and displays the mean
 *  and standard deviation.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_11 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ten numbers: ");
      double[] inputArray = new double[10];
      for (int i = 0; i < inputArray.length; i++) {
         inputArray[i] = input.nextDouble();
      }
      
      // Call methods & display result
      System.out.print("The mean is: " + mean(inputArray));
      System.out.print("\nThe standard deviation is: " + deviation(inputArray));
      
   }
   
    /** Compute the deviation of double values */
   public static double deviation(double[] x) {
      double mean = mean(x);
      double numerator = 0;
      for (int i = 0; i < x.length; i++) {
         numerator = numerator + Math.pow((x[i] - mean), 2);
      }
      return Math.pow((numerator / (x.length - 1)), 0.5);
   }
   
    /** Compute the mean of an array of double values */
   public static double mean(double[] x) {
      double sum = 0;
      for (int i = 0; i < x.length; i++) {
         sum = sum + x[i];
      }
      return sum / x.length;
   }
   
}