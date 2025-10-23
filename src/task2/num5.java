package task2;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Выберите номер правильного ответа");

        System.out.println("1. Какая столица Франции?");
        System.out.println("1) Лондон");
        System.out.println("2) Париж");
        System.out.println("3) Берлин");
        int answer1 = scanner.nextInt();
        if (answer1 == 2) score++;

        System.out.println("\n2. Сколько планет в Солнечной системе?");
        System.out.println("1) 7");
        System.out.println("2) 8");
        System.out.println("3) 9");
        int answer2 = scanner.nextInt();
        if (answer2 == 2) score++;

        System.out.println("\n3. Какое животное самое быстрое на суше?");
        System.out.println("1) Лев");
        System.out.println("2) Гепард");
        System.out.println("3) Антилопа");
        int answer3 = scanner.nextInt();
        if (answer3 == 2) score++;

        System.out.println("\n4. Какой язык программирования мы изучаем?");
        System.out.println("1) Python");
        System.out.println("2) C++");
        System.out.println("3) Java");
        int answer4 = scanner.nextInt();
        if (answer4 == 3) score++;

        System.out.println("\n5. Сколько дней в високосном году?");
        System.out.println("1) 365");
        System.out.println("2) 366");
        System.out.println("3) 364");
        int answer5 = scanner.nextInt();
        if (answer5 == 2) score++;

        System.out.println("\n6. Какая самая длинная река в мире?");
        System.out.println("1) Амазонка");
        System.out.println("2) Нил");
        System.out.println("3) Янцзы");
        int answer6 = scanner.nextInt();
        if (answer6 == 2) score++;

        System.out.println("\n7. Кто написал 'Войну и мир'?");
        System.out.println("1) Достоевский");
        System.out.println("2) Толстой");
        System.out.println("3) Чехов");
        int answer7 = scanner.nextInt();
        if (answer7 == 2) score++;

        System.out.println("\n8. Сколько цветов у радуги?");
        System.out.println("1) 6");
        System.out.println("2) 7");
        System.out.println("3) 8");
        int answer8 = scanner.nextInt();
        if (answer8 == 2) score++;

        System.out.println("\n9. Какая самая большая планета Солнечной системы?");
        System.out.println("1) Земля");
        System.out.println("2) Сатурн");
        System.out.println("3) Юпитер");
        int answer9 = scanner.nextInt();
        if (answer9 == 3) score++;

        System.out.println("\n10. В каком году человек полетел в космос?");
        System.out.println("1) 1957");
        System.out.println("2) 1961");
        System.out.println("3) 1969");
        int answer10 = scanner.nextInt();
        if (answer10 == 2) score++;

        System.out.println("Правильных ответов: " + score);

        scanner.close();
    }
}
