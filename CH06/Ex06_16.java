/** Number Of Days In A Year
 *  Write a method that returns the number of days in a year using the 
 *  following header: 
 *  
 *    public static int numberOfDaysInAYear(int year)
 *
 *  Write a test program that displays the number of days in a year
 *  from 2000 to 2020.
 *
 */
 
public class Ex06_16 {
   public static void main(String[] args) {
     // Print table heading
      System.out.print("Year\t\t\tDays");
      System.out.print("\n----------------");
      
      // For loop for each year in table and print row
      for (int i = 2000; i <= 2020; i++) {
         System.out.printf("\n%-4d\t\t\t%-4d", i, numberOfDaysInAYear(i));
      }
   }
   
    /** Method returns number of days in a year */
   public static int numberOfDaysInAYear(int year) {
      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))  // check for leap year
         return 366;
      else
         return 365;
   }
}