/** Points Nearest To Each Other
 *  Listing 8.3 gives a program that finds two points in a two-dimensional
 *  space nearest to each other. Revise the program so that it finds two
 *  points in a three-dimensional space nearest to each other. Use a two-
 *  dimensional array to represent the points. 
 *
 *  The formula for computing the distance between two points (x1, y1, z1) and
 *  (x2, y2, z2) is:
 *    sqrt((x2-x1)^2 + (y2-y1)^2 + (z2-z1)^2))
 *
 */
 
public class Ex08_07 {
   public static void main(String[] args) {
      // Initialize variable
      double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
         {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
         {5.5, 4, -0.5}};
      
      // Call method & print result
      int[] result = nearestPoints(points);
      System.out.print("Nearest points are index " + result[0] + " and index " + result[1]);
      System.out.print("\nThe distance is: " + calcDistance(4, 1, 1, 3.5, 2, -1));
   }
   
    /** Method returns indices of nearest points */
   public static int[] nearestPoints(double[][] points) {
      // Assume distance between row 1 and row 2 is the minimum
      int minDistanceIndex1 = 0;
      int minDistanceIndex2 = 1;
      double minDistance = 10000000;
      //double minDistance = calcDistance(points[0][0], points[0][1], points[0][2], 
         //points[1][0], points[1][1], points[1][2]);
   
      // Compare all points
      for (int i = 0; i < points.length - 1; i++) {
         for (int j = i+1; j < points.length; j++) {
            double distance = calcDistance(points[i][0], points[i][1], points[i][2], 
               points[j][0], points[j][1], points[j][2]);
            if (distance < minDistance) {
               minDistance = distance;
               minDistanceIndex1 = i;
               minDistanceIndex2 = j;
            }
         }
      }
      
      // Put points in an array to return
      int[] result = {minDistanceIndex1, minDistanceIndex2};
      return result;
   }
         
    /** Distance between 2 points */ 
   public static double calcDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
      double distance = Math.pow( (Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) + Math.pow((z2-z1), 2)) , 0.5);
      return distance;
   }
   
}