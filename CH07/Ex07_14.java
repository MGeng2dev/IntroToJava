/** Computing GCD
 *  Write a method that returns the GCD of an unspecified number of integers.
 *  The method header is specified as follows:
 *
 *    public static int gcd(int... numbers)
 *
 *  Write a test program that prompts the user to enter five numbers, invokes
 *  the method to find the GCD of these numbers, and displays the GCD.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_14 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter five numbers: ");
      int[] nums = new int[5];
      for (int i = 0; i < 5; i++) {
         nums[i] = input.nextInt();
      }
      
      // Call method & display result
      System.out.print("GCD is: " + gcd(nums));
      
   }
   
    /** Method returns the GCD */
   public static int gcd(int... numbers) {
      int gcd = numbers[0];
      for (int i = 0; i < numbers.length - 1; i++) {
         gcd = gcd(gcd, numbers[i]);
      }
      return gcd;
   }
   
    /** Method returns the GCD of two numbers */
   public static int gcd(int n1, int n2) {  // From Listing 5.9
      int gcd = 1;  // initial gcd is 1 
      int k = 1;  // possible gcd
      while (k <= n1 && k <= n2) {
         if (n1 % k == 0 && n2 % k == 0)
            gcd = k;
         k++;
      }
      return gcd;
   }            
   
}