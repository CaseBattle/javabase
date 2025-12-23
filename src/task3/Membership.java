package task3;

import java.time.LocalDate;

public abstract class Membership {
    private LocalDate regDate;
    private LocalDate expDate;
    protected Client owner;
    protected String type;

    public Membership(Client owner) {
        this.owner = owner;
        this.regDate = LocalDate.now();
        this.expDate = regDate.plusYears(1);
    }

    public abstract boolean mozhnoProiti(int chas, String zona);

    public Client getOwner() {
        return owner;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public String getType() {
        return type;
    }

    public void changeType(String newType) {
        this.type = newType;
        System.out.println("Тип изменен на: " + newType);
    }
}