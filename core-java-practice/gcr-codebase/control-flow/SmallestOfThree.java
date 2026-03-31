import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Is the first number the smallest? true");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Is the second number the smallest? true");
        } else {
            System.out.println("Is the third number the smallest? true");
        }

        sc.close();
    }
}
