/** Conversion From Kilograms to Pounds
 *  Write a program that displays the following table (note that 1 kilogram is 2.2 pounds)"
 *
 *     Kilograms     Pounds
 *     1                2.2
 *     3                6.6  
 *     ...              
 *     197            433.4
 *     199            437.8
 *
 */
 
public class Ex05_03 {
   public static void main(String[] args) {
      // Print table heading
      System.out.print("Kilograms\t\tPounds");
      
      // Use a for-loop to print table rows
      for (int i = 1; i < 200; i++) {
         double pounds = i * 2.2;
         System.out.printf("\n%-9d\t\t%6.1f", i, pounds);
      }
   }
}