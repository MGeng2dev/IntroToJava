/** Sum Series
 *  Write a recursive method to compute the following series: 
 * 
 *     m(i) = (1/3) + (2/5) + (3/7) + (4/9) + (5/11) + 6/13) + ... + (i/(2i+1))
 *
 *  Write a test program that displays m(i) for i = 1, 2, ... 10.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex18_05 {
   public static void main(String[] args) {
      // Create scanner and get integer from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int n = input.nextInt();
      
      // Call method and display result
      System.out.print("Sum of the series with i = " + n + " is " + sum(n));      
   }
   
   /** Method returns sum of series **/
   public static double sum(double i) {
      if (i == 0)
         return 0;     // base case
      else
         return ((i / (2 * i + 1)) + sum(i - 1));     // recursive call
   }
   
}