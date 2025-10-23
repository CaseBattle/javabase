package task1;

import java.util.*;

public class num3 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(100) + 1; // от 1 до 100
        System.out.println("Ваши баллы: " + x);

        if (x >= 90 && x <= 100) {
            System.out.println("Отлично");
        } else if (x >= 60 && x <= 89) {
            System.out.println("Хорошо");
        } else if (x >= 40 && x <= 59) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}
