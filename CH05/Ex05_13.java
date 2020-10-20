/** Find The Largest n Such That n^3 < 12,000
 *  Use a while loop to find the largest integer n such that n^3 is less than 12,000.
 *
 */
 
public class Ex05_13 {
   public static void main(String[] args) {
     // Initialize variables
      int n = 0;
      double total = 0;
      
      // While loop to find largest integer n with n^3 < 12,000
      while (Math.pow((n + 1),3) < 12000) {
         n++;
      }
      
      // Display result
      System.out.print(n);
   }
}