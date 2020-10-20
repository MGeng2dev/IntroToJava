/** Find Numbers Divisble By 5 And 6
 *  Write a program that displays all the numbers from 100 to 1,000, ten per line, 
 *  that are divisble by 5 or 6. Numbers are separated by exactly one space.
 *
 */
 
public class Ex05_10 {
   public static void main(String[] args) {
     // Initialize variable to control the amount of numbers on a line
      int lineCount = 0;
      
      // For loop to go thru all numbers from 100 to 1000
      for (int i = 100; i <= 1000; i++) {
         // Check if current number is divisible by 5 and 6
         if (i % 5 == 0 && i % 6 ==0) {
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
