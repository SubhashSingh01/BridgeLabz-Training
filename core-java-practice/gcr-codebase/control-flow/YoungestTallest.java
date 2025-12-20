
import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Amar:");
        int ageAmar = sc.nextInt();
        System.out.println("Enter height of Amar:");
        int heightAmar = sc.nextInt();

        System.out.println("Enter age of Akbar:");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter height of Akbar:");
        int heightAkbar = sc.nextInt();

        System.out.println("Enter age of Anthony:");
        int ageAnthony = sc.nextInt();
        System.out.println("Enter height of Anthony:");
        int heightAnthony = sc.nextInt();

        // Finding the youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest.");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Finding the tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
        sc.close();
    }
}
