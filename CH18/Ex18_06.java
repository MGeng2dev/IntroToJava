/** Sum Series
 *  Write a recursive method to compute the following series: 
 *
 *     m(i) = (1/2) + (2/3) + ... + (i / (i + 1))
 *
 *  Write a test program that displays m(i) for i = 1, 2, ... 10
 *
 */
 
import java.util.Scanner;
 
public class Ex18_06 {
   public static void main(String[] args) {
      // Create a scanner and get integer from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      double i = input.nextInt();
      
      // Call method and display result
      System.out.print("Sum of the series with i = " + i + " is " + sum(i));
   }
   
   /** Method to sum series **/
   public static double sum(double i) {
      if (i == 0)
         return 0;     // base case
      else 
         return ((i / (i + 1)) + sum(i - 1));     // recursive call
   }
    
}