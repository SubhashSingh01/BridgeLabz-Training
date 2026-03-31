
import java.util.Scanner;
public class CompareNaturalSumWithFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }
        int sumFormula = n * (n + 1) / 2;// Using this formula to find the sum of first n natural numbers
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Both results are correct: " + (sumFormula == sumFor));
    }
}
