/** Financial Application: Compute Future Tuition
 * Suppose that the tuition for a university is $10,000 this year and increases 5%
 * every year. In one year, the tuition will be $10,500. Write a program that computes
 * the tuition in ten years and the total cost of four years' worth of tuition
 * after the tenth year.
 *
 */
 
public class Ex05_07 {
   public static void main(String[] args) {
     // Initialize variables
      double total = 0;
      double tuition = 10000;
      
      // Use for loop to calculate tuition increase every year
      for (int i = 2; i <= 13; i++) {
         tuition = tuition * 1.05;
         
         if (i >= 10) {
            System.out.printf("\nTuition Cost " + i + "th Year: $%-8.2f", tuition);
            total = total + tuition;
         }
      }
      
      System.out.printf("\nTotal cost of four years' tutition starting in 10 years: $%-8.2f", total);
   }
}