/** Demonstrate Cancellation Errors
 *  A cancellation error ocurrs when you are manipulating a very large number with a 
 *  very small number. The large number may cancel out the smaller number. For example,
 *  the result of 100000000.0 + 0.000000001 is equal to 100000000.0. To avoid 
 *  cancellation errors and obtain more accurate results, carefully select the order 
 *  of computation. For example, in computing the following series, you will obtain 
 *  more accurate results by computing from right to left rather than from left to right:
 * 
 *     1+(1/2)+(1/3)+ ... +(1/n)
 *
 *  Write a program that compares the results of the summation of the preceding series,
 *  computing from left to right and from right to left with n = 50000.
 *
 */
 
public class Ex05_23 {
   public static void main(String[] args) {
      int n = 50000;
      double sum1 = 0;
      double sum2 = 0;
      
      for (int i = 1; i <= n; i++) {
         sum1 = sum1 + (1.0 / i);
      }
      
      for (int i = n; i > 0; i--) {
         sum2 = sum2 + (1.0 / i);
      }
      
      System.out.print("Sum computing from left to right: " + sum1);
      System.out.print("\nSum computing from right to left: " + sum2);
      System.out.print("\nDifference between sums: " + Math.abs(sum1 - sum2));
   }
}