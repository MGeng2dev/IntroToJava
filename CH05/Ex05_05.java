/** Conversion From Kilograms To Pounds And Pounds To Kilograms
 *  Write a program that displays the following two tables side by side:
 *    
 *    Kilograms   Pounds      |        Pounds      Kilograms
 *    1              2.2      |        20               9.09
 *    2              6.6               25              11.36
 *    ...                  
 *    197          433.4      |        510            231.82
 *    199          437.8      |        515            234.09
 *
 */   
 
public class Ex05_05 {
   public static void main(String[] args) {
      // Print table heading
      System.out.print("Kilograms\tPounds\t\t|\t\tPounds\t\tKilograms");
      
      // Print rows of table with a for loop
      for (int i = 1, j = 20; i < 200; i = i + 2, j += 5) {
         int kilograms1 = i;
         double pounds1 = kilograms1 * 2.2;
         int pounds2 = j;
         double kilograms2 = pounds2 / 2.2;
         
         System.out.printf("\n%-9d\t%6.1f\t\t|\t\t%-6d\t\t%9.2f", kilograms1, pounds1, pounds2, kilograms2);
      }
        
   }   
}