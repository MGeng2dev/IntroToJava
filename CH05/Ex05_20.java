/** Display Prime Numbers Between 2 And 1,000
 *  Modify Listing 5.15 to display all the prime numbers between 2 and 1,000,
 *  inclusive. Display eight prime numbers per line. Numbers are separated
 *  by exactly one space.
 *
 */
 
public class Ex05_20 {
   public static void main(String[] args) {
     // Initialize variables
      final int NUM_OF_PRIMES_PER_LINE = 8;
      int count = 0;
      
      // Loop thru numbers from 2-1,000
      for (int number = 2; number <= 1000; number++) {
         boolean isPrime = true;
         // Check number with all possible divisors
         for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
               isPrime = false; 
               break; // Exit for loop if a divisor is found
            }
         }
         // Print out prime numbers
         if (isPrime) {
            // Check if a new line should be started
            if (count % NUM_OF_PRIMES_PER_LINE == 0) {
               System.out.print("\n" + number + " ");
               count++;
            }
            else {
               System.out.print(number + " ");
               count++;
            }
         }      
      }
       
   }
}