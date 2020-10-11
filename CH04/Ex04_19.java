/** Business: Check ISBN-10
 *  Rewrite Programming Exercise 3.9 by entering the ISBN number as a string.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_19 {
   public static void main(String[] args) {
      // Create a scanner & get string input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first 9 digits of an ISBN: ");
      String s = input.next();
      
      // Convert input string to int
      int intValue = Integer.parseInt(s);
      
      // Calculate checksum
      int checkNumber = intValue;
      int d9 = checkNumber % 10;
      checkNumber = checkNumber / 10;
      
      int d8 = checkNumber % 10;
      checkNumber = checkNumber / 10;
      
      int d7 = checkNumber % 10;
      checkNumber = checkNumber / 10;
      
      int d6 = checkNumber % 10;
      checkNumber = checkNumber / 10;
      
      int d5 = checkNumber % 10;
      checkNumber = checkNumber / 10;
      
      int d4 = checkNumber % 10;
      checkNumber = checkNumber / 10;
      
      int d3 = checkNumber % 10;
      checkNumber = checkNumber / 10;
      
      int d2 = checkNumber % 10;
      checkNumber = checkNumber / 10;
      
      int d1 = checkNumber % 10;
      
      int checkSum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 +
         d7 * 7 + d8 * 8 + d9 * 9) % 11;
         
      // Display result
      System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 +
         d6 + d7 + d8 + d9 + ((checkSum == 10) ? "X" : checkSum));
   }
}