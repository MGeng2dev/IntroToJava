/** Math: Pentagonal Numbers
 *  A pentagonal number is defined as n(3n-1)/2 for n = 1, 2, ..., and so on. Therefore, the
 *  first few numbers are 1, 5, 12, 22,... Write a method with the following header that
 *  returns a pentagonal number:
 *    
 *    public static int getPentagonalNumber(int n)
 *
 *  Write a test program that uses this method to display the first 100 pentagonal numbers
 *  with 10 numbers on each line.
 *
 */
 
public class Ex06_01 {
   public static void main(String[] args) {  
      int lineCount = 0; // initialize lineCount
   
      // For loop to generate 100 pentagonal numbers
      for (int i = 1; i <= 100; i++) {
         System.out.print(getPentagonalNumber(i) + " ");
         lineCount++; 
         if (lineCount % 10 == 0) { 
            System.out.print("\n"); // start new line after 10 numbers have been printed
         }
      }
   }
   
   /** Method returns Pentagonal Number based on parameter n */
   public static int getPentagonalNumber(int n) {
      int number = n * (3 * n - 1) / 2; // formula from problem statement
      return number;
   }
 
}