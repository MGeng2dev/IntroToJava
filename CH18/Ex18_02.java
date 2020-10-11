/** Fibonacci Numbers
 *  Rewrite the fib method in Listing 18.2 using iterations.
 *  Hint: To compute fib(n) without recursion, you need to obtain fib(n-2) and fib(n-1) first.
 *  Let f0 and f1 denote the two prvious Fibonacci numbers.
 *  The current Fibonacci number would then be f0 + f1.
 *  The algorithm can be described as follows: 
 *       f0 = 0; // for fib(0)
 *       f1 = 1; // for fib(1)
 *
 *       for (int i=1; i <= n; i++) {
 *          currentFib = f0 + f1
 *          f0 = f1;
 *          f1 = currentFib;
 *       }
 *       // after the loop, currentFib is fib(n)
 *
 *  Write a test program that prompts the user to enter an index and display its Fibonacci number.
 *
 *  Comment: Algorithm given in textbook is incorrect. For loop should have i < n (not i <= n).
 *
 */
 
import java.util.Scanner;
 
public class Ex18_02 {
   public static void main(String[] args) {
      // Create scanner and get integer from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int index = input.nextInt();
      
      // Call method & display result
      System.out.println("Fibonacci number of " + index + " is " + fib(index));
      
   }
      
    /** Method for finding the Fibonacci number **/
   public static long fib(long index) {
      if (index == 0)
         return 0;
      else if (index == 1)
         return 1;
      else {
         long f0 = 0;
         long f1 = 1; 
         long currentFib = 0;
            
         for (int i = 1; i < index; i++) {
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
         }
         return currentFib;
      }
   }
      
}