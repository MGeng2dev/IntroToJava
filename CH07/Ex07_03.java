/** Count occurrence of numbers
 *  Write a program that reads the integers between 1 and 100 and counts the 
 *  occurrences of each. Assume the input ends with 0. 
 *
 */
 
import java.util.Scanner;
 
public class Ex07_03 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integers between 1 and 100 (0 to stop): ");
      int value = input.nextInt();
      int[] count = new int[101]; // create array to store occurrence count of each number
      while (value != 0) {
         count[value] =+ 1;
         value = input.nextInt();
      }
      
      // Display results
      for (int i = 1; i < count.length; i++) {
         if (count[i] > 0) {
            System.out.print(i + " occurs " + count[i] + (count[i] > 1 ? " times\n" : " time\n"));
         }
      }
   }
}
