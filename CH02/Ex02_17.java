/** Science: wind-chill temperature
 *  How cold is it outside? The temperature alone is not enough to provide the answer.
 *  Other factors including wind speed, relative humidity, and sunshine play important
 *  roles in determining coldness outside. In 2001, the National Weather Service (NWS) 
 *  implemented the new wind-chill temperature to measure the coldness using
 *  temperature and wind speed. The formula is:
 *    t_wc = 35.74 + 0.6215*t_a - 35.75*v^0.16 + 0.4275*t_a*v^0.16
 *  where t_a is the outside temperature measured in degrees Fahrenheit and v
 *  is the speed measured in miles per hour. t_wc is the wind-chill temperature. The
 *  formula cannot be used for wind speeds below 2 mph or temperatures below
 *  -58 degrees Fahrenheit or above 41 degerees Fahrenheit.
 * 
 *  Write a program that prompts the user to enter a temperature between -58 degrees
 *  Fahrenheit and 41 degrees Fahrenheit and a wind speed greater than or
 *  equal to 2 and displays the wind-chill temperature. Use Math.pow(a, b) 
 *  to compute v^0.16.
 *
 */
 
import java.util.Scanner;
 
public class Ex02_17 {
   public static void main(String[] args) {
      // Create scanner and get temperature & wind speed from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the temperature in Fahrenheit between -58 and 41 degrees: ");
      double temp = input.nextDouble();
      System.out.print("Enter the wind speed (>= 2 mph) in mph: ");
      double windspeed = input.nextDouble();
      
      // Calculate wind chill 
      double windchill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windspeed, 0.16) +
         0.4275 * temp * Math.pow(windspeed, 0.16);
      
      // Display result
      System.out.print("The wind chill index is " + windchill);
   }
}