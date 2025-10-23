package task2;

import java.util.Random;

public class num1 {
    public static void main(String[] args) {
        Random random = new Random();
        int colorCode = random.nextInt(3);

        if (colorCode == 0) {
            System.out.println("Красный");
        } else if (colorCode == 1) {
            System.out.println("Зелёный");
        } else if (colorCode == 2) {
            System.out.println("Жёлтый");
        }
    }
}
