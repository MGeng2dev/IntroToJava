/** Find The Index Of The Smallest Element
 *  Write a method that returns the index of the smallest element in an array
 *  of integers. If the number of such elements is greater than 1, return
 *  the smallest index. Use the following header:
 *
 *     public static int indexOfSmallestElement(double[] array) 
 *
 *  Write a test program that prompts the user to enter ten numbers, invokes
 *  this method to return the index of the smallest element, and
 *  displays the index.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_10 {
   public static void main(String[] args) {  
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      double[] inputArray = new double[10];
      System.out.print("Enter ten numbers: ");
      for (int i = 0; i < inputArray.length; i++) {
         inputArray[i] = input.nextDouble();
      }
      
      // Call method & display result
      System.out.print("Index of the smallest element: " + indexOfSmallestElement(inputArray));
   }
   
    /** Method return the index of the smallest element */
   public static int indexOfSmallestElement(double[] array) {
      int index = 0;
      double smallestElement = array[0];
      for (int i = 0; i < array.length; i++) {
         if (array[i] < smallestElement) {
            smallestElement = array[i];
            index = i;
         }
      }
      return index;
   }
}
