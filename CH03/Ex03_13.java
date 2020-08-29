/** Financial application: compute taxes
 *  Listing 3.5, ComputeTax.java, gives the source code to comput taxes for single
 *  filers. Complete Listing 3.5 to compute the taxes for all filing statuses.
 *
 */ 
 
import java.util.Scanner;
 
public class Ex03_13 { 
   public static void main(String[] args) {
      // Create scanner 
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter status & taxable income
      System.out.print("(0-single filer, 1-married jointly or " +
         "qualifying widow(er), 2-married separately, 3-head of " +
         "household) Enter the filing status: ");
      int status = input.nextInt();
      System.out.print("Enter taxable income: ");
      double income = input.nextDouble();
      
      // Declare and initialize variables 
      double tax = 0;
      double rate1 = 0.10;
      double rate2 = 0.15;
      double rate3 = 0.25;
      double rate4 = 0.28;
      double rate5 = 0.33;
      double rate6 = 0.35;
      
      int limit1_0 = 8350;  // Income range upper limit for status 0
      int limit2_0 = 33950;
      int limit3_0 = 82250;
      int limit4_0 = 171550;
      int limit5_0 = 372950;
      
      int limit1_1 = 16700;  // Income range upper limit for status 1
      int limit2_1 = 67900;
      int limit3_1 = 137050;
      int limit4_1 = 208850;
      int limit5_1 = 372950; 
      
      int limit1_2 = 8350;  // Income range upper limit for status 2
      int limit2_2 = 33950;
      int limit3_2 = 68525;
      int limit4_2 = 104425;
      int limit5_2 = 186475;
      
      int limit1_3 = 11950;  // Income ranger upper limit for status 3
      int limit2_3 = 45500;
      int limit3_3 = 117450;
      int limit4_3 = 190200;
      int limit5_3 = 372950;
      
      // Compute tax
      if (status == 0) {   // Compute tax for single filers
         if (income <= limit1_0)
            tax = income * rate1;
         else if (income <= limit2_0)
            tax = limit1_0 * rate1 + (income - limit1_0) * rate2;
         else if (income <= limit3_0)
            tax = limit1_0 * rate1 + (limit2_0 - limit1_0) * rate2 + 
               (income - limit2_0) * rate3;
         else if (income <= limit4_0)
            tax = limit1_0 * rate1 + (limit2_0 - limit1_0) * rate2 +
               (limit3_0 - limit4_0) * rate3 + (income - limit3_0) * rate4;
         else if (income <= limit5_0)
            tax = limit1_0 * rate1 + (limit2_0 - limit1_0) * rate2 +
               (limit3_0 - limit2_0) * rate3 + (limit4_0 - limit3_0) * rate4 +
               (income - limit4_0) * rate6;
         else
            tax = limit1_0 * rate1 + (limit2_0 - limit1_0) * rate2 +
               (limit3_0 - limit2_0) * rate3 + (limit4_0 - limit3_0) * rate4 +
               (limit5_0 - limit4_0) * rate5 + (income - limit5_0) * rate6;
      }  
      
      if (status == 1) {   // Compute tax for married jointly or qualifying widow(er)
         if (income <= limit1_1)
            tax = income * rate1;
         else if (income <= limit2_1)
            tax = limit1_1 * rate1 + (income - limit1_1) * rate2;
         else if (income <= limit3_1)
            tax = limit1_1 * rate1 + (limit2_1 - limit1_1) * rate2 + 
               (income - limit2_1) * rate3;
         else if (income <= limit4_1)
            tax = limit1_1 * rate1 + (limit2_1 - limit1_1) * rate2 +
               (limit3_1 - limit4_1) * rate3 + (income - limit3_1) * rate4;
         else if (income <= limit5_1)
            tax = limit1_1 * rate1 + (limit2_1 - limit1_1) * rate2 +
               (limit3_1 - limit2_1) * rate3 + (limit4_1 - limit3_1) * rate4 +
               (income - limit4_1) * rate6;
         else
            tax = limit1_1 * rate1 + (limit2_1 - limit1_1) * rate2 +
               (limit3_1 - limit2_1) * rate3 + (limit4_1 - limit3_1) * rate4 +
               (limit5_1 - limit4_1) * rate5 + (income - limit5_1) * rate6;
      }  
      
      if (status == 2) {   // Compute tax for married separately
         if (income <= limit1_2)
            tax = income * rate1;
         else if (income <= limit2_2)
            tax = limit1_2 * rate1 + (income - limit1_2) * rate2;
         else if (income <= limit3_2)
            tax = limit1_2 * rate1 + (limit2_2 - limit1_2) * rate2 + 
               (income - limit2_2) * rate3;
         else if (income <= limit4_2)
            tax = limit1_2 * rate1 + (limit2_2 - limit1_2) * rate2 +
               (limit3_2 - limit4_2) * rate3 + (income - limit3_2) * rate4;
         else if (income <= limit5_2)
            tax = limit1_2 * rate1 + (limit2_2 - limit1_2) * rate2 +
               (limit3_2 - limit2_2) * rate3 + (limit4_2 - limit3_2) * rate4 +
               (income - limit4_2) * rate6;
         else
            tax = limit1_2 * rate1 + (limit2_2 - limit1_2) * rate2 +
               (limit3_2 - limit2_2) * rate3 + (limit4_2 - limit3_2) * rate4 +
               (limit5_2 - limit4_2) * rate5 + (income - limit5_2) * rate6;
      }  
      
      if (status == 3) {   // Compute tax for head of household
         if (income <= limit1_3)
            tax = income * rate1;
         else if (income <= limit2_3)
            tax = limit1_3 * rate1 + (income - limit1_3) * rate2;
         else if (income <= limit3_3)
            tax = limit1_3 * rate1 + (limit2_3 - limit1_3) * rate2 + 
               (income - limit2_3) * rate3;
         else if (income <= limit4_3)
            tax = limit1_3 * rate1 + (limit2_3 - limit1_3) * rate2 +
               (limit3_3 - limit4_3) * rate3 + (income - limit3_3) * rate4;
         else if (income <= limit5_3)
            tax = limit1_3 * rate1 + (limit2_3 - limit1_3) * rate2 +
               (limit3_3 - limit2_3) * rate3 + (limit4_3 - limit3_3) * rate4 +
               (income - limit4_3) * rate6;
         else
            tax = limit1_3 * rate1 + (limit2_3 - limit1_3) * rate2 +
               (limit3_3 - limit2_3) * rate3 + (limit4_3 - limit3_3) * rate4 +
               (limit5_3 - limit4_3) * rate5 + (income - limit5_3) * rate6;
      }  
      
      
      // Display results
      System.out.println("Tax is " + (int)(tax * 100) / 100.0);
      
   }
}
      
      
      
      
      
      
      
      
      
      
       
