/** Conversions Between Celsius And Fahrenheit
 *  Write a class that contains the following two methods:
 *
 *    // Convert from Celsius to Fahrenheit 
 *    public static double celsiusToFahrenheit(double celsius)
 *
 *    // Convert from Fahrenheit to Celsius
 *    public static double fahrenheitToCelsius(double fahrenheit)
 *
 *  The formula for the conversion is:
 *
 *    fahrenheit = (9.0 / 5) * celsius + 32
 *    celsius = (5.0 / 9) * (fahrenheit - 32)
 *
 *  Write a test program that invokes these methods to display the values in table
 *  as shown.
 *
 */
 
public class Ex06_08 {
   public static void main(String[] args) {
      // Print table heading
      System.out.print("Celsius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelsius");
      System.out.print("\n-------------------------------------------------------");
      
      // Use for loop to print each row of table body
      for (double i = 40, j = 120; i >= 31 && j >= 30; i--, j -= 10) {
         System.out.print("\n" + i + "        ");
         System.out.printf("%-10.1f", celsiusToFahrenheit(i)); // call method
         System.out.print("\t\t|\t\t");
         System.out.printf("%-5.1f", j);
         System.out.print("           ");
         System.out.printf("%-4.2f", fahrenheitToCelsius(j)); // call method
      }
      System.out.print("\n");
   
   }
   
    /** Method converts Celsius to Fahrenheit */
   public static double celsiusToFahrenheit(double celsius) {
      return (9.0 / 5 ) * celsius + 32;
   }
   
    /** Method converts Fahrenheit to Celsius */
   public static double fahrenheitToCelsius(double fahrenheit) {
      return (5.0 / 9) * (fahrenheit - 32);
   }
}