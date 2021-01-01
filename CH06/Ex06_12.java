/** Display Characters 
 *  Write a method that prints characters using the following header: 
 *  
 *    public static void printChars(char ch1, char ch2, int numberPerLine)
 *
 *  This method prints the characters between ch1 and ch2 with the specified numbers
 *  per line. Write a test program that prints ten characters per line from 1 to Z.
 *  Characters are separated by exactly one space.
 *
 */
 
public class Ex06_12 {
   public static void main(String[] args) {
      System.out.print("Characters between 1 and Z with 10 characters per line: ");
      printChars('1', 'Z', 10);  // call method per problem statement
      
   }
   
    /** Method prints characters between 2 characters */
   public static void printChars(char ch1, char ch2, int numberPerLine) {
      int printedCount = 0;
      for (char i = ch1; i <= ch2; i++) {
         if (printedCount % numberPerLine == 0)
            System.out.print("\n" + i + " ");  // start new line
         else 
            System.out.print(i + " ");  // print char on existing line
         printedCount++;
      }
   }
}