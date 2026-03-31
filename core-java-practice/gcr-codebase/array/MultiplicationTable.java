/*Program to print a multiplication table of a number.*/
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer to print its multiplication table:");
        int number = scanner.nextInt();
        int[] multiplicationTable = new int[10];

        // Storing multiplication results in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Displaying the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
    }
}
