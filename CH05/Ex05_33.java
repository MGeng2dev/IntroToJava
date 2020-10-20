/** Perfect Number
 *  A positive integer is called a perfect number if it is equal to the sum of all its
 *  positive divisors, excluding itself. For example, 6 is the first perfect number
 *  because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are four 
 *  perfect numbers less than 10,000. Write a program to find all these four numbers.
 *
 */
 
public class Ex05_33 {
   public static void main(String[] args) {
      // Approximate e
      for (int i = 10000; i <= 100000; i += 10000) {
         double e = 1.0;
         double item = 1.0;
         for (int j = 2; j <= i; j++) {
            e = e + item;
            item = item / j;
         }
         // Print e value
         System.out.print("e approximation with i = " + i + " is: " + e + "\n");
      }
   
   }
}