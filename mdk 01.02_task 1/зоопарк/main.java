import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        runTests();

        Scanner scanner = new Scanner(System.in);
        zoo myZoo = new zoo();

        while (true) {
            System.out.println("\nМеню зоопарка:");
            System.out.println("1.Добавить животное");
            System.out.println("2.Показать всех");
            System.out.println("3.Удалить по кличке");
            System.out.println("4.Добавить расход на еду");
            System.out.println("5.Показать общие расходы");
            System.out.println("0.Выход");
            System.out.print("Выберите пункт:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Какое животное добавить?");
                System.out.println("1 - Лев, 2 - Пингвин, 3 - Волк, 4 - Пантера, 5 - Питон, 6 - Удав, 7 - Гадюка");
                System.out.print("Ваш выбор:");
                int type = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Кличка:");
                String name = scanner.nextLine();
                System.out.print("Возраст:");
                int age = scanner.nextInt();
                System.out.print("Вес:");
                double weight = scanner.nextDouble();
                System.out.print("Номер вольера:");
                int aviary = scanner.nextInt();
                System.out.print("Дней в зоопарке:");
                int days = scanner.nextInt();

                animal a = null;

                if (type == 1) {
                    a = new lion(name, age, weight, aviary, days);
                } else if (type == 2) {
                    a = new penguin(name, age, weight, aviary, days);
                } else if (type == 3) {
                    a = new wolf(name, age, weight, aviary, days);
                } else if (type == 4) {
                    a = new panther(name, age, weight, aviary, days);
                } else if (type == 5) {
                    a = new python(name, age, weight, aviary, days);
                } else if (type == 6) {
                    a = new boa(name, age, weight, aviary, days);
                } else if (type == 7) {
                    a = new viper(name, age, weight, aviary, days);
                } else {
                    System.out.println("Неверный тип животного");
                }

                if (a != null) {
                    myZoo.addAnimal(a);
                }

            } else if (choice == 2) {
                myZoo.showAll();

            } else if (choice == 3) {
                System.out.print("Введите кличку для удаления: ");
                String name = scanner.nextLine();
                myZoo.removeAnimal(name);

            } else if (choice == 4) {
                System.out.print("Введите кличку животного: ");
                String name = scanner.nextLine();
                System.out.print("Введите сумму расхода: ");
                double cost = scanner.nextDouble();
                scanner.nextLine();

                boolean found = false;
                for (int i = 0; i < myZoo.animals.size(); i++) {
                    if (myZoo.animals.get(i).getName().equals(name)) {
                        myZoo.animals.get(i).addFoodCost(cost);
                        System.out.println("Расход добавлен для " + name);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Животное не найдено.");
                }

            } else if (choice == 5) {
                System.out.println("Расходы за сегодня: " + myZoo.getTotalCostToday());
                System.out.println("Расходы за все время: " + myZoo.getTotalCostAllTime());

            } else if (choice == 0) {
                System.out.println("Выход из программы");
                break;

            } else {
                System.out.println("Неверный пункт меню.");
            }
        }
        scanner.close();
    }

    public static void runTests() {
        System.out.println("Тесты:");

        // тест1
        try {
            animal badAnimal = new animal("Тест", -1, 10, 1, 1);
            System.out.println("Тест 1 провален: отрицательный возраст принят.");
        } catch (IllegalArgumentException e) {
            System.out.println("Тест 1 пройден: отрицательный возраст отклонен.");
        }

        // тест2
        animal lionTest = new lion("Лео", 5, 150.0, 1, 10);
        lionTest.addFoodCost(100.0);
        if (lionTest.getFoodCostToday() != 100.0) {
            throw new AssertionError("Тест 2 провален: расход не добавился.");
        }
        System.out.println("Тест 2 пройден: расход добавлен.");

        // тест3
        zoo testZoo = new zoo();
        animal tiger = new lion("Тигр", 3, 200.0, 2, 5);
        testZoo.addAnimal(tiger);
        testZoo.removeAnimal("Тигр");
        if (!testZoo.animals.isEmpty()) {
            throw new AssertionError("Тест 3 провален: животное не удалилось.");
        }
        System.out.println("Тест 3 пройден: животное удалено.");

        System.out.println("Тесты пройдены\n");
    }
}