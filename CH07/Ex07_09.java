/** Find The Smallest Element
 *  Write a method that finds the smallest element in an array of double values
 *  using the following header:
 *
 *     public static double min(double[] array) {
 *  
 *  Write a test program that prompts the user to enter ten numbers, invokes this
 *  method to return the minimum value, and displays the minimum value.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_09 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      double[] inputArray = new double[10];
      System.out.print("Enter ten numbers: ");
      for (int i = 0; i < 10; i++) {
         inputArray[i] = input.nextDouble();
      }
      
      // Call method & display result
      System.out.print("The minimum number is: " + min(inputArray));
   }
   
    /** Method returns the smallest element in array */
   public static double min(double[] inputArray) {
      double min = inputArray[0];
      for (int i = 0; i < inputArray.length; i++) {
         if (inputArray[i] < min) {
            min = inputArray[i];
         }
      }
      return min;
   }
}
      
