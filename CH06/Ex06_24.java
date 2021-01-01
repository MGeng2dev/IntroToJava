/** Display Current Date And Time
 *  Listing 2.7, ShowCurrentTime.java, displays the current time. Improve this example to display the current
 *  date and time. The calendar example in Listing 6.12, PrintCalendar.java, should give you some ideas on 
 *  how to find the year, month, and day.
 *
 */
 
public class Ex06_24 {
   public static void main(String[] args) {
      // Obtain the total milliseconds since midnight, Jan. 1, 1970
      long totalMilliseconds = System.currentTimeMillis();
      
      // Obtain the total seconds since midnight, Jan. 1, 1970
      long totalSeconds = totalMilliseconds / 1000;
      
      
      long currentSecond = totalSeconds % 60;
      
      long totalMinutes = totalSeconds / 60;
      
      long currentMinute = totalMinutes % 60;
      
      long totalHours = totalMinutes / 60;
      
      long currentHour = totalHours % 24;
      
      long totalDays = totalHours / 24;
      //
      
      //long currentDay = totalDays % 365;
      
      //long totalYears = totalDays / 365;
      //System.out.print("totalYears: " + totalYears);
      
      int
      
      
      // Years
      //long totalYears = totalSeconds / 31536000;
      //System.out.print("Year " + (1970 + totalYears - 1));
      
      // Days 
      //long days = ((totalSeconds - (31536000 * (totalYears + 1))) % 86400);
      System.out.print("\nTotal Days: " + totalDays);
      System.out.print("\nCurrent Day: " + currentDay);
      
      System.out.print("\nCurrent date & time: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
   }
   
   
   
}