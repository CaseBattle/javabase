package task1;

import java.util.*;

public class num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите p:");
        double p = sc.nextDouble();
        System.out.println("введите p1:");
        double p1 = sc.nextDouble();
        System.out.println("введите n:");
        int n = sc.nextInt();

        double q = (1 - p) * (1 - p1);
        double pa = p * p1 * (1 - Math.pow(q, n)) / (1 - q);

        System.out.println("вероятность P(A) = " + pa);
    }
}
