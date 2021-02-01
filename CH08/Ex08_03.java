/** Sort Students On Grades 
 *  Rewrite Listing 8.2, GradeExam.java to display the students in increasing order
 *  of the number of correct answers.
 *
 */

public class Ex08_03 {
   public static void main(String[] args) {
      // Students' answer to the questions
      char[][] answers = {
         {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
         {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
         {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
         {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
         {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
      
      // Key to the questions
      char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
     
      // Create arrays to store each student's index & grade
      int[] students = {0, 1, 2, 3, 4, 5, 6, 7};
      int[] grades = new int[8];
     
      // Grade all answers
      for (int i = 0; i < answers.length; i++) {
         // Grade one student
         int correctCount = 0;
         for (int j = 0; j < answers[i].length; j++) {
            if (answers[i][j] == keys[j]) {
               correctCount++;
            }
         }
         grades[i] = correctCount;
      }
   
      // Call sorting method
      selectionSort(grades, students);
   
      // Print results
      for (int i = 0; i < students.length; i++) {
         System.out.print("Student " + students[i] + "'s correct count is " + grades[i] + "\n");
      }
      
   }
            
    /** Sort grades & students arrays */
   public static void selectionSort(int[] grades, int[] students) { 
      for (int i = 0; i < grades.length - 1; i++) { 
         // find the minimum in grades[i... grades.length-1] 
         int currentMin = grades[i]; 
         int currentMinIndex = i; 
         int currentMinStudent = students[i];
                
         for (int j = i + 1; j < grades.length; j++) { 
            if (currentMin > grades[j]) { 
               currentMin = grades[j]; 
               currentMinIndex = j; 
               currentMinStudent = students[j];
            } 
         } 
                
         // swap grades[i] with grades[currentMinIndex] if necessary 
         if (currentMinIndex != i) { 
            grades[currentMinIndex] = grades[i]; 
            grades[i] = currentMin; 
            students[currentMinIndex] = students[i];
            students[i] = currentMinStudent;
         } 
      } 
      
   }
   
}         
