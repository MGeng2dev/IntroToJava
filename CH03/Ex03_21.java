/** Science: day of the week
 *  Zeller's congruence is an algorithm developed by Christian Zeller to calculate
 *  the day of the week. The formula is:
 *  
 *    h = (q + (26(m+1)/10 + k + k/4 + j/4 + 5j) % 7
 *
 *    where:
 *       h is the day of the week (0: Saturday, 1: Sunday, etc.)
 *       q is the day of the month
 *       m is the month (3: March, 4: April, etc. Jan and Feb are counted
 *                   as months 13 and 14 of the previous year)
 *                   
 *       j is the century (i.e., year/100)
 *       k is the year of the century (i.e., year % 100)
 *
 *  Note that the division in the formula performs an integer division. Write
 *  a program that prompts the user to enter a year, month, and day of the
 *  month, and displays the name of the day of the week.
 *
 *  Hint: January and February are counted as 13 and 14 in the formula, 
 *  so you need to convert the user input 1 to 13 and user input 2 to 14 for the month
 *  and change the year to the previous year.
 *
 */
 
import java.util.Scanner;
 
public class Ex03_21 {
   public static void main(String[] args) {
      // Create a scanner & get user inputs
      Scanner input = new Scanner(System.in);
      System.out.print("Enter year: ");
      int year = input.nextInt();
      System.out.print("Enter month (1-12): ");
      int month = input.nextInt();
      System.out.print("Enter the day of the month (1-31): ");
      int day = input.nextInt();
      
      // Use zeller formula
      int q = day;
      if (month == 1 || month == 2) {
         month = month + 12;
         year = year - 1;
      }
      int m = month;
      int j = year / 100;
      int k = year % 100;
      int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
   
      // Display the result
      switch (h) {
         case 0: System.out.print("Day of the week is Saturday");
            break;
         case 1: System.out.print("Day of the week is Sunday");
            break;
         case 2: System.out.print("Day of the week is Monday");
            break;
         case 3: System.out.print("Day of the week is Tuesday");
            break;
         case 4: System.out.print("Day of the week is Wednesday");
            break;
         case 5: System.out.print("Day of the week is Thursday");
            break;
         case 6: System.out.print("Day of the week is Friday");
            break;
      }
      
   }
}
