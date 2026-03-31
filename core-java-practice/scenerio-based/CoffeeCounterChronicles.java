/*The Coffee Counter Chronicles ☕
Ravi runs a café. Each customer orders different coffee types with quantities. Write a program
that:
● Asks for coffee type (switch)
● Calculates total bill (price * quantity)
● Adds GST using arithmetic operators
Use while to continue for the next customer and break when "exit" is typed. */
import java.util.*;
public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coffeeType;
        double price = 0.0;
        double totalBill=0.0;
        final double GST_RATE = 0.18; // 18% GST

        while (true) {
            System.out.println("Enter coffee type (espresso, latte, cappuccino) or 'exit' to quit:");
            coffeeType = scanner.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                break;
            }

            switch (coffeeType) {
                case "espresso":
                    price = 43.00;
                    break;
                case "latte":
                    price = 54.00;
                    break;
                case "cappuccino":
                    price = 64.50;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // clear the newline

            totalBill = price * quantity;
            double gstAmount = totalBill * GST_RATE;
            double finalAmount = totalBill + gstAmount;

            System.out.printf("Total bill (including GST): Rs.%.2f%n", finalAmount);
        }

        scanner.close();
        System.out.println("Thank you for visiting the café!");
    }
}
