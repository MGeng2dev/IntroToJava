/** Estimate PI
 *  PI can be computed using the following series:
 *    
 *    m(i) = 4*[1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ...
 *       + ((-1)^(i+1)/(2*i-1))
 *
 *  Write a method that returns m(i) for a given i and write a test program
 *  that displays the table shown.
 *
 */
 
public class Ex06_14 {
   public static void main(String[] args) {
      // Print table heading
      System.out.print("i  \t\t\t\tm(i)");
      System.out.print("\n---------------------");
      
      // Loop thru each value of i and print row
      for (int i = 1; i <= 901; i += 100) {
         System.out.printf("\n%-3d\t\t\t\t", i);
         System.out.printf("%-6.4f", computePI(i));  // call method
      }
   }
   
    /** Method estimates PI based on sum series */
   public static double computePI(int i) {
      double sum = 0;
      // Sum series up to current value of i
      for (int j = 1; j <= i; j++) {
         sum = sum + 4.0 * (Math.pow(-1.0, j + 1) / (2.0 * j - 1.0));
      }
      return sum;
   }
}