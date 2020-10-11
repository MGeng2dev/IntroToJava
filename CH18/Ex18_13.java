/** Find The Largest Number In An Array
 *  Write a recursive method that returns the largest integer in an array. 
 *  Write a test program that prompts the user to enter a list of 8 integers and
 *  displays the largest element.
 *
 */
 
import java.util.Scanner;
 
public class Ex18_13 {
   public static void main(String[] args) {
      // Create scanner and get integer array from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 8 integers: ");
      int[] nums = new int[8];
   
      for (int i = 0; i < 8; i++) {  // store integers in array
         nums[i] = input.nextInt();
      }
      
      // Call method & display result
      System.out.print("Largest integer in array: " + max(nums));      
   }
      
    /** Method to find largest integer in array */
   public static int max(int[] nums) {
      int currentMax = nums[0]; // intialize variable to store max integer      
      return max(nums, currentMax, 0);  // call helper method
   }
      
    /** Helper method **/
   public static int max(int[] nums, int currentMax, int index) {
      if (index > nums.length - 1)    // base case - index has gone beyond range
         return currentMax;
      else {
         if (nums[index] > currentMax)
            currentMax = nums[index];   // update currentMax
         return max(nums, currentMax, index + 1);   // recursive call 
      }
   } 
   
}