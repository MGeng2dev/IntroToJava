//  Population projection
//  One birth every 7 seconds
//  One death every 13 seconds
//  One new immigrant every 45 seconds

public class Ex01_11 {
   public static void main(String[] args) {
      System.out.println("Current population: 312,032,486");
      System.out.println("In 1 year: " + (312032486 + (1 * (((1.0 / 7) * 60 * 60 * 24 * 365) - ((1/ 13.0) * 60 * 60 * 24 * 365) + ((1 / 45.0) * 60 * 60 * 24 * 365)))));
      System.out.println("In 2 years: " + (312032486 + (2 * (((1.0 / 7) * 60 * 60 * 24 * 365) - ((1/ 13.0) * 60 * 60 * 24 * 365) + ((1 / 45.0) * 60 * 60 * 24 * 365)))));
      System.out.println("In 3 years: " + (312032486 + (3 * (((1.0 / 7) * 60 * 60 * 24 * 365) - ((1/ 13.0) * 60 * 60 * 24 * 365) + ((1 / 45.0) * 60 * 60 * 24 * 365)))));
      System.out.println("In 4 years: " + (312032486 + (4 * (((1.0 / 7) * 60 * 60 * 24 * 365) - ((1/ 13.0) * 60 * 60 * 24 * 365) + ((1 / 45.0) * 60 * 60 * 24 * 365)))));
      System.out.println("In 5 years: " + (312032486 + (5 * (((1.0 / 7) * 60 * 60 * 24 * 365) - ((1/ 13.0) * 60 * 60 * 24 * 365) + ((1 / 45.0) * 60 * 60 * 24 * 365)))));
      
   }
}