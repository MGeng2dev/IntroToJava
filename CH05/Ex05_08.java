/** Find The Highest Score
 *  Write a program that prompts the user to enter the number of students and each
 *  student's name and score, and finally displays the name of the student with
 *  the highest score.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_08 {
   public static void main(String[] args) {  
      // Create a scanner
      Scanner input = new Scanner(System.in);
   
      // Prompt user to enter the number of students
      System.out.print("Enter the number of students: ");
      int numOfStudents = input.nextInt();
      
      // Initialize variables
      int currentScore = 0;
      int maxScore = 0;
      String currentName = "";
      String maxName = "";
      
      // For loop to get studnet names and scores
      for (int i = 1; i <= numOfStudents; i++) {
         System.out.print("Enter student name: ");
         currentName = input.next();
         System.out.print("Enter " + currentName + "'s Score: ");
         currentScore = input.nextInt();
         if (currentScore > maxScore) {
            maxScore = currentScore;
            maxName = currentName;
         }
      }
      
      // Display name of student with highest score
      System.out.print(maxName + " has the highest score");
   }
}