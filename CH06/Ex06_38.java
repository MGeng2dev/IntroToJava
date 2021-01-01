/** Generate Random Characters
 *  Use the methods in RandomCharacter in Listing 6.10 to print 100 uppercase letters and 
 *  then 100 single digits, printing ten per line.
 *
 */
 
 
public class Ex06_38 {
   public static void main(String[] args) {
      // Declare/ initialize variables
      char ch;
      int lineCount = 1;
      
      // Print 100 uppercase letters
      for (int i = 0; i < 100; i++) {
         ch = getRandomCharacter('A', 'Z');
         if (lineCount % 10 == 0) 
            System.out.print(ch + "\n");
         else
            System.out.print(ch + " ");
         lineCount++;
      }
   
      // Print 100 single digits
      for (int i = 0; i < 100; i++) {
         ch = getRandomCharacter('0', '9');
         if (lineCount % 10 == 0) 
            System.out.print(ch + "\n");
         else
            System.out.print(ch + " ");
         lineCount++;
      }
   
   }
         
    /** Generate a random character between ch1 and ch2 */
   public static char getRandomCharacter(char ch1, char ch2) {
      return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
   }

}