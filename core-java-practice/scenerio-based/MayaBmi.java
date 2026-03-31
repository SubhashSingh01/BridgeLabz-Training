/* Maya’s BMI Fitness Tracker 🏃‍♀️
Maya, a fitness coach, wants to record the BMI of her clients.
● Ask for height and weight.
● Use formula BMI = weight / (height * height)
● Print category using if-else: Underweight, Normal, Overweight.
Use clear variable names and comments to maintain code hygiene. */
import java.util.Scanner;
public class MayaBmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height in meters:");
        double height = scanner.nextDouble();
        System.out.println("Enter weight in kilograms:");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");
        } else {
            System.out.println("Overweight");
        }
    }
}