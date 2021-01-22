/** Reverse the numbers entered
 *  Write a program that reads ten integers and displays them in the reverse
 *  of the order in which they were read.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_02 {
   public static void main(String[] args) {
      // Create scanner & get input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 10 integers: ");
      int[] nums = new int[10]; // create array to store 10 integers
      for (int i = 0; i < nums.length; i++) {
         nums[i] = input.nextInt();
      }
      
      // Loop thru integers in reverse 
      for (int i = nums.length - 1; i >= 0; i--) {
         System.out.print(nums[i] + " ");
      }
   }
}