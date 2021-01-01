/** Sum Series
 *  Write a method to compute the following series:
 *
 *     m(i) = 1/2 + 2/3 + ... + i/(i+1)
 *
 *  Write a test program that displays the table shown.
 *
 */
 
public class Ex06_13 {
   public static void main(String[] args) {
      // Print table heading
      System.out.print("i\t\t\tm(i)");
      System.out.print("\n----------------");
   
      // For loop thru values of i for table & print rows
      for (int i = 1; i <= 20; i++) {
         System.out.printf("\n%-2d\t\t\t", i);
         System.out.printf("%7.4f", sumSeries(i));  // method call
      }
   }
   
    /** Method computes the sum series */
   public static double sumSeries(int i) {
      double sum = 0;
      // Sum series from 1 to current i value
      for (int j = 1; j <= i; j++) {
         sum = sum + j / (j + 1.0);
      }
      return sum;
   }
}