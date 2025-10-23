package task2;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Доход за месяц в SEK: ");
        double income = scanner.nextDouble();

        double tax = 0;

        if (income <= 18800) {
            tax = income * 0.11;
        } else if (income <= 468700) {
            tax = 18800 * 0.11 + (income - 18800) * 0.20;
        } else if (income <= 675700) {
            tax = 18800 * 0.11 + (468700 - 18800) * 0.20 + (income - 468700) * 0.32;
        } else {
            tax = 18800 * 0.11 + (468700 - 18800) * 0.20 + (675700 - 468700) * 0.32 + (income - 675700) * 0.40;
        }

        double netIncome = income - tax;

        System.out.println("Общий доход: " + income + " SEK");
        System.out.println("Налог: " + tax + " SEK");
        System.out.println("Чистый доход: " + netIncome + " SEK");

        scanner.close();
    }
}
