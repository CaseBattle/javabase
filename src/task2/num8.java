package task2;

import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        String[] movies = {
                "Форрест Гамп",
                "Крестный отец",
                "Начало",
                "Зеленая миля",
                "Побег из Шоушенка"
        };

        int movieCount = movies.length;

        System.out.println("Список фильмов:");
        System.out.println("Всего фильмов: " + movieCount);

        if (movieCount < 30) {
            System.out.println("Фильмов для просмотра меньше 30");
            System.out.println("Можно добавить еще " + (30 - movieCount) + " фильмов");
        }

        System.out.println("\nВаш список:");
        for (int i = 0; i < movieCount; i++) {
            System.out.println((i + 1) + ". " + movies[i]);
        }
    }
}
