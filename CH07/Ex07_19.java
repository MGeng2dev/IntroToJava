/** Sorted?
 *  Write the following method that returns true if the list is already sorted in increasing order: 
 *  
 *     public static boolean isSorted(int[] list) 
 *
 *  Write a test program that prompts the user to enter a list and displays whether the list is
 *  sored or not.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_19 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of items: ");
      int num = input.nextInt();
      int[] list = new int[num];
      System.out.print("Enter list: ");
      for (int i = 0; i < list.length; i++) {
         list[i] = input.nextInt();
      }
      
      // Check if list is sorted & display result
      System.out.print("You entered: " + java.util.Arrays.toString(list));
      System.out.print("\nThe list is " + (isSorted(list) ? "already sorted" : "not sorted"));
      
      
   }
   
   /** Method checks whether list is sorted */
   public static boolean isSorted(int[] list) {
      boolean result = false; 
      for (int i = 0; i < list.length - 1; i++) {
         if (list[i] > list[i + 1])
            return false;
      }
      return true;
   }
   
   
}