/** Compute e
 *  You can approximate e using the following series: 
 *
 *     e = 1 + (1/1!) + (1/2!) + (1/3!) + (1/4!) + ... + (1/i!)
 *
 *  Write a program that displays the e value for i = 10,000, 20,000, ..., and 100,000.
 *  (Hint: Because i! = i * (i - 1) * ... * 2 * 1, then
 * 
 *     (1/i!) is (1/(i*(i-1)!)
 *
 *  Initialize e and item to be 1 and keep adding a new item to e. The new item is the
 *  previous item divided by i for i = 2, 3, 4, ....).
 *
 */ 
 
public class Ex05_26 {
   public static void main(String[] args) {  
      // For loop to sum series
      for (int i = 10000; i <= 100000; i = i + 10000) {
         // Initialize variables per problem statement
         double e = 1.0; 
         double item = 1.0;
         for (int j = 2; j <= i; j++) {
            e = e + item;
            item = item / j;
         }
         System.out.print("Sum of series with i = " + i + " is: " + e + "\n");
      }
   }
}