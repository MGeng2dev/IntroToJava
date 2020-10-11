/** Geometry: Estimate Areas
 *  Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia;
 *  and Charlotte, North Carolina from www.gps-data-team.com/map/ and compute
 *  the estimated area enclosed by these four cities.
 *  Hint: Use the formula in Programming Exercise 4.2 to compute the distance
 *  between two cities. Divide the polygon into two triangles and use the formula
 *  in Programming Exercise 2.19 to compute the area of a triangle.
 *
 */
 
public class Ex04_03 {
   public static void main(String[] args) {
      // Define variables for all latitude & longitude of all cities
      double x1 = Math.toRadians(33.72427); // Atlanta
      double y1 = Math.toRadians(-84.57858);
      double x2 = Math.toRadians(28.41153); // Orlando
      double y2 = Math.toRadians(-81.52504);
      double x3 = Math.toRadians(32.00849); // Savannah
      double y3 = Math.toRadians(-81.21439); 
      double x4 = Math.toRadians(35.13361); // Charlotte
      double y4 = Math.toRadians(-80.96363); 
      
      // Calculate distances between cities
      final double r = 6371.01;  // average earth radius
      double d1 = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) *
         Math.cos(y1 - y2)); // Atlanta - Orlando
      double d2 = r * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) *
         Math.cos(y2 - y3)); // Orlando - Savannah
      double d3 = r * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) *
         Math.cos(y1 - y3)); // Atlanta - Savannah
      double d4 = r * Math.acos(Math.sin(x1) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) *
         Math.cos(y1 - y4)); // Atlanta - Charlotte
      double d5 = r * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) *
         Math.cos(y3 - y4)); // Savannah - Charlotte
         
      // Calculate triangular area: Atlanta-Orlando-Savannah
      double s1 = (d1 + d2 + d3) / 2;
      double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d2) * (s1 - d3));
      // Calculate triangular area: Atlanta-Charlotte-Savannah
      double s2 = (d3 + d4 + d5) / 2;
      double area2 = Math.sqrt(s2 * (s2 - d3) * (s2 - d4) * (s2 - d5));
   
      // Calculate total enclosed area
      double total = area1 + area2;
   
      // Display result
      System.out.print("Total area enclosed: " + total + " sq. km");
   }
}