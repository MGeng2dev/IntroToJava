/** Strictly Identical Arrays
 *  The two-dimensional arrays m1 and m2 are strictly identical if their corresponding
 *  elements are equal. Write a method that returns true if m1 and m2 are strictly 
 *  identicial, using the following header:
 *
 *    public static boolean equals(int[][] m1, int[][] m2) 
 *
 *  Write a test program that prompts the user to enter two 3x3 arrays of integers
 *  and displays whether the two are strictly identical.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_28 {
   public static void main(String[] args) {
      // Initialize variables
      int[][] a1 = new int[3][3];
      int[][] a2 = new int[3][3];
      
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter list1: ");
      for (int i = 0; i < a1.length; i++) {
         for (int j = 0; j < a1[0].length; j++) {
            a1[i][j] = input.nextInt();
         }
      }
      System.out.print("Enter list2: ");
      for (int i = 0; i < a2.length; i++) {
         for (int j = 0; j < a2[0].length; j++) {
            a2[i][j] = input.nextInt();
         }
      }
      
      // Call method and display result
      if (equals(a1, a2) == true) {
         System.out.print("The two arrays are strictly identical");
      }
      else {
         System.out.print("The two arrays are not strictly identical");
      }
   }
   
    /** Method determines if arrays are identical */
   public static boolean equals(int[][] m1, int[][] m2) {
      for (int i = 0; i < m1.length; i++) {
         for (int j = 0; j < m1[0].length; j++) {
            if (m1[i][j] != m2[i][j]) {
               return false;
            }
         }
      }
      return true;
   }
   
}
