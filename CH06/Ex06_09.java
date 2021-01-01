/** Conversions Between Feet And Meters
 *  Write a class that contains the following two methods:
 * 
 *    // Convert from feet to meters
 *    public static double footToMeter(double foot)
 *
 *    // Convert from meteres to feet
 *    public static double meterToFoot(double meter)
 *
 *  The formula for the conversion is:
 * 
 *    meter = 0.305 * foot
 *    foot = 3.279 * meter
 *
 *  Write a test program that invokes these methods to display the table as shown.
 *
 */
 
public class Ex06_09 {
   public static void main(String[] args) {
      // Print table heading
      System.out.print("Feet\t\t\tMeters\t\t\t|\t\t\tMeters\t\t\tFeet");
      System.out.print("\n----------------------------------------------------------");
      
      // Use for loop to print each row of table body
      for (double i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) {
         System.out.print("\n");
         System.out.printf("%-4.1f", i);
         System.out.print("\t\t\t");
         System.out.printf("%-6.3f", footToMeter(i));
         System.out.print("\t\t\t|\t\t\t");
         System.out.printf("%-6.1f", j);
         System.out.print("\t\t\t");
         System.out.printf("%7.3f", meterToFoot(j));
      }
      System.out.print("\n");
   }
   
    /** Method converts feet to meters */
   public static double footToMeter(double foot) {
      return 0.305 * foot;
   }
   
    /** Method converts meters to feet */
   public static double meterToFoot(double meter) {
      return 3.279 * meter;
   }
}