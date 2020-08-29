/** Random point: Write a program that displays a random coordinate in a 
 *  rectangle. The rectangle is cenetered at (0,0) with with 100 and height 200.
 *
 */
 
public class Ex03_16 {
   public static void main(String[] args) {
      // Generate random x coordinate
      int x = -(int)(-50 + Math.random() * 101);  // x can be from -50 to 50
      int y = (int)(-100 + Math.random() * 201);  // y can be from -100 to 100
      
      // Display coordiante
      System.out.println("A 100 x 200 rectangle is centered at (0, 0)");
      System.out.println("A random coordinate in the rectangle: (" + x + ", " + y + ")");
   
   }
}