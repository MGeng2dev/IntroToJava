/** Display Numbers In A Pyramid Pattern
 *  Write a nested for loop that prints the following output:
 *
 *                                1
 *                            1   2   1
 *                        1   2   4   2   1 
 *                    1   2   4   8   4   2   1
 *                1   2   4   8  16   8   4   2   1
 *            1   2   4   8  16  32  16   8   4   2   1
 *        1   2   4   8  16  32  64  32  16   8   4   2   1
 *    1   2   4   8  16  32  64 128  64  32  16   8   4   2   1
 *
 */
 
import java.util.Scanner;
 
public class Ex05_19 {
   public static void main(String[] args) {
     
      for (int i = 1; i <= 8; i++) {  // Outer loop controls the rows 
         for (int j = 4 * (8-i); j > 0; j--) {
            System.out.print(" "); // Prints whitespace before numbers on each row
         }
         for (int k = 1; k <= i; k++) {  // Prints ascending numbers on each row
            int value = (int)(Math.pow(2, (k - 1)));
            if (value < 10)
               System.out.print("   " + value);
            else if (value < 100)
               System.out.print("  " + value);
            else 
               System.out.print(" " + value);
         }
         for (int n = i -1; n > 0; n--) {  // Prints descending numbers on each row
            int value = (int)(Math.pow(2, (n - 1)));
            if (value < 10)
               System.out.print("   " + value);
            else if (value < 100)
               System.out.print("  " + value);
         }
         System.out.print("\n"); // Go to n ext line after inner loops execute
      }
   
   }
}