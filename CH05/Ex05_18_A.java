/** Display Four Patterns Using Loops
 *  Use nested loops that display the following patterns in four separate programs:
 *  
 *    Pattern A
 *    1
 *    1 2
 *    1 2 3
 *    1 2 3 4 
 *    1 2 3 4 5
 *    1 2 3 4 5 6
 *
 */
 
public class Ex05_18_A {
   public static void main(String[] args) {
      
      for (int i = 1; i <= 6; i++) { // Outer loop controls the rows
         for (int j = 1; j <= i; j++) { // Inner loop controls the numbers on a row
            System.out.print(j + " ");
         }
         System.out.println(); // Go to next line every time inner loop ends
      }
      
   }
}