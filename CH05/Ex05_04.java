/** Conversion From Miles To Kilometers
 *  Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
 *
 *     Miles       Kilometers
 *     1           1.609
 *     2           3.218
 *     ...
 *     9           14.481
 *     10          16.090
 *
 */
 
public class Ex05_04 {
   public static void main(String[] args) {
      // Print table heading
      System.out.print("Miles\t\t\tKilometers");
      
      // Print remaining rows with a for loop
      for (int i = 1; i < 11; i++) {
         double kilometers = i * 1.609;
         System.out.printf("\n%-5d\t\t\t%-5.3f", i, kilometers);
      }
   }
}