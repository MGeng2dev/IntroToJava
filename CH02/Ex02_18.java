/** Print a table
 *  Write a program that displays the following table. Cast floating-point numbers
 *  into integers.
 * 
 *    a     b     pow(a, b)
 *    1     2     1
 *    2     3     8
 *    3     4     81
 *    4     5     1024
 *    5     6     15625
 *
 */
 
public class Ex02_18 {
   public static void main(String[] args) {
      // Print table
      System.out.println("a\t\tb\t\t" + "pow(a, b)");
      System.out.println("1\t\t2\t\t" + (int)Math.pow(1, 2));
      System.out.println("2\t\t3\t\t" + (int)Math.pow(2, 3));
      System.out.println("3\t\t4\t\t" + (int)Math.pow(3, 4));
      System.out.println("4\t\t5\t\t" + (int)Math.pow(4, 5));
      System.out.println("5\t\t6\t\t" + (int)Math.pow(5, 6));
         
   }
}