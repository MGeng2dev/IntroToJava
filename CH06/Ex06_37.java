/** Format An Integer
 *  Write a method with the following header to format the integer with the specified width.
 *
 *    public static String format(int number, int width) 
 *
 *  The method returns a string for the number with one or more prefix 0s. The size of the 
 *  string is the width. For example, format(34, 4) returns 0034 and format(34, 5) returns
 *  00034. If the number is longer than the width, the method returns the string 
 *  representation for the number. For example, format(34, 1) returns 34. 
 * 
 *  Write a test program that prompts the user to enter a number and its width and displays
 *  a string returned by invoking format(number, width).
 *
 */
 
import java.util.Scanner;
 
public class Ex06_37 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      System.out.print("Enter width: ");
      int width = input.nextInt();
      
      // Call method & display result
      System.out.print(format(number, width));
   }
   
    /** Method returns a string for the number with prefix 0's */
   public static String format(int number, int width) {
      String s = "" + number; // initialize string 
      
      if (s.length() > width)    
         return s;
      else {
         int zeros = width - s.length();  // number of zeros to print
         for (int i = 1; i <= zeros; i++) {
            s = "0" + s;
         }
      }
      return s; 
   }
}