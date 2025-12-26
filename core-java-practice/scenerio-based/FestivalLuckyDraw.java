import java.util.*;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of visitors participating in the lucky draw: ");
        int visitors = sc.nextInt();   // number of visitors
        Random random = new Random();

        for (int i = 1; i <= visitors; i++) {

            // Generate lucky draw number (1 to 100)
            int luckyNumber = random.nextInt(1000) + 1;

            System.out.println("Visitor " + i + " got number: " + luckyNumber);

            // check for invalid number
            if (luckyNumber <= 0) {
                continue;
            }

            // Winning condition
            if (luckyNumber % 3 == 0 && luckyNumber % 5 == 0) {
                System.out.println("Congratulations! You win a gift \n");
            } else {
                System.out.println("No gift this time. Try again!\n");
            }
        }
    }
}

