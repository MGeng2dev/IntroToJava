/** Business: check ISBN-10
 *  An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
 *  The last digit, d10, is a checksum, which is calculated from the other nine
 *  digits using the following formula:
 *
 *     (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 +
 *          d6*6 + d7*7 + d8*8 + d9*9) % 11
 *
 *  If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 *  convention. Write a program that prompts the user to enter the first 9 digits and
 *  displays the 10-digit ISBN (including leading zeros). Your program
 *  should read the input as an integer. 
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_09 {
   public static void main(String[] args) {
      // Create scanner and get first 9 digits from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first 9 digits of an ISBN as integer: ");
      int userNumber = input.nextInt();
      
      // Calculate checksum
      int checkNumber = userNumber;
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