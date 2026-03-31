import java.util.Scanner;
public class CheckDivBy5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 5 == 0) {
            System.out.println("Is The number "+number+" is divisible by 5?: true");
        } else {
            System.out.println("Is The number "+number+" is divisible by 5?: false");
        }
        sc.close();
    }
}