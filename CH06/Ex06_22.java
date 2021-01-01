/** Math: Approximate The Square Root
 *  There are several techniques for implementing the sqrt method in the Math class. One such technique
 *  is known as the Bablonian method. It approximates the square root of a number, n, by repeatedly
 *  performing a calculation using the following formula:
 *
 *    nextGuess = (lastGuess + n / lastGuess) / 2
 *
 *  When nextGuess and lastGuess are almost identical, nextGuess is the approximated square root.
 *  The initial guess can be any positive value (e.g., 1). This value will be the starting value 
 *  for lastGuess. If the difference between nextGuess and lastGuess is less than a very small number,
 *  such as 0.0001, you can claim that nextGuess is the approximated square root of n. If not,
 *  nextGuess becomes lastGuess and the approximation process continues. Implement the following
 *  method that returns the square root of n.
 *
 *    public static double sqrt(long n) 
 *
 */
 
import java.util.Scanner;
 
public class Ex06_22 {
   public static void main(String[] args) {
      // Create scanner & get input long from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer to get the square root: ");
      long n = input.nextLong();
      
      // Call method & print result
      System.out.print("The approximated square root is: " + sqrt(n));
      
   }
   
    /** Metho returns the approximated square root of a long int */
   public static double sqrt(long n) {
      double lastGuess = 1;
      double nextGuess = (lastGuess + n / lastGuess) / 2;
      
      while (Math.abs(nextGuess - lastGuess) > 0.0001) {
         lastGuess = nextGuess;
         nextGuess = (lastGuess + n / lastGuess) / 2;
      }
      return nextGuess;
   }
   
}
         
