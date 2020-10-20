/** Financial Application: Find The Sales Amount
 *  Rewrite Programming Exercise 5.39 as follows:
 *     - Use a for loop instead of a do-while loop
 *     - Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant
 *
 */
 
import java.util.Scanner;
 
public class Ex05_42 {
   public static void main(String[] args) {
      // Create a scanner and get commission_sought
      Scanner input = new Scanner(System.in);
      System.out.print("Enter commission sought: ");
      double COMMISSION_SOUGHT = input.nextDouble();
      
      // Initialize variables
      double salary = 5000;
      double sales = 0;
      
      // For loop to test increaseing amount of sales until goal is reached
      for (double i = 5000; salary <= COMMISSION_SOUGHT; i = i + 0.01) {
         salary = 5000; // reset salaray to base from previous iteration
         sales = i; // save i to variable that can be accessed out side loop
         if (i <= 5000) {
            salary = salary + 0.08 * sales;
         }
         else if (i <= 1000) {
            salary = salary + 0.08 * 5000 + 0.10 * (sales - 5000);
         }
         else { 
            salary = salary + 0.08 * 5000 + 0.10 * 5000 + 0.12 * (sales - 10000);
         }
      }
      
      System.out.printf("Minimum Sales Needed: $%-6.2f", sales);
   }
}