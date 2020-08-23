/** Cost of driving
 *  Write a program that prompts the user to enter the distance to drive, the
 *  fuel efficiency of the car in  miles per gallon, and the price per gallon,
 *  and displays the cost of the trip.
 *
 */
 
import java.util.Scanner;
 
public class Ex02_23 {
   public static void main(String[] args) {
      // Create scanner and get driving distance, miles per gallon, and price per gallon from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the driving distance: ");
      double distance = input.nextDouble();
      System.out.print("Enter miles per gallon: ");
      double miles_per_gallon = input.nextDouble();
      System.out.print("Enter price per gallon: ");
      double price_per_gallon = input.nextDouble();
      
      // Calculate the cost of driving
      double cost_of_driving = distance / miles_per_gallon * price_per_gallon;
      
      // Display result
      System.out.print("The cost of driving is $" + cost_of_driving);
      
   }
}