/** All Closest Pairs Of Points
 *  Revise Listing 8.3, FindNearestPoints.java, to display all closest pairs of
 *  points with the same minimum distance.
 *
 */
 
import java.util.Scanner;
 
public class Ex08_08 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of points: ");
      int size = input.nextInt();
      double[][] points = new double[size][2];
      
      System.out.print("Enter " + size + " points: ");
      for (int i = 0; i < points.length; i++) {
         for (int j = 0; j < points[0].length; j++) {
            points[i][j] = input.nextDouble();
         }
      }  
      
      // Determine minimum distance
      double minDistance = nearestPoints(points);
      
      // Print all points with the same minimum distance
      for (int i = 0; i < points.length - 1; i++) {
         for (int j = i+1; j < points.length; j++) {
            double distance = calcDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
            if (distance <= minDistance) {
               System.out.print("The closest two points are (" + points[i][0] + ", " + points[i][1] +
                  ") and (" + points[j][0] + ", " + points[j][1] + ")\n");
            }
         }
      }
      System.out.print("Their distance is " + minDistance);
      
   } 
   
    /** Returns minimum distance between points */
   public static double nearestPoints(double[][] points) {
      // Assume distance between row 1 and row 2 is the minimum
      int minDistanceIndex1 = 0;
      int minDistanceIndex2 = 0;
      double minDistance = calcDistance(points[0][0], points[0][1], points[1][0], points[1][1]);
      
      // Compare all points
      for (int i = 0; i < points.length - 1; i++) {
         for (int j = i+1; j < points.length; j++) {
            double distance = calcDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
            if (distance < minDistance) {
               minDistance = distance;
            }
         }
      }
      
      return minDistance;
   }
   
    /** Distance between 2 points */ 
   public static double calcDistance(double x1, double y1, double x2, double y2) {
      double distance = Math.pow( (Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) ) , 0.5);
      return distance;
   }
   
}