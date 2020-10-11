/** Sum Series
 *  Write a recursive method to compute the following series: 
 *
 *     m(i) = 1 + (1/2) + (1/3) + ... + (1/i)
 *
 *  Write a test program that displays m(i) for i = 1, 2, ... 10.
 *
 */
 
import java.util.Scanner;
 
public class Ex18_04 {
   public static void main(String[] args) {
      // Create scanner and get integer from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a integer: ");
      double i = input.nextInt();
      
      // Call method and display result
      System.out.println("Sum of the series with i = " + i + " is " + sum(i));
      
   }
   
   /** Method to sum the series **/
   public static double sum(double i) {
      if (i == 0)
         return 0;     // base case
      else if (i == 1)
         return 1;     // base case
      else 
         return ((1 / i) + sum(i - 1));     // recursive call
         
   }

}