/** Random month
 *  Write a program that randomly generates an integer between 1 and 12 and 
 *  displays the English month name January, February, ... , December for
 *  the number 1, 2, ... , 12, accordingly.
 *
 */
 
public class Ex03_04 {
   public static void main(String[] args) {
      // Generate a random number between 1 and 12
      int num = (int)(1 + (Math.random() * 13));
      System.out.print("Randomly generated integer: " + num);
      
      // Print out corresponding month
      System.out.print("\nCorresponding month: ");
      if (num == 1)
         System.out.print("January");
      if (num == 2)
         System.out.print("February");
      if (num == 3)
         System.out.print("March");
      if (num == 4)
         System.out.print("April");
      if (num == 5)
         System.out.print("May");
      if (num == 6)  
         System.out.print("June");
      if (num == 7)
         System.out.print("July");
      if (num == 8)
         System.out.print("August");
      if (num == 9)
         System.out.print("September");
      if (num == 10)
         System.out.print("October");
      if (num == 1)
         System.out.print("November");
      if (num == 1)
         System.out.print("December");
         
   }
}