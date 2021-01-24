/** Average An Array
 *  Write two overloaded methods that retun the average of an array with the 
 *  following headers:
 *
 *    public static int average(int[] array)
 *    public static double average(double[] array)
 *
 *  Write a test program that prompts the user to enter ten double values, 
 *  invokes this method, and displays the average value.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_08 {
   public static void main(String[] args) {
      // Create scanner & get input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int size = input.nextInt();
      
      // Create array
      System.out.print("Enter " + size + " numbers: ");
      double[] array = new double[size];
      for (int i = 0; i < size; i++) {
         array[i] = input.nextInt();
      }
      
      // Call method & display result
      System.out.print("Average value: " + average(array));
   }
   
   /** Method returns the average of an array */
   public static int average(int[] array) {
      int arraySum = 0;
      for (int i = 0; i < array.length; i++) {
         arraySum += array[i];
      }
      return arraySum / array.length;
   }
   
   /** Method returns the average of an array */
   public static double average(double[] array) {
      double arraySum = 0;
      for (int i = 0; i < array.length; i++) {
         arraySum += array[i];
      }
      return arraySum / array.length;
   }
   
   
}
