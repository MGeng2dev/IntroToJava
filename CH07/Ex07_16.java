/** Execution Time
 *  Write a program that randomly generates an array of 100,000 integers and a key. Estimate
 *  the execution time of invoking the linearSearch method in Listing 7.6. Sort the array
 *  and estimate the execution time of invoking the binarySearch method in Listing 7.7. You 
 *  can use the following code template to obtain the execution time: 
 *
 *    long startTime = System.currentTimeMillis();
 *    perform the task
 *    long endTime = System.currentTimeMills();
 *    long executionTime = endTime - startTime;
 *
 */
 
public class Ex07_16 {
   public static void main(String[] args) {
      // Create array & key
      int[] searchArray = new int[100000];
      for (int i = 0; i < searchArray.length; i++) {
         searchArray[i] = (int)(Math.random() * 100000);
      }
      int key = (int)(Math.random() * 100000);
   
      // Get start time for linear search
      long startTime = System.currentTimeMillis();
      
      // Perform task - linear search
      int linearResult = linearSearch(searchArray, key);
      long endTime = System.currentTimeMillis();
      long executionTime = endTime - startTime;
      
      // Display linear search results
      System.out.print("Linear Search Results: \n");
      if (linearResult > 0)
         System.out.print("Match found!");
      else
         System.out.print("No match found");
      System.out.print("\nLinear Search Execution time: " + executionTime * 1000 + " seconds");
      
      
      // Get start time for binary search
      selectionSort(searchArray); // sort the array
      startTime = System.currentTimeMillis();
      
      // Perform task - binary search
      int binaryResult = binarySearch(searchArray, key);
      endTime = System.currentTimeMillis();
      executionTime = endTime - startTime;
      
      // Display binary search results
      System.out.print("\n\nBinary Search Results: \n");
      if (binaryResult > 0)
         System.out.print("Match found!");
      else
         System.out.print("No match found");
      System.out.print("\nBinary Search Execution Time: " + executionTime * 1000 + " seconds");
      
      
   }
   
    /** Method for finding a key in the list with Linear Search */
   public static int linearSearch(int[] list, int key) {
      for (int i = 0; i < list.length; i++) {
         if (key == list[i])
            return i;
      }
      return -1;
   }
   
    /** Method for find a key in the list with Binary Search */
   public static int binarySearch(int[] list, int key) {
      int low = 0;
      int high = list.length - 1;
      
      while (high >= low) {
         int mid = (low + high) / 2;
         if (key < list[mid])
            high = mid - 1;
         else if (key == list[mid])
            return mid;
         else
            low = mid + 1;
      }
      
      return -low - 1; // key not found
   }
   
    /** Method for sorting array */
   public static void selectionSort(int[] list) {
      for (int i = 0; i < list.length - 1; i++) {
         // find the minimum in the list[i... list.length-1]
         int currentMin = list[i];
         int currentMinIndex = i;
         
         for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
               currentMin = list[j];
               currentMinIndex = j;
            }
         }
         
         // swap list[i] with list[currentMinIndex] if necessary
         if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
         }
      }
   }
   
}