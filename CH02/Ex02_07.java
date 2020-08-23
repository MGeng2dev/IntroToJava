/** Find the number of years
 *  Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
 *  and displays the number of years and days for the minutes.
 *  For simplicity, assume a year has 365 days.
 *
 */
 
import java.util.Scanner;
 
public class Ex02_07 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of minutes (minimum 525,600) ");
      int min = input.nextInt();
      
      // Convert minutes to years and days
      int years = min / 365  / 24 / 60; 
      int days = (min % (years * 365 * 24 * 60)) / (24 * 60); 
      //int days = (min - (years * 365 * 24 * 60)) / (24 * 60); -- Alternative math
      
      // Display result
      System.out.print(min + " minutes is approximately " + years + " years and " + days + " days");
      
   }
}