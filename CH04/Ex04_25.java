/** Generate Vehicle Plate Numbers
 *  Assume a vehicle plate number consists of three uppercase letters followed by
 *  four digits. Write a program to generate a plate number.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_25 {
   public static void main(String[] args) {
      // Generate three random uppercase letters
      char ch1 = (char)('A' + Math.random() * ('Z' - 'A' + 1));
      char ch2 = (char)('A' + Math.random() * ('Z' - 'A' + 1));
      char ch3 = (char)('A' + Math.random() * ('Z' - 'A' + 1));
      
      // Generate random 3-digit integer
      int nums = (int)(1000 + Math.random() * 10000);
      
      // Put it all together
      System.out.print("Randomly generated plate number: " + ch1 + ch2 + ch3 + nums);
   }
}
