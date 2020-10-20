/** Find The Smallest n Such That n^2 > 12,000
 *  Use a while loop to find the smallest integer n such that n^2 is greater than 12,000.
 *
 */
 
public class Ex05_12 { 
   public static void main(String[] args) {
     // Initialize variables
      int n = 0;
      int total = 0;
      
      // While loop to find smallest integer with square > 12,000
      while (total < 12000) {
         n++;
         total = n * n;
      }
      
      // Display result
      System.out.print(n);
   }
}