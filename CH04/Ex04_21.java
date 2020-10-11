/** Check SSN
 *  Write a program that prompts the user to enter a Social Security number in the
 *  format DDD-DD-DDDD, where D is a digit. Your program should check whether the
 *  input is valid.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_21 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a SSN: ");
      String s = input.nextLine();
      
      // Check length of string
      if (s.length() != 11)
         System.out.print("\"" + s + "\"" + " is an invalid social security number");
      else { 
         // Assign each character to a variable
         char ch0 = s.charAt(0);
         char ch1 = s.charAt(1);
         char ch2 = s.charAt(2);
         char ch3 = s.charAt(3);
         char ch4 = s.charAt(4);
         char ch5 = s.charAt(5);
         char ch6 = s.charAt(6);
         char ch7 = s.charAt(7);
         char ch8 = s.charAt(8);
         char ch9 = s.charAt(9);
         char ch10 = s.charAt(10);
         
         // Determine if string is valid SSN & display result
         if (ch3 == '-' && ch6 == '-' && 
            Character.isDigit(ch0) && Character.isDigit(ch1) && Character.isDigit(ch2) &&
            Character.isDigit(ch4) && Character.isDigit(ch5) && Character.isDigit(ch7) && 
            Character.isDigit(ch8) && Character.isDigit(ch9) && Character.isDigit(ch10)) {
            System.out.print(s + " is a valid social security number");
         }
         else 
            System.out.print("\"" + s + "\"" + " is an invalid social security number");
      }
   }
}