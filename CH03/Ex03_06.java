/** Health application: BMI
 *  Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, 
 *  and inches. For example, if a person is 5 feet and 10 inches, you will 
 *  enter 5 for feet and 10 for inches.
 *
 */
 
import java.util.Scanner;
 
public class Ex03_06 { 
   public static void main(String[] args) {
      // Create scanner and get weight and height from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight in pounds: ");
      double weight = input.nextDouble();
      System.out.print("Enter height, feet: ");
      double heightFeet = input.nextDouble();
      System.out.print("Enter height, inches: ");
      double heightInches = input.nextDouble();
      
      // Calculate BMI
      final double KILOGRAMS_PER_POUND = 0.45359237; // constant
      final double METERS_PER_INCH = 0.0254; // constant
      double weightInKilograms = weight * KILOGRAMS_PER_POUND;
      double heightInMeters = (heightFeet * 12 + heightInches) * METERS_PER_INCH;
      double bmi = weightInKilograms / (heightInMeters * heightInMeters);
      
      // Display result
      System.out.println("BMI is " + bmi);
      if (bmi < 18.5)
         System.out.println("Underweight");
      else if (bmi < 25)
         System.out.println("Normal");
      else if (bmi < 30) 
         System.out.println("Overweight");
      else
         System.out.println("Obese");
         
   }
}
