/** Palindromic Prime
 *  A palindromic prime is a prime number and also palindromic. For example, 131 is a prime 
 *  and also a palindromic prime, as are 313 and 757. Write a program that displays the first 
 *  100 palindromic prime numbers. Display 10 numbers per line, separated by exactly
 *  one space, as follows:
 *  
 *    2 3 5 7 11 11 131 151 181 191
 *    313 353 373 383 727 757 787 797 919 929
 *    ...
 *
 */
 
public class Ex06_26 {
   public static void main(String[] args) {
      // Declare/initialize variables
      final int TOTAL_PAL_PRIMES = 100;
      final int NUM_OF_PAL_PRIMES_PER_LINE = 10;
      int count = 0;
      int number = 2;  // a number to be tested for primeness
      
      // Loop until 100 palindromic primes are found
      while (count < TOTAL_PAL_PRIMES) {
         if (isPrime(number) && isPalindrome(reverse(number))) {
            count++;
            if (count % NUM_OF_PAL_PRIMES_PER_LINE == 0) {
               System.out.print(number + "\n");  // print the number and advance to new line
            }
            else
               System.out.printf(number + " ");
         }
         number++;
      }
   }
      
    /** Method checks whether a number is prime */
   public static boolean isPrime(int num) {  // this method is from Listing 6.7 
      for (int divisor = 2; divisor <= num / 2; divisor++) {
         if (num % divisor == 0) {  // if true, number is not prime
            return false;
         }
      }
      return true;  // number is prime
   }
      
    /** Method returns the reversal of an integer */
   public static int reverse(int number) {
      String numberReversed = "";
      // While loop thru all the digits except the last
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
      int numberReversed = reverse(number);  // call reversal method
      // Compare numbers to check for palindrome 
      if (number == numberReversed)
         return true;
      else
         return false;
   }

}
         

