/** Random Character
 *  Write a program that displays a random uppercase letter using the Math.random() method.
 *
 */ 
 
public class Ex04_16 {
   public static void main(String[] args) {
      // Generate random uppercase letter
      char ch = (char)('A' + Math.random() * ('Z' - 'A' + 1));
      
      // Display random letter
      System.out.print("Randomly generated uppercase letter: " + ch);
   }
}