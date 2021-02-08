/** Game: Play A Tic-Tac-Toe Game
 *  In a game of tic-tac-toe, two players take turns marking an available cell in a 3 * 3 grid 
 *  with their respective tokens (either X or O). When one player has placed three tokens in a 
 *  horizontal, vertical, or diagonal row on the grid, the game is over and that player has won. 
 *  A draw (no winner) occurs when all the cells on the grid have been filled with tokens and
 *  neither player has achieved a win. Create a program for playing tic-tac-toe. The program 
 *  prompts two players to enter an X token and O token alternately. Whenever a token is entered,
 *  the program redisplays the board on the console and determines the status of the game (win, 
 *  draw, or continue). 
 *
 */
 
import java.util.Scanner;
import java.util.Arrays;
 
public class Ex08_09 {
   public static void main(String[] args) {
      // Create scanner  & initialize variables
      Scanner input = new Scanner(System.in);
      char[][] game = new char[3][3];
      boolean running = true;
      int row;
      int col;
      char currentPlayer;
      int round = 0;
      
      // Print empty board
      printBoard(game);
      
      // Start game
      while (running) {
            // Determine which player's turn it is
         if (round % 2 == 0) {
            currentPlayer = 'X';
         }
         else {
            currentPlayer = 'O';
         }
         
         // Prompt user for current move
         System.out.print("Enter a row (0, 1, or 2) for player " + currentPlayer + ": "); 
         row = input.nextInt();
         System.out.print("Enter a column (0, 1, or 2) for player " + currentPlayer +": ");
         col = input.nextInt();
         game[row][col] = currentPlayer;
      
         // Redisplay board after current move
         printBoard(game);
      
        // Check for win
         if (checkForWin(game, currentPlayer) == true) {
            System.out.print("Player " + currentPlayer + " won");
            running = false;
         }
         
         // Move to next round, for next player's turn
         round++;
      
      }   
      
   }
   
   
   /** Check board for win */
   public static boolean checkForWin(char[][] array, char player) {
      // Check rows 
      int rowCount = 0;
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[0].length; j++) {
            if (array[i][j] == player) {
               rowCount++;
            }
         }
         if (rowCount == 3) {
            System.out.print("rows");
            return true;
            
         }
         rowCount = 0;
      }
      
      // Check columns
      int colCount = 0;
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[0].length; j++) {
            if (array[i][j] == player) {
               colCount++;
            }
         }
         if (colCount == 3) {
            System.out.print("cols");
            return true;
         }
         colCount = 0;
      }
      
      // Check diagonal
      int diagCount = 0;
      for (int i = 0; i < array.length; i++) {
         if (array[i][i] == player) {
            diagCount++;
         }
      }
      if (diagCount == 3) {
         System.out.print("diag");
         return true;
      }
         
      return false; // no win yet
   }
   
   
   /** Print board */
   public static void printBoard(char[][] a) {
      System.out.print("-------------\n");
      System.out.print("| " + a[0][0] + " | " + a[0][1] + " | " + a[0][2] + " |\n");
      System.out.print("-------------\n");
      System.out.print("| " + a[1][0] + " | " + a[1][1] + " | " + a[1][2] + " |\n");
      System.out.print("-------------\n");
      System.out.print("| " + a[2][0] + " | " + a[2][1] + " | " + a[2][2] + " |\n");
      System.out.print("-------------\n");
   }
   
}