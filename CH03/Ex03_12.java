/** Palindrom number
 *  Write a program that prompts the user to enter a three-digit
 *  integer and determines whether it is a palindrom number. A number is a 
 *  palindrome if it reads the same from right to left and from left to right. 
 *
 */
 
import java.util.Scanner;
 
public class Ex03_12 {
   public static void main(String[] args) {
      // Create scanner and get 3-digit integer input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a three-digit integer: ");
      int num = input.nextInt();
      
      // Determine if integer is a palindrome
      int firstDigit = num / 100;
      int secondDigit = (num - firstDigit * 100) / 10;
      int thirdDigit = (num - firstDigit * 100 - secondDigit * 10);
      boolean isPalindrome = (firstDigit == thirdDigit);
      
      // Display result
      System.out.println(num + " is " + (isPalindrome ? "a Palindrome" : "not a Palindrome"));
      
   }
}