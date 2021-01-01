/** Mersenne Prime
 *  A prime number is called a Mersenne prime if it can be written in the form 2^p - 1 for
 *  some positive integer p. Write a program that finds all Mersenne primes with P <= 31 
 *  and displays the output as follows: 
 * 
 *    p        2^p - 1
 *    -------------------
 *    2        3
 *    3        7 
 *    5        31
 *    ...
 *
 */
 
public class Ex06_28 {
   public static void main(String[] args) {
      // Declare/ initialize variables
      int number = 2;  // number to be tested 
   
      // Print table header
      System.out.print("p        2^p - 1\n");
      System.out.print("----------------------\n");
      
      // Loop thru numbers up to 31
      while (number <= 31) {
         if (isPrime(number) && isMersennePrime(number)) {
            System.out.printf("%-2d\t\t\t", number);
            System.out.print(((int)(Math.pow(2, number) - 1) + "\n"));
         }
         number++;
      }
      
   }
   
    /** Method checks whether number is prime */
   public static boolean isPrime(int number) {  // this method is from Listing 6.7
      for (int divisor = 2; divisor <= number / 2; divisor++) {
         if (number % divisor == 0) {  // if true, number is not prime
            return false; 
         }
      }
      return true;  // number is prime
   }
   
    /** Method returns true if number is a Mersenne prime */
   public static boolean isMersennePrime(int number) {
      double value = Math.pow(2, number) - 1;
      if (value == (int)value) // checks if value is an integer
         return true;
      else
         return false;
   }
   
}