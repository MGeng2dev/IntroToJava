/** Science: calculating energy
 *  Write a program that calculates the energy needed to heat water from an initial temperature 
 *  to a final temperature. Your program should prompt the user to enter the amount of water
 *  in kilograms and the initial and final temperatures of the water. 
 *  The forumla to compute the energy is: 
 *     Q = M * (finalTemperature - initialTemperature) * 4184;
 *        Where M is the weight of water in kilograms, temperatures are in degrees Celsius,
 *        and energy Q is measured in joules.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex02_10 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount of water in kilograms: ");
      double m = input.nextDouble();
      System.out.print("Enter the initial temperature: ");
      double initialTemp = input.nextDouble();
      System.out.print("Enter the final temperature: ");
      double finalTemp = input.nextDouble();
      
      // Perform calculations
      double q = m * (finalTemp - initialTemp) * 4184;
      
      // Display results
      System.out.print("The energy needed is " + q);
      
   }
}