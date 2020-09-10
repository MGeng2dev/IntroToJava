/** Current time
 *  Revise Programming Exercise 2.8 to display the hour using 
 *  a 12-hour clock. 
 *
 */
 
public class Ex03_30 {
   public static void main(String[] args) {
         // Obtain the total milliseconds since midnight, Jan. 1, 1970
      long totalMilliseconds = System.currentTimeMillis();
      
      // Obtain the total seconds since midnight, Jan. 1, 1970
      long totalSeconds = totalMilliseconds / 1000;
      
      // Compute the current second in the minute in the hours
      long currentSecond = totalSeconds % 60;
      
      // Obtain the total minutes
      long totalMinutes = totalSeconds / 60;
      
      // Compute the current minute in the hour
      long currentMinute = totalMinutes % 60;
      
      // Obtain the total hours
      long totalHours = totalMinutes / 60;
      
      // Compute the current hour
      long currentHour = totalHours % 24;
      
      // Display time
      if (currentHour > 12) {
         currentHour = currentHour - 12;
         System.out.print("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " PM");
      }
      else {
         System.out.print("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " AM");
      }
   }
}