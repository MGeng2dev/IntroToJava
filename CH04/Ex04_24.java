/** Order Three Cities
 *  Write a program that prompts the user to enter three cities and displays them
 *  in ascending order.
 *
 */
 
import java.util.Scanner;
 
public class Ex04_24 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first city: ");
      String city1 = input.nextLine();
      System.out.print("Enter the second city: ");
      String city2 = input.nextLine();
      System.out.print("Enter the third city: ");
      String city3 = input.nextLine();
      
      // Initialize variables for output list
      String a = "";
      String b = "";
      String c = "";
      
      // Alphabetize strings
      if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
         a = a + city1;
         if (city2.compareTo(city3) < 0) {
            b = b + city2;
            c = c + city3;
         }
         else {
            b = b + city3;
            c = c + city2;
         }
      }
      else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0) {
         a = a + city2;
         if (city1.compareTo(city3) < 0) {
            b = b + city1;
            c = c + city3;
         }
         else {
            b = b + city3;
            c = c + city1;
         }
      }
      else {
         a = a + city3;
         if (city1.compareTo(city2) < 0) {
            b = b + city1;
            c = c + city2;
         }
         else {
            b = b + city2;
            c = c + city1;
         }
      }
      
      // Display result
      System.out.print("The three cities in alphabetical order are: " + a + ", " + b + ", " + c);
   }
}
      
