/** Use The isPrime Method
 *  Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method for testing
 *  whether a number is prime. Use this method to find the number of prime numbers less 
 *  than 10,000.
 *
 */
 
public class Ex06_10 {
   public static void main(String[] args) {
      System.out.println("Prime numbers less than 10,000: \n");
      printPrimeNumbers(50);
   }
   
   public static void printPrimeNumbers(int numberOfPrimes) {
      final int NUM_OF_PRIMES_PER_LINE = 10; // display 10 per line
      int count = 0; // count number of prime numbers
      int number = 2; // a number to be tested for primeness
      
      // Repeatedly find prime numbers
      while (number < 10000) {
         // Print the prime number and increase the count
         if (isPrime(number)) {
            count++;
            if (count % NUM_OF_PRIMES_PER_LINE == 0) {
               // Print the number and advance to the new line
               System.out.printf("%-5s\n", number);
            }
            else
               System.out.printf("%-5s", number);
         }
         // Check whether the next number is prime
         number++;
      }
   }
      
    /** Method checks whether number is prime */
   public static boolean isPrime(int number) {
      for (int divisor = 2; divisor <= number / 2; divisor++) {
         if (number % divisor == 0) {  // if true, number is not prime
            return false; 
         }
      }
      return true;  // number is prime
   }
}