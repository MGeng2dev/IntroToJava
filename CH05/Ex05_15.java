/** Display The ASCII Character Table
 *  Write a program that prints the characters in the ASCII character table from
 *  ! to ~. Display ten characters per line. The ASCII table is shown in 
 *  Appendix B. Characters are spearated by exactly one space.
 *
 */
 
public class Ex05_15 {
   public static void main(String[] args) {
     // Initialize variables
      int lineCount = 0;
      char currentChar = '!';
      
      // While loop to go thru characters
      while (currentChar <= '~') {
         // Check if a new line needs to be started
         if (lineCount % 10 == 0) {
            System.out.print("\n" + currentChar + " ");
            lineCount++;
         }
         else {
            System.out.print(currentChar + " ");
            lineCount++;
         }
         currentChar++;
      }
   }
}