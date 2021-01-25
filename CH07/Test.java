import java.util.Scanner;
public class Test {
   public static void main(String[] args) {
      int[] list = new int[5];
      System.out.print("Enter 5 values: ");
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < 5; i++) {
         list[i] = input.nextInt();
      }
      selectionSort(list);
      System.out.print("Sorted in decreasing order: " + java.util.Arrays.toString(list));
   }
      


   public static void selectionSort(int[] list) {
      for (int i = 0; i < list.length - 1; i++) {
         // find the minimum in the list[i... list.length-1]
         int currentMax = list[i];
         int currentMaxIndex = i;
         
         for (int j = i + 1; j < list.length; j++) {
            if (currentMax < list[j]) {
               currentMax = list[j];
               currentMaxIndex = j;
            }
         }
         
         // swap list[i] with list[currentMinIndex] if necessary
         if (currentMaxIndex != i) {
            list[currentMaxIndex] = list[i];
            list[i] = currentMax;
         }
      }
   }
}