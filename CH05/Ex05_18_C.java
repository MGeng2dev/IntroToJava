/** Display Four Patterns Using Loops
 *  Use nested loops that display the following patterns in four separate programs:
 *  
 *    Pattern C
 *              1
 *            2 1 
 *          3 2 1
 *        4 3 2 1   
 *      5 4 3 2 1 
 *    6 5 4 3 2 1
 *
 */
 
public class Ex05_18_C {
   public static void main(String[] args) {
      
      for (int i = 1; i <= 6; i++) { // Outer loop controls the rows
         for (int j = (6 - i); j > 0; j--) { // Whitespace before numbers on each row
            System.out.print("  ");
         }
         for (int k = i; k > 0; k--) { // Numbers on each row
            System.out.print(k + " ");
         }
         System.out.println(); // Go to next line after inner loops execute
      }
      
   }
}