/** Sort three integers
 *  Write a program that prompts the user to enter three integers and display
 *  the integers in non-decreasing order.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_08 {
   public static void main(String[] args) {
      // Create scanner and get 3 integers from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three integers: ");
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      int num3 = input.nextInt();
      
      // 
      if (num1 < num2 && num1 < num3) {
         if (num2 < num3) 
            System.out.print("Non-descending order: " + num1 + " " + num2 + " " + num3);
         else 
            System.out.print("Non-descending order: " + num1 + " " + num3 + " " + num2);
      }
      
      else if (num2 < num1 && num2 < num3) {
         if (num1 < num3) 
            System.out.print("Non-descending order: " + num2 + " " + num1 + " " + num3);
         else
            System.out.print("Non-descending order: " + num2 + " " + num3 + " " + num1);
      }
      
      else if (num3 < num1 && num3 < num2) {
         if (num1 < num2) 
            System.out.print("Non-descending order: " + num3 + " " + num1 + " " + num2);
         else
            System.out.print("Non-descending order: " + num3 + " " + num2 + " " + num1);
      }
      
   }
}