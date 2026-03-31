
public class MultiplesBelow100 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}