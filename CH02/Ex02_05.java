/** Financial application: calculate tips
 *  Write a program that reads the subtotal and gratuity rate,
 *  then computes the gratuity and total.
 * 
 */
 
import java.util.Scanner;
 
public class Ex02_05 {
   public static void main(String[] args) {
      // Create scanner and get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the subtotal and gratuity rate: ");         
      double subtotal = input.nextDouble();
      double rate = input.nextDouble();
      
      // Calculate gratuity and total
      double gratuity = subtotal * rate / 100;
      double total = subtotal + gratuity;
      
      // Display results
      System.out.print("The gratuity is $" + gratuity + " and total is $" + total);
      
   }
}