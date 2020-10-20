/** Sum A Series
 *  Write a program to sum the following series: 
 *
 *     (1/3)+(3/5)+(5/7)+(7/9)+(9/11)+(11/13)+...+(95/97)+(97/99)
 *
 */
 
public class Ex05_24 {
   public static void main(String[] args) {
      // Initialize variable for sum
      double sum = 0;
      
      // For loop to sum series
      for (int i = 1; i <= 97; i += 2) {
         sum = sum + ((i * 1.0) / (i + 2));
      }
      
      // Display result
      System.out.print("Sum of series: " + sum);
   }
}