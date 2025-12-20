
import java.util.Scanner;
public class BonusOfEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();
        System.out.println("Enter Years of Service:");
        int yearsOfService = sc.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No Bonus");
        }
        sc.close();
    }
}
