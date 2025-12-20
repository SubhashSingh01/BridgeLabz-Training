import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int greatestFactor = 1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                greatestFactor = i;
            }
        }
        System.out.println("Greatest Factor: " + greatestFactor);
        sc.close();
    }
}
