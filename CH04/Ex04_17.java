/** Days Of A Month
 *  Write a program that prompts the user to enter a year and the first three letters
 *  of a month name (with the first letter in uppercase) and displays
 *  the number of days in the month. 
 *
 */ 
 
import java.util.Scanner;
 
public class Ex04_17 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int year = input.nextInt();
      System.out.print("Enter a month: ");
      String month = input.next();
      
      // Test for leap year
      boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
      
      // Determine number of days in month
      String days = "";
      // Check for 31 day months
      if (month.equals("Jan") || month.equals("Mar") || month.equals("May") ||
         month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) 
         days = "31";
      // Check for 30 day months
      else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") ||
         month.equals("Nov"))
         days = "30";
      // For February, assign number of days based on leapYear check
      else if (month.equals("Feb")) {
         if (leapYear)
            days = "29";
         else  
            days = "28";
      }
      
      // Display results
      System.out.print(month + " " + year + " has " + days + " days");
   }
}