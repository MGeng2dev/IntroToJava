/** Math Combinations
 *  Write a program that displays all possible combinations for picking two numbers from
 *  integers 1 to 7. Also display the total number of combinations.
 *
 */
 
public class Ex05_43 {
   public static void main(String[] args) {
     // Initialize counter
      int count = 0;
      
      // Nested for loop to go thru all combinations
      for (int i = 1; i <= 7; i++) {
         for (int j = i + 1; j <=7; j++) {
            System.out.print("\n" + i + " " + j);
            count++;
         }
      }
      
      // Display total count
      System.out.print("\nThe total number of all combinations is: " + count);
   }
}