/** Find future dates
 *  Write a program that prompts the user to enter an integer for today's day
 *  of the week (Sunday is 0, Monday is 1, ... , and Saturday is 6). Also prompt
 *  the user to enter the number of days after today for a future day and display
 *  the future day of the week. 
 *
 */
 
import java.util.Scanner;
 
public class Ex03_05 {
   public static void main(String[] args) {
      // Create a scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter today's day: ");
      int today = input.nextInt();
      System.out.print("Enter the number of days elapsed since today: ");
      int future = input.nextInt();
      
      // Display today's day
      System.out.print("Today is ");
      switch (today) {
         case 0: System.out.print("Sunday"); 
            break;
         case 1: System.out.print("Monday"); 
            break;
         case 2: System.out.print("Tuesday"); 
            break;
         case 3: System.out.print("Wednesday"); 
            break;
         case 4: System.out.print("Thursday"); 
            break;
         case 5: System.out.print("Friday"); 
            break;
         case 6: System.out.print("Saturday"); 
            break;
         case 7: System.out.print("Sunday"); 
            break;
      }
         
      // Display future day
      System.out.print(" and the future day is ");
      int future_day = (today + future) % 7;
      switch (future_day) {
         case 0: System.out.print("Sunday"); 
            break;
         case 1: System.out.print("Monday"); 
            break;
         case 2: System.out.print("Tuesday"); 
            break;
         case 3: System.out.print("Wednesday"); 
            break;
         case 4: System.out.print("Thursday"); 
            break;
         case 5: System.out.print("Friday"); 
            break;
         case 6: System.out.print("Saturday"); 
            break;
         case 7: System.out.print("Sunday"); 
            break;
      }
      
   }
}
      
