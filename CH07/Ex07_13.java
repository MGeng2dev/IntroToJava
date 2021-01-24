/** Random Number Chooser
 *  Write a method that returns a random number between 1 and 54, exclusing 
 *  the numbers passed in the argument. The method header is specified as follows:
 *  
 *     public static int getRandom(int... numbers)
 *
 */
 
import java.util.Scanner;
 
public class Ex07_13 {
   public static void main(String[] args) {
      // Create scanner & get user inputs
      Scanner input = new Scanner(System.in);
      System.out.print("How many numbers do you want to exclude?: ");
      int numToExclude = input.nextInt();
      int[] excludedNums = new int[numToExclude];
      System.out.print("Enter numbers to exclude (between 1 and 54): ");
      for (int i = 0; i < excludedNums.length; i++) {
         excludedNums[i] = input.nextInt();
      }
      
      // Call method & display result
      System.out.print("Random number between 1 and 54, excluding " + 
         java.util.Arrays.toString(excludedNums) + ": " + getRandom(excludedNums));
      
   }
   
    /** Method returns a random number */
   public static int getRandom(int... numbers) {
      boolean valid = false;
      int random = 0;
      while (!valid) {
         valid = true;
         random = (int)(1 + Math.random() * 54); 
         for (int i: numbers) {
            if (i == random) 
               valid = false; // random number becomes invalid if it's in excludedNums
         }
      }
      return random;
   } 
}    
      
         
