/** Check Password
 *  Some websites impose certain rules for passwords. Write a method that checks
 *  whether a string is a valid password. Suppose the password rules are as follows:
 *
 *    - A password must have at least 8 characters
 *    - A password consists of only letters and digits
 *    - A password must contain at least 2 digits
 *
 *  Write a program that prompts the user to enter a password and displays 
 *  "Valid Password" if the rules are follow or "Invalid Password" otherwise.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_18 {
   public static void main(String[] args) {
      // Create scanner & get password from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter password: ");
      String password = input.next();
      
      // Call method & display result
      System.out.print((checkPassword(password) ? "Valid Password" : 
         "Invalid Password"));
   }
   
    /** Method to check if password is valid */
   public static boolean checkPassword(String password) {
      boolean validPassword = true;
      // Check if password has at least 8 characters
      if (password.length() < 8) {
         return false;
      }
      
      // Check if password consists of only letters & digits
      for (int i = 0; i < password.length(); i++) {
         char ch = password.charAt(i);
         if (!Character.isLetterOrDigit(ch)) {
            return false;
         }
      }
      
      // Check if password contains at least 2 digits
      int digitCount = 0;
      for (int i = 0; i < password.length(); i++) {
         char ch = password.charAt(i);
         if (Character.isDigit(ch)) {
            digitCount++;
         }
      }
      if (digitCount < 2) {
         return false;
      }
      return validPassword;
   }
}    
