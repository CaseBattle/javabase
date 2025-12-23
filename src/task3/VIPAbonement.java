import java.time.LocalDate;

public class VIPAbonement extends Abonement {

    public VIPAbonement(Client client) {
        super(client);
        this.endDate = startDate.plusMonths(2);
    }

    @Override
    public boolean canAccessGym(int hour) {
        if (hour < 6) return false;
        if (hour > 24) return false;
        return true;
    }

    @Override
    public boolean canAccessPool(int hour) {
        if (hour < 6) return false;
        if (hour > 24) return false;
        return true;
    }

    @Override
    public boolean canAccessSpa(int hour) {
        if (hour < 6) return false;
        if (hour > 24) return false;
        return true;
    }

    @Override
    public boolean canAccessGroup(int hour) {
        if (hour < 6) return false;
        if (hour > 24) return false;
        return true;
    }
}