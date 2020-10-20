/** Display Leap Years
 *  Write a program that displays all the leap years, ten per line, from 101 to 2100, separate
 *  by exactly one space. Also display the number of leap years in this period.
 *
 */
 
public class Ex05_27 {
   public static void main(String[] args) {
     // Initialize variables
      int count = 0;
      int lineCount = 0;
      
      // Loop thru years from 101 to 2100
      for (int year = 101; year <= 2100; year++) {
         // Check if year is leap year
         if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            // Check if a new line should be started
            if (lineCount % 10 == 0) {
               System.out.print("\n" + year + " ");
               lineCount++;
            }
            // Else, continue on current line
            else {
               System.out.print(year + " ");
               lineCount++;
            }
            count++; 
         }
      }
      
      // Display total count of leap years
      System.out.print("\nNumber of Leap Years in this Period: " + count);
      
   }
}