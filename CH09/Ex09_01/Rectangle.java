/** Rectangle Class
 * 
 *    UML Diagram:
 *  
 *   __________________________________________________
 *  |                    Rectangle                     |
 *  |------------------------------------------------- |
 *  | width: double                                    |
 *  | height: double                                   |
 *  | ------------------------------------------------ |
 *  | +Rectangle()                                     |
 *  | +Rectangle(newWidth: double, newHeight: double)  |
 *  | +getArea(): double                               |
 *  | +getPerimeter(): double                          |
 *  |_________________________________________________ |
 *
 *
 */
 
public class Rectangle {
   /** Main method */
   double width;
   double height; 
   
   /** No-arg constructor */
   public Rectangle() {
      width = 1;
      height = 1;
   }
   
   /** Construct a rectangle with specified width & height */
   public Rectangle(double newWidth, double newHeight) {
      width = newWidth;
      height = newHeight;
   }
   
   /** Return the area of the rectangle */
   public double getArea() {
      return width * height;
   }
   
   /** Return the perimeter of the rectangle */
   public double getPerimeter() {
      return (2 * height) + (2 * width);
   }
   
}