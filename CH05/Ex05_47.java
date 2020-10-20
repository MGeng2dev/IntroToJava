/** Business: Check ISBN-13 
 *  ISBN-13 is a new standard for identifying books. It uses 13 digits:
 *    d1d2d3d4d5d6d7d8d9d10d11d12d13.
 *  The last digit d13 is a checksum, which is calculated from the other digits using
 *  the following formula:
 *
 *    10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 +d9 + 3d10 + d11 + 3d12) % 10
 *
 *  If the checksum is 10, replace it with 0. Your program should read the input as
 *  a string.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_47 {
   public static void main(String[] args) {
      // Create scanner & prompt user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
      String inputString = input.next();
      
      // Check for valid input
      if (inputString.length() != 12) {
         System.out.print(inputString + " is an invalid input");
         System.exit(1);
      }
      
      // Initialize variables
      long checkNumber = Long.parseLong(inputString);
      long digitSum = 0;
      
      // For loop to sum formula portion inside ()
      for (int i = 1; i <= 12; i++) {
         long digit = checkNumber % 10; // extract last digit
         
         if (i % 2 == 0) 
            digitSum = digitSum + digit; 
         else
            digitSum = digitSum + 3 * digit; // every other digit gets multiplied by 3
            
         checkNumber = checkNumber / 10; // reduce number for next loop iteration
      }
       
      // Calculate checkSum
      long checkSum = 10 - digitSum % 10;
      
      // Display result
      System.out.print("The ISBN-13 number is " + inputString + (checkSum == 10 ? "0" : checkSum));
   }
}