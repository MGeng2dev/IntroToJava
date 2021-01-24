/** Print Distinct Numbers
 *  Write a program that reads in ten numbers and displays the number of distinct
 *  numbers separated by exactly one spacce (i.e., if a number appears multiple
 *  times, it is displayed only once). (Hint: Read a number and store it to an
 *  array if it is new. If the number is already in the array, ignore it.)
 *  After the input, the array contains the distinct numbers. 
 *
 */ 
 
import java.util.Scanner;
 
public class Ex07_05 {
   public static void main(String[] args) {
      // Create scanner and prompt user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ten numbers: ");
      // Initialize variables
      int value;
      int[] distinctNums = new int[10];
      int count = 0; // counter for distinct numbers
      // Loop thru entered values and store only the distinct numbers
      for (int i = 0; i < 10; i++) {
         value = input.nextInt();
         if (!arraySearch(distinctNums, value)) {
            distinctNums[i] = value;
            count++;
         }
      }
      
      // Display results
      System.out.print("The number of distinct numbers is " + count);
      System.out.print("\nThe distinct numbers are: ");
      for (int i = 0 ; i < distinctNums.length; i++) {
         if (distinctNums[i] > 0)
            System.out.print(distinctNums[i] + " ");
      }
   }
      
    /** Method returns true if array contains key */
   public static boolean arraySearch(int[] list, int key) {
      for (int i = 0; i < list.length; i++) {
         if (list[i] == key) 
            return true;
      }
      return false;
   }
}
