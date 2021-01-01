/** Twin Primes
 *  Twin primes are a pair of prime numbers that differ by 2. For example, 3 and 5 are twin primes,
 *  5 and 7 are twin primes, and 11 and 13 are twin primes. 
 *  Write a program to find all twin primes less than 1,000. Display the output as follows: 
 *
 *    (3, 5)
 *    (5, 7)
 *    ...
 *
 */

public class Ex06_29 {
   public static void main(String[] args) {
      // Declare/initialize variables
      final int MAX_NUM = 1000;
      int number = 2;  // a number to be test for primeness
   
      // Loop thru numbers up to 1,000 
      while (number < MAX_NUM) {
         if (isPrime(number)) {
            int twin1 = number;
            if (isPrime(number + 2)) {
               int twin2 = number + 2;
               System.out.print("(" + twin1 + ", " + twin2 + ")\n");
            }
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
   
}
