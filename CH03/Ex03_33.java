/** Financial: compare costs
 *  Suppose you shop for rice in two different packages. You would
 *  like to write a program to compare the cost. The program prompts
 *  the user to enter the weight and price of each package and
 *  displays the one with the better price.
 *
 */
 
import java.util.Scanner;
 
public class Ex03_33 {
   public static void main(String[] args) {
      // Create scanner and get input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight and price for package 1: ");
      double weight1 = input.nextDouble();
      double price1 = input.nextDouble();
      System.out.print("Enter weight and price for package 2: ");
      double weight2 = input.nextDouble();
      double price2 = input.nextDouble();
      
      // Determine price per lb of each package
      double package1 = price1 / weight1;
      double package2 = price2 / weight2;
      
      // Display result
      if (package1 < package2)
         System.out.print("Package 1 has a better price");
      else if (package1 > package2)
         System.out.print("Package 2 has a better price");
      else
         System.out.print("The two packages have the same price");
         
   }
}