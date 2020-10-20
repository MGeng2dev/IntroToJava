/** Display The First Days Of Each Month
 *  Write a program the prompts the user to enter the year and fir th day of the year,
 *  and displays the first day of each month in the year. For example, if the user entered
 *  the year 2013, and 2 for Tuesday, January 1, 2013, your program should display
 *  the following output:
 *
 *    January 1, 2013 is Tuesday
 *    ...
 *    December 1, 2013 is Sunday
 *
 */
 
import java.util.Scanner;
 
public class Ex05_28 {
   public static void main(String[] args) {
      // Create a scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter year: ");
      int year = input.nextInt();
      System.out.print("Enter first day of the year: ");
      int day = input.nextInt();
      
      // Check for leap year
      boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
      
      // For loop thru each month 
      for (int month = 1; month <= 12; month++) {
         int dotw  = day % 7; // Determines an integer corresponding to day of the week
         // Print the month and year
         switch (month) {
            case (1): System.out.print("January 1, " + year + " is "); 
               break;
            case (2): System.out.print("February 1, " + year + " is "); 
               break;
            case (3): System.out.print("March 1, " + year + " is "); 
               break;
            case (4): System.out.print("April 1, " + year + " is "); 
               break;
            case (5): System.out.print("May 1, " + year + " is "); 
               break;
            case (6): System.out.print("June 1, " + year + " is "); 
               break;
            case (7): System.out.print("July 1, " + year + " is "); 
               break;
            case (8): System.out.print("August 1, " + year + " is "); 
               break;
            case (9): System.out.print("September 1, " + year + " is "); 
               break;
            case (10): System.out.print("October 1, " + year + " is "); 
               break;
            case (11): System.out.print("November 1, " + year + " is "); 
               break;
            case (12): System.out.print("December, " + year + " is "); 
               break;
         }
         
         // Print the day of the week
         switch (dotw) {
            case (0): System.out.print("Sunday\n");
               break;
            case (1): System.out.print("Monday\n"); 
               break;
            case (2): System.out.print("Tuesday\n"); 
               break;
            case (3): System.out.print("Wednesday\n"); 
               break;
            case (4): System.out.print("Thursday\n"); 
               break;
            case (5): System.out.print("Friday\n"); 
               break;
            case (6): System.out.print("Saturday\n"); 
               break;
         }
      
         // Determine how many days in the current month
         if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
               month == 10 || month == 12) {
            day = day + 31; 
         }
         else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = day + 30;
         }
         else if (month == 2) {
            if (leapYear)
               day = day + 29;
            else 
               day = day + 28;
         }
      }
   
   }
}


      
