/** Health application: computing BMI
 *  Body Mass Index (BMI) is a measure of health on weight. It can be calculated
 *  by taking your weight in kilograms and dividing by the square of your height
 *  in meters. 
 *  Write a program that prompts the user to enter a weight in pounds and height
 *  in inches and displays the BMI. 
 *
 *     Note that 1 pound is 0.45359237 kilograms 
 *     and 1 inch is 0.0254 meters.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex02_14 {
   public static void main(String[] args) {
      // Create scanner and get weight & height from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight in pounds: ");
      double weight_in_pounds = input.nextDouble();
      System.out.print("Enter height in inches: ");
      double height_in_inches = input.nextDouble();
      
      // Calculate BMI
      double weight_in_kilos = weight_in_pounds * 0.45359237;
      double height_in_meters = height_in_inches * 0.0254;
      double BMI = weight_in_kilos / (Math.pow(height_in_meters, 2));
      
      // Display result
      System.out.print("BMI is " + BMI);
      
   }
}