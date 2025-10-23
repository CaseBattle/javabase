package task2;

import java.util.Scanner;
import java.util.Random;

public class num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 3;

        System.out.println("Угадай число от 1 до 100");
        System.out.println("У тебя " + attempts + " попытки чтобы угадать");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("\nПопытка " + i + ". Введи число: ");
            int userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Ты угадал число " + secretNumber);
                scanner.close();
                return;
            } else if (userGuess < secretNumber) {
                System.out.println("Число БОЛЬШЕ твоего");
            } else {
                System.out.println("Число МЕНЬШЕ твоего");
            }

            if (i < attempts) {
                System.out.println("Осталось попыток:" + (attempts - i));
            }
        }
        System.out.println("Загадал число:" + secretNumber);
        scanner.close();
    }
}
