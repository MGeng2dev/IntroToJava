/** Find The Factors Of An Integer
 *  Write a program that reads an integer and displays all of its smallest 
 *  factors in increasing order. For example, if the input integer is 120,
 *  the output should be as follows:
 *     2, 2, 2, 3, 5
 *
 */
 
import java.util.Scanner;
 
public class Ex05_16 {
   public static void main(String[] args) {
      // Create scanner & get integer from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int num = input.nextInt();
      
      System.out.print("Smallest factors of " + num + " in increasing order: ");
    
     // Loop loop to check all numbers from 2 to the input number
      for (int i =2; i <= num; i++) {
         while (num % i == 0) {
            System.out.print(i + " ");
            num = num / i;
         }
      }
   
   }
}