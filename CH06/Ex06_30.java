/** Game: Craps
 *  Craps is a popular dice game played in casinos. Write a program to play a variation of the game, as follows:
 *  Roll two dice. Each dice has six faces representing values 1, 2, ..., and 6, respectively. Check the sum
 *  of the two dice. 
 *  - If the sum is 2, 3, or 12 (called craps), you lose
 *  - If the sum is 7 or 11 (called natural), you win
 *  - If the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established
 *  Continue to roll the dice until either a 7 or the same point value is rolled.
 *  - If 7 is rolled, you lose
 *  - If point value is rolled, you win
 *  Your program acts as a single player.
 *
 */

public class Ex06_30 {  
   public static void main(String[] args) {
      // Declare/initialize variables
      boolean gameOver = false;  // controls the while loop/ends the game
      boolean initialRound = true; 
      int point = 0;
      
      while (gameOver == false) {
         int num1 = rollTheDice();
         int num2 = rollTheDice();
         int sum = num1 + num2;
         
         System.out.print("You rolled " + num1 + " + " + num2 + " = " + sum + "\n");
         
         if (initialRound) {
            if (sum == 2 || sum == 3 || sum == 12) {
               System.out.print("You lose");
               gameOver = true;
            }
            else if (sum == 7 || sum == 11) {
               System.out.print("You win");
               gameOver = true;
            }
            else {
               point = sum;
               System.out.print("Point is " + point + "\n");
               initialRound = false;
            }
         }
         else if (!initialRound) {
            if (point == sum) {
               System.out.print("You win");
               gameOver = true;
            }
            else if (sum == 7) {
               System.out.print("You lose");
               gameOver = true;
            }
         }
      }
    
         
   }
 
    /** Method returns 1-6 dice value */
   public static int rollTheDice() {
      return (int)(1 + Math.random() * 6);
   }
   
}

