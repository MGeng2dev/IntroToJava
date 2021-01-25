/** Eliminate Duplicates
 *  Write a method that returns a new array by eliminating the duplicate values
 *  in the array using the following method header:
 *
 *     public static int[] eliminateDuplicates(int[] list)
 *
 *  Write a test program that reads in ten integers, invokes the method, and
 *  displays the result.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_15 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ten integers: ");
      int[] inputArray = new int[10];
      for (int i = 0; i < inputArray.length; i++) {
         inputArray[i] = input.nextInt();
      }
      
      // Call method & display result
      System.out.print("Duplicates removed: " + java.util.Arrays.toString(eliminateDuplicates(inputArray)));
      
   }
   
    /** Method eliminates duplicates */
   public static int[] eliminateDuplicates(int[] list) {
     // Create an array that contains each unique value only once
      int[] clean = new int[list.length];
      int count = 0;
      for (int i = 0; i < list.length; i++) {
         int value = list[i];
         boolean dupe = false; 
         for (int j: clean) {
            if (j == value) {
               dupe = true; // if true, do not add to clean array
            }
         }
         if (dupe == false) {
            clean[count] = list[i];
            count++;
         }
      }
      // Remove placeholders from unique array
      int[] result = new int[count];
      for (int i = 0; i < count; i++) {
         result[i] = clean[i];
      }
      return result;
   }
}
