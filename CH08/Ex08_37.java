/** Guess The Capitals
 *  Write a program that repeatedly prompts the user to enter a capital for a state. Upon
 *  receiving the user input, the program reports whether the answer is correct. Assume 
 *  that 50 states and their capitals are stored in a two-dimensional array, as shown in
 *  Figure 8.10. The program prompts the user to answer all states' capitals and displays the 
 *  total correct count. The user's answer is not case-sensitive.
 *
 *  Note: I am only going to do this for the state's whose names start with A. I think
 *  that's enough to get the idea here.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_37 {
   public static void main(String[] args) {
      // Initialize
      Scanner input = new Scanner(System.in);
      String[][] statesAndCaps = {{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, 
          {"Arizona", "Phoenix"}, {"Arkansas", "Little Rock"}};
      int correctCount = 0;
      
      // Repeatedly prompt user for each state
      for (int i = 0; i < statesAndCaps.length; i++) {
         System.out.print("What is the captial of " + statesAndCaps[i][0] + "? ");
         String guess = input.nextLine();
         if (guess.equalsIgnoreCase(statesAndCaps[i][1])) {
            System.out.println("Your answer is correct");
            correctCount++;
         }
         else {
            System.out.println("The correct answer should be " + statesAndCaps[i][1]);
         }
      }
      
      // Display end result
      System.out.print("The correct count is " + correctCount + " out of " + statesAndCaps.length);
      
   }
}
