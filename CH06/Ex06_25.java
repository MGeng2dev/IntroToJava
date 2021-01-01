/** Convert Milliseconds To Hours, Minutes, And Seconds
 *  Write a method that converts milliseconds to hours, minutes, and seconds using the following header:
 *
 *     public static String convertMillis(long millis)
 *
 *  The method returns a string as hours:minutes:seconds. 
 *  For example, convertMillis(5500) returns a string 0:0:5, convertMillis(1000000) returns a string 0:1:40,
 *  and convertMillis(555550000) returns a string 154:19:10. 
 *
 */
 
import java.util.Scanner;
 
public class Ex06_25 {
   public static void main(String[] args) {
      // Create a scanner & get input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter milliseconds: ");
      long millis = input.nextLong();
      
      // Call method 
      System.out.print(convertMillis(millis));
      
   }
   
    /** Method converts long to string as hours:minutes:seconds */
   public static String convertMillis(long millis) {
      // Convert milliseconds into minutes, seconds, and hours
      long totalSeconds = millis / 1000;
      long seconds = totalSeconds % 60;
      long totalMinutes = totalSeconds / 60;
      long minutes = totalMinutes % 60;
      long totalHours = totalMinutes / 60;
      
      // Create string
      String s = totalHours + ":" + minutes + ":" + seconds;
      
      // Return string
      return s;
   }
}