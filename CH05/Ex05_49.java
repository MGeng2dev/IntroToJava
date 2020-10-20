/** Count Vowels And Consonants 
 *  Assume letters A, E, I, O, and U as the vowels. Write a program that prompts the user
 *  to enter a string and displays the number of vowels and consonants in the string.
 *
 */
 
import java.util.Scanner;
 
public class Ex05_49 {
   public static void main(String[] args) {
      // Create scanner & get user string
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      
      // Initialize variables
      int vowelCount = 0;
      int consonantCount = 0;
      
      // Loop thru all letters
      for (int i = 0; i < s.length(); i++) {
         char ch = Character.toLowerCase(s.charAt(i));
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount++;
         }
         else if (Character.isLetter(ch)) {
            consonantCount++;
         }
      }
      
      // Display results
      System.out.print("The  number of vowels is: " + vowelCount);
      System.out.print("\nThe number of consonants is: " + consonantCount);
   }
}