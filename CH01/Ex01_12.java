//  Average speed in kilometers
//  Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
//  Write a program that displays the average speed in kilometers per hour.
//  Note: 1 mile is 1.6 kilometers

public class Ex01_12 {
   public static void main(String[] args) {
      System.out.println("24 miles in 1 hour, 40 minutes and 35 seconds");
      System.out.println("Is equivalent to: " + (24 * 1.6 / (1 + (40.0 / 60) + (35.0 / 60 / 60))) + " kilometers per hour");
   
   }
}