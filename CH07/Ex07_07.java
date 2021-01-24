/** Count Single Digits
 *  Write a program that generates 100 random integers between 0 and 9 and displays the 
 *  count for each number. (Hint: Use an array of 10 integers, say counts, to store the
 *  counts for the number of 0s, 1s, ... , 9s.)
 *
 */
 
public class Ex07_07 {
   public static void main(String[] args) {
      // Initialize variables
      int[] randomIntegers = new int[100];  // array to store randomly generated numbers 
      int[] counts = new int[10];  // array to store counts
      
      // Generate random numbers
      for (int i = 0; i < 100; i++) {
         int temp = (int)(0 + Math.random() * 10); // generate random numbers 0 to 9
         randomIntegers[i] = temp;  // add random number to array
         counts[temp] = counts[temp] + 1;  // count occurence 
      }
     
      // Display the count for each number
      for (int i = 0; i < 10; i++) {
         System.out.print("The number of " + i + "'s is " + counts[i] + "\n");
      }
      
   } 
}    
