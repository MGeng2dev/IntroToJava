/** Sort Three Numbers 
 *  Write a method with the following header to display three numbers in increasing
 *  order:
 *
 *    public static void displaySortedNumbers(double num1, double num2, double num2)
 *
 *  Write a test program that prompts the user to enter three numbers and invokes
 *  the method to display them in increasing number.
 *
 */
 
import java.util.Scanner;
 
public class Ex06_05 {
   public static void main(String[] args) {
      // Create a scanner & get three numbers from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();
      double num3 = input.nextDouble();
      
      // Call method & display results
      System.out.print("The numbers in increasing order are: ");
      displaySortedNumbers(num1, num2, num3);
   }
   
    /** Method prints three numbers in increasing order **/
   public static void displaySortedNumbers(double num1, double num2, double num3) {
      if (num1 < num2 && num1 < num3) {  // num1 is lowest
         System.out.print(num1 + " ");
         if (num2 < num3) 
            System.out.print(num2 + " " + num3);
         else  
            System.out.print(num3 + " " + num2);
      }
      else if (num2 < num1 && num2 < num3) {  // num2 is lowest
         System.out.print(num2 + " ");
         if (num1 < num3) 
            System.out.print(num1 + " " + num3);
         else
            System.out.print(num3 + " " + num1);
      }
      else {  // num3 is lowest
         System.out.print(num3 + " ");
         if (num1 < num2) 
            System.out.print(num1 + " " + num2);
         else  
            System.out.print(num2 + " " + num1);
      }
   }
   
}