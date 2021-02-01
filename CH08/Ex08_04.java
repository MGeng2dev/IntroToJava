/** Compute The Weekly Hours For Each Employee
 *  Suppose the weekly hours for all employees are stored in a two-dimensional
 *  array. Each row records an employee's seven-day work hours with seven columns.
 *  Write a program that displays employees and their total hours in decreasing
 *  order of total hours.
 *
 */
 
public class Ex08_04 {
   public static void main(String[] args) {
      // Employee's hours
      int[][] weeklyHours = {
         {2, 4, 3, 4, 5, 8, 8},
         {7, 3, 4, 3, 3, 4, 4},
         {3, 3, 4, 3, 3, 2, 2},
         {9, 3, 4, 7, 3, 4, 1},
         {3, 5, 4, 3, 6, 3, 8},
         {3, 4, 4, 6, 3, 4, 4},
         {3, 7, 4, 8, 3, 8, 4},
         {6, 3, 5, 9, 2, 7, 9}};
     
      // Create array to store each employee's index 
      int[] employees = {0, 1, 2, 3, 4, 5, 6, 7}; 
     
      // Sum each employee's total hours & store in array
      int[] totalHours = sumTotalHours(weeklyHours);
   
      // Call sorting method
      selectionSort(totalHours, employees);
   
      // Print results
      for (int i = employees.length - 1; i >= 0; i--) {
         System.out.print("Employee " + employees[i] + "'s total hours is " + totalHours[i] + "\n");
      }
      
   }
   
    /** Sum each employee's total hours */
   public static int[] sumTotalHours(int[][] weeklyHours) {
      // Initialize array to store total hours for each employee
      int[] totalHours = new int[weeklyHours.length];
      // Loop to sum each employee's total hours
      for (int i = 0; i < weeklyHours.length; i++) {
         int empTotalHours = 0;
         for (int j = 0; j < weeklyHours[i].length; j++) {
            empTotalHours = empTotalHours + weeklyHours[i][j];
         }
         totalHours[i] = empTotalHours;
      }
      return totalHours;
   }
            
    /** Sort total hours & employees arrays */
   public static void selectionSort(int[] totalHours, int[] employees) { 
      for (int i = 0; i < totalHours.length - 1; i++) { 
         // find the minimum in the totalHours[i... totalHours.length-1] 
         int currentMin = totalHours[i]; 
         int currentMinIndex = i; 
         int currentMinStudent = employees[i];
                
         for (int j = i + 1; j < totalHours.length; j++) { 
            if (currentMin > totalHours[j]) { 
               currentMin = totalHours[j]; 
               currentMinIndex = j; 
               currentMinStudent = employees[j];
            } 
         } 
                
         // swap totalHours[i] with totalHours[currentMinIndex] if necessary 
         if (currentMinIndex != i) { 
            totalHours[currentMinIndex] = totalHours[i]; 
            totalHours[i] = currentMin; 
            employees[currentMinIndex] = employees[i];
            employees[i] = currentMinStudent;
         } 
      } 
      
   }
   
}