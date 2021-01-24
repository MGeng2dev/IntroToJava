/** Assign Grades
 *  Write a program that reads student scores, gets the best score, and then
 *  assigns grades based on the following scheme:
 *
 *    Grade is A if score is >= best - 10
 *    Grade is B if score is >= best - 20
 *    Grade is C if score is >= best - 30
 *    Grade is D if score is >= best - 40
 *    Grade is F otherwise
 *
 *  The program prompts the user to enter the total number of students,
 *  then prompts the user to enter all of the scores, and concludes by
 *  displaying the grades.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_01 {
   public static void main(String[] args) {
      // Create scanner & get input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      int numOfStudents = input.nextInt();
      int[] grades = new int[numOfStudents];  // create array to store grades
      System.out.print("Enter " + numOfStudents + " scores: ");
      // Loop to store user inputs to array
      for (int i = 0; i < grades.length; i++) {
         grades[i] = input.nextInt();
      }
      
      // Get best grade
      int bestGrade = findBestGrade(grades);
      
      // Display results
      for (int i = 0; i < grades.length; i++) {
         if (grades[i] >= bestGrade - 10)
            System.out.print("Student " + i + " score is " + grades[i] + " and grade is A\n");
         else if (grades[i] >= bestGrade - 20)
            System.out.print("Student " + i + " score is " + grades[i] + " and grade is B\n");
         else if (grades[i] >= bestGrade - 30)
            System.out.print("Student " + i + " score is " + grades[i] + " and grade is C\n");
         else if (grades[i] >= bestGrade - 40)
            System.out.print("Student " + i + " score is " + grades[i] + " and grade is D\n");
         else
            System.out.print("Student " + i + " score is " + grades[i] + " and grade is F\n");
      }
           
      
   }
   
    /** Method returns the best grade */
   public static int findBestGrade(int[] grades) {
      int bestGrade = grades[0];  // initialize bestGrade as first grade in array
      // Loop thru array to find the best grade
      for (int i = 0; i < grades.length; i++) {
         if (grades[i] > bestGrade)
            bestGrade = grades[i];
      }
      return bestGrade;
   }
}