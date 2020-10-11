/** Print The Characters In A String Reversely
 *  Rewrite Programming Exercise 18.9 using a helper method to pass the 
 *  substring high index to the method. The helper method header is:
 *  
 *     public static void reverseDisplay(String value, int high)
 *
 */
 
import java.util.Scanner;
 
public class Ex18_12 {
   public static void main(String[] args) {
      // Create scanner and get string from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      
      // Call method and display result
      System.out.print("Reversal: ");
      reverseDisplay(s);
   }
   
   /** Method to reverse characters in a string **/
   public static void reverseDisplay(String s) {
      reverseDisplay(s, s.length() - 1);
   }
   
   /** Helper method **/
   public static void reverseDisplay(String s, int high) {
      if (high == 0)
         System.out.print(s.charAt(0));  // base case -  print first character
      else {
         System.out.print(s.charAt(high)); 
         reverseDisplay(s, high - 1);  // recursive call 
      }
   }
   
}