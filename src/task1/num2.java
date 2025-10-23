package task1;

import java.util.*;

public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int a = sc.nextInt();

        if (a < 7) {
            System.out.println("Детский билет");
        } else if (a >= 7 && a <= 17) {
            System.out.println("Подростковый билет");
        } else if (a >= 18 && a <= 60) {
            System.out.println("Взрослый билет");
        } else if (a >= 61) {
            System.out.println("Пенсионный билет");
        } else {
            System.out.println("Ошибка ввода");
        }

        sc.close();

    }

}