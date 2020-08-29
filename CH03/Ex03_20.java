/** Science: wind-chill temperature
 *  Programming Exercise 2.17 gives a formula to compute the wind-chill temperature.
 *  The formula is valid for temperatures in the range between -58°F and +41°F
 *  and wind speed greater than or equal to 2. Write a program that
 *  prompts the user to enter a temperature if the input is valid; otherwise,
 *  it displays a message indicating whether the temperature and/or
 *  wind speed is invalid. 
 *
 */
 
import java.util.Scanner;
 
public class Ex03_20 {
   public static void main(String[] args) {
      // Create a scanner & get temperature and wind spreed from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter temperature (between -58 and +41 degrees) in Fahrenheit: ");
      double temp = input.nextDouble();
      System.out.print("Enter the wind speed (>=2) in miles per hour: ");
      double windspeed = input.nextDouble();
      
      // Display message if inputs are invalid
      if (temp < -58 || temp > 41) 
         System.out.println("Temperature must be between -58 and +41 degrees Fahrenheit");
      if (windspeed < 2)
         System.out.println("Wind speed must be greater than or equal to 2");
      
      // If inputs are valid, calculate wind chill & display result
      if (temp >= -58 && temp <= 41 && windspeed >= 2) {
         double windChillIndex = 35.74 + 0.6215 * temp - 35.75 *
            Math.pow(windspeed, 0.16) + 0.4275 * temp * Math.pow(windspeed, 0.16);
         System.out.print("The wind chill index is " + windChillIndex);
      }
   
   }
}
