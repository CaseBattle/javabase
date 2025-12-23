package task3;

public class RegularMembership extends Membership {

    public RegularMembership(Client owner) {
        super(owner);
        this.type = "Обычный";
    }

    @Override
    public boolean mozhnoProiti(int chas, String zona) {
        if (zona.equals("зал") || zona.equals("спа")) {
            return chas >= 8 && chas <= 22;
        }
        return false;
    }

    public boolean skidkaEst() {
        return false;
    }
}