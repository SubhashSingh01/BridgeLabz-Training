import java.util.Scanner;
public class FindSumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number = sc.nextDouble();
        while (true) {
            if (number == 0 || number < 0) {
                break;
            }
            total += number;
            number = sc.nextDouble();
        }
        System.out.println(total);
        sc.close();
    }
}