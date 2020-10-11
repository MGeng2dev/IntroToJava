/** Fibonacci Series
 *  Modify Listing 18.2, ComputeFibonacci.java, so that the program finds
 *  the number of times the fib method is called. 
 *  Hint: Use a static variable and increment it every time the method is called.
 *
 *  Comment: Number of calls should match Table 18.1.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex18_07 {
   public static void main(String[] args) {
      // Create scanner and get integer from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int n = input.nextInt();
      
      // Call method and display result
      System.out.println("Fibonaaci number at index " + n + " is " + fib(n));
      System.out.println("Number of times fib() method was called " + numCalls);      
      
   }
   
   public static int numCalls = 0; // declare static variable in class (outside main method)
   
   /** Method returns Fibonacci number **/
   public static long fib(long index) {
      numCalls++; // increment each time method is called
      if (index == 0)
         return 0;     // base case
      else if (index == 1)
         return 1;     // base case
      else
         return fib(index - 1) + fib(index - 2);    // recursive call 
   }
   
}