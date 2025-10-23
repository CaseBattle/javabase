package task2;

import java.util.*;

public class num2 {
    public static void main(String[] args) {
        for (int floor = 1; floor <= 10; floor++) {
            for (int apartment = 1; apartment <= 5; apartment++) {
                System.out.println("Этаж " + floor + ", квартира " + apartment + " - посылка доставлена");
            }
        }
    }
}
