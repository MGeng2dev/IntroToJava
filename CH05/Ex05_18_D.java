/** Display Four Patterns Using Loops
 *  Use nested loops that display the following patterns in four separate programs:
 *  
 *    Pattern D
 *    1 2 3 4 5 6 
 *    1 2 3 4 5 
 *    1 2 3 4
 *    1 2 3  
 *    1 2
 *    1
 *
 */
 
public class Ex05_18_D {
   public static void main(String[] args) {
      
      for (int i = 6; i > 0; i--) { // Outer loop controls the rows
         for (int j = (6 - i); j > 0; j--) { // Whitespace before numbers on each row
            System.out.print("  ");
         }
         for (int k = 1; k <= i; k++) { // Numbers on each row
            System.out.print(k + " ");
         }
         System.out.println(); // Go to next line after inner loops execute
      }
      
   }
}