/** Occurrence Of Max Numbers
 *  Write a program that reads integers, finds the largest of them, and counts its occurrences.
 *  Assume that the input ends with number 0. Suppose that you entered:
 *    3 5 2 5 5 5 0;
 *  the program finds that the largest is 5 and the occurrence count for 5 is 4.
 *  Hint: Maintain two variables, max and count. Max stores the current max number, and count
 *  stores its occurrences. Initially, assign the first number to max and 1 to count. Compare
 *  each subsequent number with max. If the number is greater than max, assign it to max and
 *  reset count to 1. If the number is equal to max, increment count by 1.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_41 {
   public static void main(String[] args) {
      // Create a scanner & prompt user to enter integers
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integers (0 to end): ");
      
      // Declare & initialize variables
      int value = input.nextInt();
      int max = value;
      int count = 1;
      
      // While loop to continue thru all input integers
      while (value != 0) {
         if (value > max) {
            max = value;
            count = 1;
         }
         else if (value == max) {
            count++;
         }
         value = input.nextInt();
      }
      
      // Display results
      System.out.print("The largest number is " + max);
      System.out.print("\nThe occurrence count of the largest number is " + count);
   }
}
