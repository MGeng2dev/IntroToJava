/** Use the &&, ||, and ^ operators
 *  Write a program that prompts the user to enter an integer and 
 *  determines whether it is divisible by 5 and 6, whether it is divisible
 *  by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 *
 */
 
 
import java.util.Scanner;
 
public class Ex03_26 {
   public static void main(String[] args) {
      // Create a scanner and get integer from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int num = input.nextInt();
      
      // Determine integer's divisibility 
      boolean boo1 = false;
      boolean boo2 = false;
      if (num % 5 == 0)
         boo1 = true;
      if (num % 6 == 0)
         boo2 = true;
         
      // Display results
      System.out.print("Is " + num + " divisible by 5 and 6? " );
      if (boo1 && boo2)
         System.out.println("true");
      else 
         System.out.println("false");
         
      System.out.print("Is " + num + " divisible by 5 or 6? " );
      if (boo1 || boo2)
         System.out.println("true");
      else 
         System.out.println("false");
         
      System.out.print("Is " + num + " divisible by 5 or 6, but not both? ");
      if (boo1 ^ boo2)
         System.out.println("true");
      else 
         System.out.println("false");
         
   }
}
