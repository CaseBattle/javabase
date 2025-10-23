package task1;

import java.util.*;

public class num5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double g = 9.81;
        System.out.println("Введите скорость:");
        double v = s.nextDouble();
        System.out.println("Введите угол:");
        double a = s.nextDouble();

        double ang = a * Math.PI / 180;
        double tpol = 2 * v * Math.sin(ang) / g;
        System.out.println("Время полета = " + tpol);

        System.out.println("Введите время:");
        double t = s.nextDouble();

        if (t > tpol)
            {       System.out.println("Время больше чем время полета");
            return; }
        double x = v * Math.cos(ang) * t;
        double y = v * Math.sin(ang) * t - 0.5 * g * t * t;

        System.out.println("x = " + x) ;
        System.out.println("y = " + y);
    }
}
