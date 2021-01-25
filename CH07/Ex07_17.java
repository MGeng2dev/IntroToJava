/** Sort Students
 *  Write a program that prompts the user to enter the number of students, the students' names,
 *  and their scores, and prints student names in decreasing order of their scores.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_17 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of students: ");
      int numOfStudents = input.nextInt();
      String[] names = new String[numOfStudents];
      int[] scores = new int[numOfStudents];
      System.out.print("Enter each name & score: ");
      // Save names to one array & scores to another
      for (int i = 0; i < numOfStudents; i++) {
         names[i] = input.next();
         scores[i] = input.nextInt();
      }
      
      // Print inputs
      System.out.print("You entered: \n");
      System.out.print(java.util.Arrays.toString(names) + "\n");
      System.out.print(java.util.Arrays.toString(scores));
      
      // Print names by decreasing score:
      selectionSort(scores, names);
      System.out.print("\nIn decreasing order by score: \n");
      System.out.print(java.util.Arrays.toString(names));
      //System.out.print(java.util.Arrays.toString(scores));
      
   }
   
   /** Method to sort array in decreasing order **/
   public static void selectionSort(int[] scores, String[] names) {
      for (int i = 0; i < scores.length - 1; i++) {
         // find the max in the list[i... list.length-1]
         int currentMax = scores[i];
         int currentMaxIndex = i;
         String currentMaxName = names[i];
         
         for (int j = i + 1; j < scores.length; j++) {
            if (currentMax < scores[j]) {
               currentMax = scores[j];
               currentMaxIndex = j;
               currentMaxName = names[j];
            }
         }
         
         // swap list[i] with list[currentMaxIndex] if necessary
         if (currentMaxIndex != i) {
            scores[currentMaxIndex] = scores[i];
            names[currentMaxIndex] = names[i];
            scores[i] = currentMax;
            names[i] = currentMaxName;
         }
      }
   }
   
}