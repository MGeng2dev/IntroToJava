/** Markov Matrix
 *  An n x n matrix is called a positive Markov matrix if each element is positive
 *  and the sum of the elements in each column is 1. Write the following method
 *  to check whether a matrix is a Markov matrix.
 *
 *    public static boolean isMarkovMatrix(double[][] m) 
 *
 *  Write a test program that prompts the user to enter a 3x3 matrix of double
 *  values and tests whether it is a Markov matrix.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_25 {
   public static void main(String[] args) {
      // Initialize variable
      double[][] m = new double[3][3];
      
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a 3-by-3 matrix row by row: ");
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[0].length; j++) {
            m[i][j] = input.nextDouble();
         }
      }
      
      // Call method & display result
      if (isMarkovMatrix(m) == true) {
         System.out.print("It is a Markov matrix");
      }
      else {
         System.out.print("It is not a Markov matrix");
      }
      
   }
   
    /** Checks for Markov matrix */
   public static boolean isMarkovMatrix(double[][] m) {
      double colSum = 0;
      // Loop thru each element
      for (int j = 0; j < m[0].length; j++) {
         for (int i = 0; i < m.length; i++) {
            colSum = colSum + m[i][j]; 
            if (m[i][j] < 0) {  // check if each element is positive
               return false;
            }
         }
         if (colSum != 1) {  // check if column sum is 1
            return false;
         }
         colSum = 0;
      }
      return true; // will be true if reaches this point
   }
   
}