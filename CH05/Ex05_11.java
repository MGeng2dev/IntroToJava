/** Find Numbers Divisible By 5 Or 6, But Not Both
 *  Write a program that displays all the numbers from 100 to 200, ten per line,
 *  that are divisble by 5 or 6, but not both. Numbers are separated by exactly 
 *  one space.
 *
 */
 
public class Ex05_11 {
   public static void main(String[] args) {
      int lineCount = 0;
      
      // For loop to go thru all numbers from 100 to 200
      for (int i = 100; i <= 200; i++) {
         // Check if current number is divisible by 5 or 6 but not both
         if (i % 5 == 0 ^ i % 6 == 0) {
            // Check if a new line should be started
            if (lineCount % 10 == 0) {
               System.out.print("\n" + i + " ");
               lineCount++;
            }
            else {
               System.out.print(i + " ");
               lineCount++;
            }
         }
      }
      
   }
}