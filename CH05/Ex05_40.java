/** Simulation: Heads Or Tails
 *  Write a program that simulates flipping a coin one million times and displays the number
 *  of heads and tails.
 *
 */
 
public class Ex05_40 {
   public static void main(String[] args) {
      // Declare & initialize variables
      int countHeads = 0;
      int countTails = 0;
      
      // For loop to simulate a million coin flips
      for (int i = 1; i <= 1000000; i++) {
         int value = (int)(Math.random() * 2); // generates random value 0 or 1
         if (value == 0)
            countHeads++;
         else
            countTails++;
      }
      
      // Display results
      System.out.print("Heads: " + countHeads);
      System.out.print("\nTails: " + countTails);
      System.out.print("\nTotal: " + (countHeads + countTails));
   }
}