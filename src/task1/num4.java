package task1;

import java.util.*;

public class num4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double g = 9.81;
        System.out.println("Введите скорость вверх:");
        double v = s.nextDouble();
        System.out.println("Введите время:");
        double t = s.nextDouble();

        double h = v * t - 0.5 * g * t * t;

        if (h < 0) {
            h = 0;
        }

        System.out.println("Высота = " + h);
    }
}
