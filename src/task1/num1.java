package task1;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число:" );
        int month = scanner.nextInt();

        if (month == 1) {
            System.out.println("Январь - Зима");
        }
        if (month == 2) {
            System.out.println("Февраль - Зима");
        }
        if (month == 3) {
            System.out.println("Март - Весна");
        }
        if (month == 4) {
            System.out.println("Апрель - Весна");
        }
        if (month == 5) {
            System.out.println("Май - Весна");
        }
        if (month == 6) {
            System.out.println("Июнь - Лето");
        }
        if (month == 7) {
            System.out.println("Июль - Лето");
        }
        if (month == 8) {
            System.out.println("Август - Лето");
        }
        if (month == 9) {
            System.out.println("Сентябрь - Осень");
        }
        if (month == 10) {
            System.out.println("Октябрь - Осень");
        }
        if (month == 11) {
            System.out.println("Ноябрь - Осень");
        }
        if (month == 12) {
            System.out.println("Декабрь - Зима");
        }

        if (month < 1) {
            System.out.println("Ошибка:число слишком маленькое");
        }
        if (month > 12) {
            System.out.println("Ошибка: число слишком большое");
        }

        scanner.close();
    }
}
