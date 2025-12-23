import java.time.LocalDate;

public class Abonement {
    public LocalDate startDate;
    public LocalDate endDate;
    public Client client;

    public Abonement(Client client) {
        this.startDate = LocalDate.now();
        this.endDate = startDate.plusMonths(1);
        this.client = client;
    }

    public boolean canAccessGym(int hour) {
        if (hour < 8) return false;
        if (hour > 22) return false;
        return true;
    }

    public boolean canAccessPool(int hour) {
        return false; // обычный не может в бассейн
    }

    public boolean canAccessSpa(int hour) {
        if (hour < 8) return false;
        if (hour > 22) return false;
        return true;
    }

    public boolean canAccessGroup(int hour) {
        return false; // обычный не может на групповые
    }
}