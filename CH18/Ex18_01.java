/** Factorial
 *  Using the BigInteger class introduced in Section 10.9, you can find the factorial for a large
 *  number (e.g., 100!). Implement the factorial method using recursion. Write a program
 *  that prompts the user to enter an integer and displays its factorial.
 *
 */ 
 
import java.util.Scanner;
import java.math.*;
 
public class Ex18_01 {
   public static void main(String[] args) {
      // Create scanner and get integer from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a non-negative integer: ");
      int n = input.nextInt();
      
      // Convert n to BigInteger
      BigInteger bigN = new BigInteger(String.valueOf(n));
      
      // Display factorial
      System.out.println("Factorial of " + n + " is " + factorial(bigN));
   
   }
      
    /** Method returns factorial (input and output type BigInteger) **/
   public static BigInteger factorial(BigInteger n) {
      if (n.equals(BigInteger.ZERO))     // base case
         return BigInteger.ONE;
      else
         return n.multiply(factorial(n.subtract(BigInteger.ONE)));      // recursive call
            
   }
      
}