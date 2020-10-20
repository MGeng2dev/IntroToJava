/** Display Calendars
 *  Write a program that prompts the user to enter the year and the frist day of the 
 *  year and displays the calendar table for the year on the console. For example,
 *  if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, your
 *  program should display the calendar for each month in the year, as follows:
 *
*                  January 2013
*     Sun   Mon   Tue   Wed  Thu   Fri   Sat
*                  1     2    3     4     5
*      6     7     8     9   10    11    12
*     13    14    15    16   17    18    19
*     20    21    22    23   24    25    26
*     27    28    29    30   31
*
*                 December 2013
*     Sun   Mon   Tue   Wed  Thu   Fri   Sat
*      1     2     3     4    5     6     7
*      8     9    10    11   12    13    14
*     15    16    17    18   19    20    21
*     22    23    24    25   26    27    28
*     29    30    31  
*
*/

import java.util.Scanner;

public class Ex05_29 {
   public static void main(String[] args) {
      // Create a scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter year: ");
      int year = input.nextInt();
      System.out.print("Enter first day of the year: ");
      int firstDay = input.nextInt();
      
      // Check for leap year
      boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
      
      // For loop thru each month 
      for (int month = 1; month <= 12; month++) {
         int dotw  = firstDay % 7; // Convert 1st of month into an integer for day of the week
         // Print the month and year
         switch (month) {
            case (1): System.out.print("\n              January " + year); 
               break;
            case (2): System.out.print("\n             February " + year); 
               break;
            case (3): System.out.print("\n               March " + year); 
               break;
            case (4): System.out.print("\n               April " + year); 
               break;
            case (5): System.out.print("\n                May " + year); 
               break;
            case (6): System.out.print("\n               June " + year); 
               break;
            case (7): System.out.print("\n               July " + year); 
               break;
            case (8): System.out.print("\n              August " + year); 
               break;
            case (9): System.out.print("\n             September " + year); 
               break;
            case (10): System.out.print("\n              October " + year); 
               break;
            case (11): System.out.print("\n             November " + year); 
               break;
            case (12): System.out.print("\n             December " + year); 
               break;
         }
          
         System.out.print("\n---------------------------------------"); //39
         System.out.print("\nSun\tMon\tTue\tWed\tThu\tFri\tSat\n");
         
         // Print leading whitespace before 1st of each month
         switch (dotw) {
            case (0): System.out.print("");
               break;
            case (1): System.out.print("      "); 
               break;
            case (2): System.out.print("            "); 
               break;
            case (3): System.out.print("                  "); 
               break;
            case (4): System.out.print("                        "); 
               break;
            case (5): System.out.print("                              "); 
               break;
            case (6): System.out.print("                                    "); 
               break;
         }
         
         // Determine how many days in the current month
         int daysInMonth = 0;
         if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
               month == 10 || month == 12) { 
            daysInMonth = 31;
         }
         else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
         }
         else if (month == 2) {
            if (leapYear) {
               daysInMonth = 29;
            }
            else {;
               daysInMonth = 28; 
            }
         }
         firstDay = firstDay + daysInMonth; // Update first day for next month
         
         // Print dates for current month
         for (int j = 1; j <= daysInMonth; j++) {
            if (j <= 9) {
               System.out.print(" " + j + "    ");
            }
            else {
               System.out.print(j + "    ");
            }
            dotw = dotw + 1;
            if (dotw % 7 == 0) {
               System.out.print("\n");
            }
         }
         System.out.print("\n");
      }
   
   }
}
