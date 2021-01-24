/** Reverse An Array
 *  The reverse method in Section 7.7 reverses an array by copying it to a new array.
 *  Rewrite the method that reverses the array passed in the argument and returns
 *  this array. Write a test program that prompts the user to enter ten numbers, 
 *  invokes the method to reverse the numbers, and displays the numbers.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_12 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ten numbers: ");
      int[] inputArray = new int[10];
      for (int i = 0; i < inputArray.length; i++) {
         inputArray[i] = input.nextInt();
      }
      
      // Call method & display
      System.out.print("Reversed array: " + java.util.Arrays.toString(reverse(inputArray)));
      
   }
  
   /** Method reverses an array */
   public static int[] reverse(int[] array) {
      int[] result = new int[array.length];
      for (int i = 0, j = result.length - 1; i < array.length; i++, j--) {
         result[j] = array[i];
      }
      return result;
   }
 
}