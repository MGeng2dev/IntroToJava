/** Summation
 *  Write a program to compute the following summation.
 *
 *     (1/(1+sqrt(2))) + (1/(sqrt(2)+sqrt(3))) + (1/(sqrt(3)+sqrt(4))) + ... +
 *          (1/(sqrt(624)+sqrt(625)))
 *
 */
 
public class Ex05_35 {
   public static void main(String[] args) {
      // Initialize variable
      double sum = 0;
      
      // For loop to calculate sum of series
      for (int i = 1; i < 625; i++) {
         sum = sum + (1.0 / (Math.pow(i, 0.5) + Math.pow((i + 1.0), 0.5)));
      }
      
      // Display the result
      System.out.print("The sum of the series is: " + sum);
   }
}