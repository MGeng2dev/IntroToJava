/** Explore Matrix
 *  Write a program that prompts the user to enter the length of a square matrix,
 *  randomly fills in 0s and 1s into the matrix, prints the matrix, and finds the
 *  rows, columns, and diagonals with all 0s or 1s. 
 *
 */
 
import java.util.Scanner;
 
public class Ex08_14 {
   public static void main(String[] args) {
      // Create scanner & get user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size for the matrix: ");
      int size = input.nextInt();
      int[][] array = new int[size][size];
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[0].length; j++) {
            array[i][j] = (int)(Math.random() * 2);
         }
      }
      
      // Print matrix
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[0].length; j++) {
            System.out.print(array[i][j] + " ");
         }
         System.out.print("\n");
      }
      
      // Call methods
      checkRows(array);
      checkCols(array);
      checkDiagonal(array);
      checkSubDiagonal(array);
   }
   
    /** Method checks for all 0s or 1s on rows */
   public static void checkRows(int[][] a) {
      // Check for rows with all 0s
      boolean rowZeros = true;
      boolean noRowZeros = true;
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            if (a[i][j] == 1) {  
               rowZeros = false;
            }
         }
         if (rowZeros == true) {
            System.out.print("All 0s on row " + i + "\n");
            noRowZeros = false;
         }
         rowZeros = true;
      }
     
      // Check for rows with all 1's 
      boolean rowOnes = true;
      boolean noRowOnes = true;
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[0].length; j++) {
            if (a[i][j] == 0) {  
               rowOnes = false;
            }
         }
         if (rowOnes == true) {
            System.out.print("All 1s on row " + i + "\n");
            noRowOnes = false;
         }
         rowOnes = true;
      }
      
      if (noRowZeros == true && noRowOnes == true) {
         System.out.print("No same numbers on a row\n");
      }
   
   }
   
    /** Method checks for all 0s or 1s on cols */
   public static void checkCols(int[][] a) {
      // Check for cols with all 0s
      boolean colZeros = true;
      boolean noColZeros = true;
      for (int i = 0; i < a[0].length; i++) {
         for (int j = 0; j < a.length; j++) {
            if (a[j][i] == 1) {  
               colZeros = false;
            }
         }
         if (colZeros == true) {
            System.out.print("All 0s on column " + i + "\n");
            noColZeros = false;
         }
         colZeros = true;
      }
     
      // Check for cols with all 1's 
      boolean colOnes = true;
      boolean noColOnes = true;
      for (int i = 0; i < a[0].length; i++) {
         for (int j = 0; j < a.length; j++) {
            if (a[j][i] == 0) {  
               colOnes = false;
            }
         }
         if (colOnes == true) {
            System.out.print("All 1s on column " + i + "\n");
            noColOnes = false;
         }
         colOnes = true;
      }
      
      if (noColZeros == true && noColOnes == true) {
         System.out.print("No same numbers on a column\n");
      }
      
   }   
   
    /** Method checks for all 0s or 1s on main diagonal */
   public static void checkDiagonal(int[][] a) {
      // Check main diagonal for all 0s
      boolean diagZeros = true;
      boolean diagNotSame = true;
      for (int i = 0; i < a.length; i++) {
         if (a[i][i] == 1) {
            diagZeros = false;
         }
      }
      if (diagZeros == true) {
         System.out.print("All 0s on the major diagonal\n");
         diagNotSame = false;
      }
      
      // Check main diagonal for all 1s
      boolean diagOnes = true;
      for (int i = 0; i < a.length; i++) {
         if (a[i][i] == 0) {
            diagOnes = false;
         }
      }
      if (diagOnes == true) {
         System.out.print("All 1s on the major diagonal\n");
         diagNotSame = false;
      }
      
      // Check if no same numbers on major diagonal
      if (diagNotSame == true) {
         System.out.print("No same numbers on the major diagonal\n");
      }
   }
   
    /** Method checks for all 0s or 1s on the sub-diagonal */
   public static void checkSubDiagonal(int[][] a) {
      // Check sub-diagonal for all 0s
      boolean subDiagZeros = true;
      boolean subDiagNotSame = true;
      for (int i = 1; i < a.length; i++) {
         if (a[i][i-1] == 1) {
            subDiagZeros = false;
         }
      }
      if (subDiagZeros == true) {
         System.out.print("All 0s on the sub-diagonal");
         subDiagNotSame = false;
      }
      
      // Check sub-diagonal for all 1s
      boolean subDiagOnes = true;
      for (int i = 1; i < a.length; i++) {
         if (a[i][i-1] == 0) {
            subDiagOnes = false;
         }
      }
      if (subDiagOnes == true) {
         System.out.print("All 1s on the sub-diagonal");
         subDiagNotSame = false;
      }
      
      // Check if no same numbers on sub-diagonal
      if (subDiagNotSame == true) {
         System.out.print("No same numbers on the sub-diagonal");
      }
   
   }
            
}