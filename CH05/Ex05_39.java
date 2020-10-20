/** Financial Application: Find The Sales Amount
 *  You have just started a sales job in a department store. Your pay consists of a base 
 *  salary and a commission. The base salary is $5,000. The scheme shown is used to determine
 *  the commission rate.
 *
 *    Sales Amount            Commission Rate
 *    $0.01-$5,000            8%
 *    $5,000.01-$10,000       10%
 *    $10,000.01 and above    12%
 *
 *  Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
 *  $5,000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the 
 *  commission is 5,000 * 8% + 5000 * 10% + 15,000 * 12% = 2,700.
 *
 *  Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
 *  you have to generate in order to make $30,000. 
 *
 */
 
public class Ex05_39 {
   public static void main(String[] args) {
      // Initialize variables
      double goal = 30000.0;
      double salary = 5000.0;
      double sales = 0.0;
      
      // Use while loop to increase sales amount until goal is reached
      do {
         sales = sales + 0.01; // increase by 1 cent each time
         salary = 5000; // reset salary to base each time while loop runs
         if (sales <= 5000) {
            salary = salary + 0.08 * sales;
         }
         else if (sales <= 10000) {
            salary = salary + 0.08 * 5000 + 0.10 * (sales - 5000);
         }
         else { 
            salary = salary + 0.08 * 5000 + 0.10 * 5000 + 0.12 * (sales - 10000);
         }
      } while (salary < 30000.0);
      
      // Display result
      System.out.printf("Minimum Sales Needed: $%-6.2f", sales);
   }
}