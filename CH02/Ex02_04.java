/** Convert pounds into kilograms
 *  Write a program that converts pounds into kilograms. The program
 *  prompts the user to enter a number in pounds, converts it to kilograms,
 *  and displays the result. 
 *     One pound is 0.454 kilograms
 *
 */
 
import java.util.Scanner;
 
public class Ex02_04 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number in pounds: ");
      double pounds = input.nextDouble();
      
      // Convert pounds to kilograms
      double kilos = pounds * 0.454;
      
      // Display result
      System.out.print(pounds + " pounds is " + kilos + " kilograms");
      
   }
}