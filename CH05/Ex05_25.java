/** Compute PI
 *  You can approximate PI by using the following series: 
 *
 *     PI = 4*(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+...+((-1)^(i+1))/(2*i-1))
 *
 *  Write a program that displays the PI value for i = 10,000, 20,000,... 
 *  and 100,000.
 *
 */
 
 
public class Ex05_25 {
   public static void main(String[] args) {
      // Initialize variable for pi
      double sum = 0;
      
      // For loop to sum series
      for (int i = 1; i <= 100000; i++) {
         // Caculate sum
         sum = sum + 4.0 * (Math.pow(-1.0, (i + 1.0)) / (2.0 * i - 1.0));
         // Print pi value for i = 10,000, 20,000, etc.
         if (i % 10000 == 0) {
            System.out.print("Sum of series with i = " + i + " is: " + sum + "\n");
         }
      }
   
   }
}
