/** Pattern Recognition: Consecutive Four Equal Numbers
 *  Write the following method that tests whether the array has four consecutive numbers
 *  with the same value.
 *
 *     public static boolean isConsecutiveFour(int[] values)
 *
 *  Write a test program that prompts the user to enter a series of integers and displays
 *  if the series contains four consecutive numbers with the same value. Your program
 *  should first prompt the user to enter the input size- i.e., the number of values in
 *  the series. 
 *
 */
 
import java.util.Scanner;
 
public class Ex07_30 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of values: ");
      int num = input.nextInt();
      int[] list = new int[num];
      System.out.print("Enter the values: ");
      for (int i = 0; i < list.length; i++) {
         list[i] = input.nextInt();
      }
      
      // Call method & display result
      if (isConsecutiveFour(list))
         System.out.print("The list has consecutive fours");
      else
         System.out.print("The list has no consecutive fours");
      
   }
   
    /** Method checks for four consecutive integers */
   public static boolean isConsecutiveFour(int[] values) {
      for (int i = 0; i < values.length - 3; i++) {
         if (values[i] == values[i+1] && values[i] == values[i+2] && values[i] == values[i+3])
            return true;
      }
      return false;
   }
}