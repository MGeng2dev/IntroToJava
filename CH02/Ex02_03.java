/** Convert feet into meters
 *  Write a program that reads a number in feet, converts it to meteres,
 *  and displays the result.
 *     One foot is 0.305 meters
 *
 */
 
import java.util.Scanner;
 
public class Ex02_03 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a value in feet: ");
      double feet = input.nextDouble();
      
      // Convert feet to meters
      double meters = feet * 0.305;
      
      // Display result   
      System.out.println(feet + " feet is " + meters + " meters");
      
   }
}