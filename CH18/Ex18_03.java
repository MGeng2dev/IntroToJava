/** Compute Greatest Common Divisor Using Recursion
 *  The gcd(m, n) can also be defined recursively as follows: 
 *     - If m % n is 0, gcd(m, n) is n
 *     - Otherwise, gcd(m, n) is gcd(n, m % n)
 *
 *  Write a recursive method to find the GCD. Write a test program that prompts
 *  the user to enter two integers and displays their GCD.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex18_03 {
   public static void main(String[] args) {
      // Create scanner and get two integers from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two integers: ");
      int m = input.nextInt();
      int n = input.nextInt();
      
      // Call method & display result
      System.out.println("The GCD of " + m + " and " + n + " is " + gcd(m, n));
      
   }
   
   /** Method returns the GCD of two integers **/
   public static int gcd(int m, int n) {
      if (m % n == 0)    // base case
         return n;
      else 
         return gcd(n, m % n);     // recusrive call
      
   }
   
}