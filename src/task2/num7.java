package task2;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество тарелок: ");
        int plates = scanner.nextInt();

        System.out.print("Введите количество моющего средства: ");
        double detergent = scanner.nextDouble();

        for (int i = 1; i <= plates; i++) {
            if (detergent >= 0.5) {
                detergent -= 0.5; // расходуем средство
                System.out.println("Помыта тарелка " + i + ". Осталось средства: " + detergent);
            } else {
                System.out.println("Средство закончилось." + (plates - i + 1));
                break;
            }
        }

        if (detergent > 0) {
            System.out.println("\nВсе тарелки помыты! Осталось средства: " + detergent);
        }

        scanner.close();
    }
}
