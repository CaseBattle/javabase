public class Main {
    public static void main(String[] args) {
        System.out.println("Фитнес клуб\n");

        // клиенты
        Client client1 = new Client(101, "Иван", "Сидоров", 1995);
        Client client2 = new Client(102, "Мария", "Петрова", 1990);
        Client client3 = new Client(103, "Алексей", "Иванов", 1988);

        // показываем
        System.out.println("Зарегистрированные клиенты:");
        client1.printClient();
        client2.printClient();
        client3.printClient();
        System.out.println();

        // абонементы (мария - вип)
        System.out.println("Информация об абонементах: ");
        Abonement abon1 = new Abonement(client1);
        System.out.println("Иван Сидоров - обычный абонемент");

        VIPAbonement abon2 = new VIPAbonement(client2);
        System.out.println("Мария Петрова - VIP абонемент");

        Abonement abon3 = new Abonement(client3);
        System.out.println("Алексей Иванов - обычный абонемент");
        System.out.println();

        FitnessClub club = new FitnessClub();

        System.out.println("Посещения (3 посещения): \n");

        //Иван пытается в зал в 5:00 (клуб закрыт)
        System.out.println("1. Иван Сидоров в 5:00:");
        club.enterZone(abon1, "gym", 5);

        //Мария (VIP) в спа в 10:00
        System.out.println("\n2. Мария Петрова (VIP) в 10:00:");
        club.enterZone(abon2, "spa", 10);

        //Алексей в зал в 10:00
        System.out.println("\n3. Алексей Иванов в 10:00:");
        club.enterZone(abon3, "gym", 10);

        // Закрытие клуба
        club.closeClub();

        // смена абонемента
        System.out.println("\nСмена абонемента: ");
        Abonement newAbon = club.changeAbonement(abon1, true);
    }
}