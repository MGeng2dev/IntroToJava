/** Financial Application: Compute Commissions
 *  Write a method that computes the commission, using the scheme in Programming
 *  Exercise 5.39. The header of the method is as follows:
 *
 *    public static double computeCommission(double salesAmount)
 *
 *  Write a test program that displays the table shown.
 *
 */
 
public class Ex06_11 {
   public static void main(String[] args) {
      // Print table heading
      System.out.print("Sales Amount\t\tCommission");
      System.out.print("\n----------------------------");
      
      // For loop thru different sales amounts
      for (int i = 10000; i <= 100000; i += 5000) {
         // Print table rows
         System.out.printf("\n%-12d", i);
         System.out.print("\t\t");
         System.out.printf("%10.1f", computeCommission(i));  // method call
      }
   }
   
    /** Method computes commission for sales amount */
   public static double computeCommission(double salesAmount) {
      //double salary = 5000;
      double commission = 0;
      if (salesAmount <= 5000) 
         commission = 0.08 * salesAmount;
      else if (salesAmount <= 10000)
         commission = 0.08 * 5000 + 0.10 * (salesAmount - 5000);
      else
         commission = 0.08 * 5000 + 0.10 * 5000 + 0.12 * (salesAmount - 10000);
      return commission;
   }
}