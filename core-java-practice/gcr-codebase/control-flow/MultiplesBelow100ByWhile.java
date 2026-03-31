
public class MultiplesBelow100ByWhile {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }
        System.out.println("Multiples of " + number + " below 100 are:");
        int counter = number - 1;
        while (counter > 1) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter--;
        }
        sc.close();
    }
}