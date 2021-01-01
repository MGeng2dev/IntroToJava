/** Emirp
 *  An emirp (prime spelled backward) is a nonpalindromic prime number whose reversal is also
 *  a prime. For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps. 
 *  Write a program that displays the first 100 emirps. Display 10 numbers per line, separated
 *  by exactly one space, as follows:
 * 
 *    13 17 31 37 71 73 79 97 107 113
 *    149 157 167 179 199 311 337 347 359 389
 *    ...
 *
 */
 
public class Ex06_27 {
   public static void main(String[] args) {
      // Declare/initialize variables 
      final int TOTAL_EMIRP = 100;
      final int NUM_OF_EMIRP_PER_LINE = 10;
      int count = 0;
      int number = 2;  // a number to be tested for primeness
      
      // Loop until 100 emirps are found
      while (count < TOTAL_EMIRP) {
         if (isPrime(number) && !isPalindrome(number) && isPrime(reverse(number))) {
            count++;
            if (count % NUM_OF_EMIRP_PER_LINE == 0) {  
               System.out.print(number + "\n");  // print the number and advance to the new line
            }
            else
               System.out.printf(number + " ");
         }
         number++;
      }
      
   }
   
    /** Method checks whether a number is prime */
   public static boolean isPrime(int number) {  // this method is from Listing 6.7
      for (int divisor = 2; divisor <= number / 2; divisor++) {
         if (number % divisor == 0) {  // if true, number is not prime
            return false;
         }
      }
      return true;  // number is prime
   }
   
    /** Method returns the reversal of an integer */
   public static int reverse(int number) {  
      String numberReversed = "";
      // While loop thru all digits except the last
      while (number >= 10) {
         int digit = number % 10;
         numberReversed = numberReversed + digit;
         number = number / 10;
      }
      numberReversed = numberReversed + number;
      return Integer.parseInt(numberReversed);
   }
   
    /** Method returns true if number is a palindrome */
   public static boolean isPalindrome(int number) {  
      int numberReversed = reverse(number); // call reversal method
      // Compare numbers to check for palindrome
      if (number == numberReversed)
         return true;
      else
         return false;
   }
   
}