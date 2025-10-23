package task2;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш вес (кг): ");
        double ves = scanner.nextDouble();

        System.out.print("Введите ваш рост (м): ");
        double rost = scanner.nextDouble();
        double bmi = ves / (rost * rost);

        if (bmi <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        } else if (bmi <= 18.5) {
            System.out.println("Дефицит массы тела");
        } else if (bmi <= 25) {
            System.out.println("Норма");
        } else if (bmi <= 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (bmi <= 35) {
            System.out.println("Ожирение 1-й степени");
        } else if (bmi <= 40) {
            System.out.println("Ожирение 2-й степени");
        } else {
            System.out.println("Ожирение 3-й степени");
        }
        scanner.close();
    }
}
