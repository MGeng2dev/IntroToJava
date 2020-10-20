/** Display Pyramid
 *  Write a program that prompts the user to enter an integer from 1 to 15
 *  and displays a pyramid as shown. 
 *
 *    For 7 lines: 
 *                            1
 *                          2 1 2
 *                        3 2 1 2 3 
 *                      4 3 2 1 2 3 4
 *                    5 4 3 2 1 2 3 4 5
 *                  6 5 4 3 2 1 2 3 4 5 6
 *                7 6 5 4 3 2 1 2 3 4 5 6 7
 *
 */
 
import java.util.Scanner;
 
public class Ex05_17 {
   public static void main(String[] args) {
      // Create scanner & prompt user for number of lines
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of lines: ");
      int numOfLines = input.nextInt();
      
      // Nested loops to create pyramid pattern
      for (int i = 1; i <= numOfLines; i++) {  // Outer loop controls the rows
         for (int j = (2*numOfLines - i * 2); j > 0; j -= 2) {
            System.out.print("   ");  // Whitespace before numbers on each row
         }
         for (int k = i; k > 0; k--) { // Descending numbers on each row
            if (k < 10)
               System.out.print(k + "  ");
            else
               System.out.print(k + " ");
         }
         for (int n = 2; n <= i; n++) { // Ascending numbers on each row
            if (n < 10)
               System.out.print(n + "  ");
            else
               System.out.print(n + " ");
         }
         System.out.println();  // Go to next line after inner loops execute
      }
      
   }
}