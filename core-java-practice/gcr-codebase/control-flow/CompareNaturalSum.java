
import java.util.Scanner;
public class CompareNaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }
        int sumFormula = n * (n + 1) / 2;// Using this formula to find the sum of first n natural numbers
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;//
            i++;
        }
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Both results are correct: " + (sumFormula == sumWhile));
    }
}