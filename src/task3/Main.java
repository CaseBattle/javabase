package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FitnessClub club = new FitnessClub();
        Scanner scan = new Scanner(System.in);

        Client client1 = new Client(1, "Иван", "Иванов", 1990);
        Client client2 = new Client(2, "Петр", "Петров", 1985);

        Membership mem1 = new RegularMembership(client1);
        Membership mem2 = new VIPMembership(client2);

        club.registerInZone(mem1, "зал");
        club.registerInZone(mem2, "зал");
        club.registerInZone(mem2, "бассейн");

        boolean rabotaet = true;
        while (rabotaet) {
            System.out.println("\nГлавное Меню:");
            System.out.println("1.Показать клиентов");
            System.out.println("2.Проверить доступ в зону");
            System.out.println("3.Сменить абонемент");
            System.out.println("4.Закрыть клуб");
            System.out.println("0.Выход");
            System.out.print("Выбор: ");

            int vybor = scan.nextInt();

            switch(vybor) {
                case 1:
                    club.showMembers();
                    break;

                case 2:
                    System.out.print("Зона (зал/бассейн/групповые): ");
                    String zona = scan.next();
                    System.out.print("Текущий час (0-23): ");
                    int chas = scan.nextInt();
                    club.checkZoneAccess(zona, chas);
                    break;

                case 3:
                    System.out.print("ID клиента: ");
                    int id = scan.nextInt();
                    System.out.print("Новый абонемент (Обычный/VIP): ");
                    String tip = scan.next();

                    Client clientForChange = null;
                    if (id == 1) clientForChange = client1;
                    else if (id == 2) clientForChange = client2;

                    if (clientForChange != null) {
                        club.changeMembership(clientForChange, tip);
                    } else {
                        System.out.println("Клиент не найден");
                    }
                    break;

                case 4:
                    club.close();
                    break;

                case 0:
                    rabotaet = false;
                    System.out.println("До свидания!");
                    break;

                default:
                    System.out.println("Неверный выбор!");
            }
        }

        scan.close();
    }
}