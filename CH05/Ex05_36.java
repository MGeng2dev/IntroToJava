/** Business Application: Checking ISBN
 *  Use loops to simplifying Programming Exercise 3.9.
 *
 *  Programming Exercise 3.9: 
 *  An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
 *  The last digit, d10, is a checksum, which is calculated from the other nine
 *  digits using the following formula:
 *
 *     (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 +
 *        d6*6 + d7*7 + d8*8 + d9*9) % 11
 * 
 *  If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 *  convention. Write a program that prompts the user to enter the first 9 digits and
 *  displays the 10-digit ISBN (including leading zeros). Your program
 *  should read the input as an integer. 
 *
 */

import java.util.Scanner;

public class Ex05_36 {
   public static void main(String[] args) {
      // Create scanner & get first 9 digits from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first 9 digits of an ISBN as integer: ");
      String inputString = input.next();
      
      // Initialize variables 
      int checkNumber = Integer.parseInt(inputString);
      int digitSum = 0;
      
      // For loop to sum all the digits * their factor
      for (int i = 1; i <= 9; i++) {
         int digit = checkNumber % 10; // extract last digit
         digitSum = digitSum + digit * (10 - i); // multiply digit by factor from formula
         checkNumber = checkNumber / 10; // reduce number for next loop iteration
      }
      
      // Calculate checkSum
      int checkSum = digitSum % 11;
      
      // Display result
      System.out.print("The ISBN-10 number is " + inputString + (checkSum == 10 ? "X" : checkSum));
      
   }
}