/** Population projection
 *  Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years
 *  and displays the population after the number of years.
 *  Use the hint in Programming Exercise 1.11 for this program.
 *  The population should be cast into an integer.
 *
 *     Population projections are based on the following assumptions (from Ex01_11):
 *     Current Population: 312,032,486
 *     One birth every 7 seconds
 *     One death every 13 seconds
 *     One new immigrant every 45 seconds
 *
 */
 
import java.util.Scanner;
 
public class Ex02_11 {
   public static void main(String[] args) {
      // Create a scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of years: ");
      int years = input.nextInt();
      
      // Declare and initialize variables
      int currentPop = 312032486; // current population
      final int SECONDS_PER_YEAR = 365 * 24 * 60 * 60;
      double birthsPerYear = SECONDS_PER_YEAR / 7;
      double deathsPerYear = SECONDS_PER_YEAR / 13;
      double immigrantsPerYear = SECONDS_PER_YEAR / 45;
      
      // Calculate population projection
      int finalPop = (int)(currentPop + (birthsPerYear - deathsPerYear + immigrantsPerYear) * years);
      
      // Display result
      System.out.println("The population in " + years + " years is " + finalPop);
      
   }
}