/** Strictly Identical Arrays
 *  The arrays list1 and list2 are strictly identical if their corresponding elements are equal.
 *  Write a method that returns true if list1 and list2 are strictly identical, using the 
 *  following header:
 *
 *     public static boolean equals(int[] list1, int[] list2)
 *
 *  Write a test program that prompts the user to enter two lists of integers and displays 
 *  whether the two are strictly identical. 
 *
 */
 
import java.util.Scanner;
 
public class Ex07_26 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter array length: ");
      int length = input.nextInt();
      int[] list1 = new int[length];
      int[] list2 = new int[length];
      System.out.print("Enter values for list1: ");
      for (int i = 0; i < list1.length; i++) {
         list1[i] = input.nextInt();
      }
      System.out.print("Enter values for list2: ");
      for (int j = 0; j < list2.length; j++) {
         list2[j] = input.nextInt();
      }
      
      // Compare & display result
      if(equals(list1, list2))
         System.out.print("Two lists are strictly identical");
      else if (!equals(list1, list2))
         System.out.print("Two lists are not strictly identical");
         
   }
   
   /** Method checks if two lists are strictly identical */
   public static boolean equals(int[] list1, int[] list2) {
      for (int i = 0; i < list1.length; i++) {
         if (list1[i] != list2[i])
            return false;
      }
      return true;
   }
   
}