/** Analyze Scores
 *  Write a program that reads an unspecified number of scores and determines how
 *  many scores are above or equal to the average and how many scores are below
 *  the average. Enter a negative number to signify the end of the input.
 *  Assume that the maximum number of scores is 100.
 *
 */
 
import java.util.Scanner;
 
public class Ex07_04 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter scores (100 max.) (enter negative number to quit): ");
      double value = input.nextDouble();
      double[] scores = new double[100];  // create array to store scores
      int numOfScores = 0;
      while (value >= 0) {
         scores[numOfScores] = value;
         value = input.nextDouble();
         numOfScores++;
      }
      
      // Determine number of scores above/below average & print
      double average = getAverage(scores, numOfScores);
      System.out.print("Average: " + average + "\n");
      System.out.print("Number of scores above or equal to average: " + numScoresAbove(scores, average) + "\n");
      System.out.print("Number of scores below average: " + numScoresBelow(scores, average, numOfScores));
   }
   
    /** Method calculates the average score */
   public static double getAverage(double[] list, int numOfItems) {
      double avgerage = 0;
      double sum = 0;
      for (int i = 0; i < list.length; i++) {
         sum = sum + list[i];
      }
      return sum / numOfItems;
   }

    /** Method counts array values above or equal to average */
   public static int numScoresAbove(double[] list, double average) {
      int count = 0;
      for (int i = 0; i < list.length; i++) {
         if (list[i] >= average) 
            count++;
      }
      return count;
   }
   
    /** Method counts array values less than average */
   public static int numScoresBelow(double[] list, double average, int numOfItems) {
      int count = 0;
      for (int i = 0; i < numOfItems; i++) {
         if (list[i] < average) 
            count++;
      }
      return count;
   }
}