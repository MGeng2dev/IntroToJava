/** Find The Two Highest Scores
 *  Write a program that prompts the user to enter the number of students and
 *  each student's name and score, and finally displays the student with 
 *  the highest score and the student with the second-highest score.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_09 {
   public static void main(String[] args) {
      // Create a scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter the number of students
      System.out.print("Enter the number of students: ");
      int numOfStudents = input.nextInt();
      
      // Initialize variables
      int secondMaxScore = 0;
      int maxScore = 0;
      int currentScore = 0;
      int tempScore = 0;
      String tempName = "";
      String maxName = "";
      String currentName;
      String secondMaxName = "";
      
      // For loop to get student names and variables
      for (int i = 1; i <= numOfStudents; i++) {
         System.out.print("Enter student name: ");
         currentName = input.next();
         System.out.print("Enter " + currentName + "'s Score: ");
         currentScore = input.nextInt();
         
         // Check if currentScore is higher than secondMaxScore
         if (currentScore > secondMaxScore) {
            tempScore = secondMaxScore; // save score in case it is needed for second-highest
            tempName = currentName;
            secondMaxScore = currentScore;
            secondMaxName = currentName;
            // Check if currentScore is new maxScore
            if (currentScore > maxScore) {
               maxScore = currentScore; 
               maxName = currentName;
               secondMaxScore = tempScore; // if current score is new max, revert second-highest score
               secondMaxName = tempName;
            }
         } 
      }
         
      // Display names with highest score & second-highest score
      System.out.print(maxName + " has the highest score");
      System.out.print("\n" + secondMaxName + " has the second-highest score");
   }
}