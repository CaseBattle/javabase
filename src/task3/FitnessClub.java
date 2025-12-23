package task3;

public class FitnessClub {
    private Membership[] gymMembers;
    private Membership[] poolMembers;
    private Membership[] groupMembers;
    private int gymCount, poolCount, groupCount;

    public FitnessClub() {
        gymMembers = new Membership[50];
        poolMembers = new Membership[20];
        groupMembers = new Membership[30];
        gymCount = poolCount = groupCount = 0;
    }

    public void registerInZone(Membership m, String zone) {
        if (zone.equals("зал")) {
            gymMembers[gymCount] = m;
            gymCount++;
            System.out.println(m.getOwner().getName() + " в зале");
        }
        else if (zone.equals("бассейн")) {
            if (m.mozhnoProiti(12, zone)) {
                poolMembers[poolCount] = m;
                poolCount++;
                System.out.println(m.getOwner().getName() + " в бассейне");
            } else {
                System.out.println("Нельзя в бассейн!");
            }
        }
        else if (zone.equals("групповые")) {
            groupMembers[groupCount] = m;
            groupCount++;
            System.out.println(m.getOwner().getName() + " на групповых");
        }
    }

    public void checkZoneAccess(String zone, int currentHour) {
        System.out.println("\nПроверка доступа в " + zone + " (час: " + currentHour + ")");

        Membership[] zoneArray = null;
        int count = 0;

        if (zone.equals("зал")) {
            zoneArray = gymMembers;
            count = gymCount;
        } else if (zone.equals("бассейн")) {
            zoneArray = poolMembers;
            count = poolCount;
        } else if (zone.equals("групповые")) {
            zoneArray = groupMembers;
            count = groupCount;
        }

        if (zoneArray != null) {
            for (int i = 0; i < count; i++) {
                Membership m = zoneArray[i];
                boolean canEnter = m.mozhnoProiti(currentHour, zone);
                System.out.print(m.getOwner().getName() + " (" + m.getType() + "): ");
                System.out.println(canEnter ? "можно" : "нельзя");
            }
        }
    }

    public Membership changeMembership(Client client, String newType) {
        System.out.println("Меняем абонемент для " + client.getName());

        Membership newMember = null;
        if (newType.equals("Обычный")) {
            newMember = new RegularMembership(client);
        } else if (newType.equals("VIP")) {
            newMember = new VIPMembership(client);
        }

        System.out.println("Создан новый абонемент типа: " + newType);
        return newMember;
    }

    public void close() {
        System.out.println("\nФитнес-клуб закрывается!");
        for (int i = 0; i < gymCount; i++) {
            System.out.println(gymMembers[i].getOwner().getName() + " покидает зал");
            gymMembers[i] = null;
        }
        gymCount = 0;
        System.out.println("Все клиенты ушли");
    }

    public void showMembers() {
        System.out.println("\nКлиенты фитнес-клуба:");

        Client[] allClients = new Client[100];
        int clientCount = 0;

        for (int i = 0; i < gymCount; i++) {
            allClients[clientCount] = gymMembers[i].getOwner();
            clientCount++;
        }

        System.out.println("Всего клиентов: " + clientCount);
        for (int i = 0; i < clientCount; i++) {
            allClients[i].printInfo();
        }
    }
}