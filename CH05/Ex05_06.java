/** Conversion From Miles To Kilometers
 *  Write a program that displays the following two tables side by side:
 *
 *    Miles    Kilometers  |  Kilometers     Miles
 *    1        1.609       |  20             12.430
 *    2        3.218       |  25             15.538
 *    ...      
 *    9        14.481      |  60             37.290
 *    10       16.090      |  65             40.398
 *
 */
 
public class Ex05_06 {
   public static void main(String[] args) {
      // Print table heading
      System.out.print("Miles\t\t\tKilometers\t|\tKilometers\t\tMiles");
      
      // For loop to print rest of table
      for (int i = 1, j = 20; i < 11; i++, j += 5) {
         int miles1 = i;
         double kilometers1 = miles1 * 1.609;
         int kilometers2 = j;
         double miles2 = j / 1.609;
         
         System.out.printf("\n%-5d\t\t\t%-9.3f\t|\t%-9d\t\t%-5.3f", miles1, kilometers1, kilometers2, miles2);
      }
      
   }
}