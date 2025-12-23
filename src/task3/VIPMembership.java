package task3;

public class VIPMembership extends Membership {

    public VIPMembership(Client owner) {
        super(owner);
        this.type = "VIP";
    }

    @Override
    public boolean mozhnoProiti(int chas, String zona) {
        if (chas >= 6 && chas <= 24) {
            return true;
        }
        return false;
    }

    public boolean vipStatus() {
        return true;
    }
}