/** Math: Combinations
 *  Write a program that prompts the user to enter 10 integers and displays all combinations
 *  of picking two numbers from the 10. 
 *
 */
 
import java.util.Scanner;
 
public class Ex07_28 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 10 integers: ");
      int[] nums = new int[10];
      for (int i = 0; i < 10; i++) {
         nums[i] = input.nextInt();
      }
      
      // Print all combinations
      for (int i = 0; i < 10; i++) {
         for (int j = i + 1; j < 10; j++) {
            System.out.print(nums[i] + ", " + nums[j] + "\n");
         }
      }
      
   }
}