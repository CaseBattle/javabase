public class FitnessClub {
    // массивы
    public Abonement[] gymArray = new Abonement[50];
    public Abonement[] poolArray = new Abonement[50];
    public Abonement[] spaArray = new Abonement[50];
    public Abonement[] groupArray = new Abonement[50];

    public int gymCounter = 0;
    public int poolCounter = 0;
    public int spaCounter = 0;
    public int groupCounter = 0;

    // Проверка времени 6-24
    private boolean isClubOpen(int hour) {
        return hour >= 6 && hour <= 24;
    }

    public boolean checkAccess(Abonement abon, String zone, int time) {
        // открыт ли клуб вообще
        if (!isClubOpen(time)) {
            return false;
        }

        if (zone.equals("gym")) return abon.canAccessGym(time);
        if (zone.equals("pool")) return abon.canAccessPool(time);
        if (zone.equals("spa")) return abon.canAccessSpa(time);
        if (zone.equals("group")) return abon.canAccessGroup(time);
        return false;
    }

    public void enterZone(Abonement abon, String zone, int hour) {
        // проверка работы клуба
        if (!isClubOpen(hour)) {
            System.out.println("Отказ! Клуб закрыт в " + hour + ":00 (работает с 6 до 24)");
            return;
        }

        if (!checkAccess(abon, zone, hour)) {
            System.out.println("Отказ! " + abon.client.name + " " +
                    abon.client.surname + " не может в " + getZoneName(zone) + " в " + hour + ":00");
            return;
        }

        if (zone.equals("gym")) {
            if (gymCounter < 50) {
                gymArray[gymCounter] = abon;
                gymCounter++;
                System.out.println(abon.client.name + " " + abon.client.surname +
                        " вошел в тренажерный зал в " + hour + ":00");
            }
        } else if (zone.equals("pool")) {
            if (poolCounter < 50) {
                poolArray[poolCounter] = abon;
                poolCounter++;
                System.out.println(abon.client.name + " " + abon.client.surname +
                        " вошел в бассейн в " + hour + ":00");
            }
        } else if (zone.equals("spa")) {
            if (spaCounter < 50) {
                spaArray[spaCounter] = abon;
                spaCounter++;
                System.out.println(abon.client.name + " " + abon.client.surname +
                        " пошел в спа-зону в " + hour + ":00");
            }
        } else if (zone.equals("group")) {
            if (groupCounter < 50) {
                groupArray[groupCounter] = abon;
                groupCounter++;
                System.out.println(abon.client.name + " " + abon.client.surname +
                        " пошел на групповые занятия в " + hour + ":00");
            }
        }
    }

    private String getZoneName(String zone) {
        if (zone.equals("gym")) return "тренажерный зал";
        if (zone.equals("pool")) return "бассейн";
        if (zone.equals("spa")) return "спа-зону";
        if (zone.equals("group")) return "групповые занятия";
        return zone;
    }

    public void closeClub() {
        System.out.println("\nКлуб закрывается:");
        System.out.println("Клуб закрыт, все клиенты покинули зал");

        // очистка массивов
        gymCounter = 0;
        poolCounter = 0;
        spaCounter = 0;
        groupCounter = 0;
    }

    public Abonement changeAbonement(Abonement oldAbon, boolean toVIP) {
        System.out.println("Клиент: " + oldAbon.client.name + " " + oldAbon.client.surname);

        if (toVIP) {
            System.out.println("Меняем обычный на VIP");
            return new VIPAbonement(oldAbon.client);
        } else {
            System.out.println("Меняем VIP на обычный");
            return new Abonement(oldAbon.client);
        }
    }
}