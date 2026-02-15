package itogmdk;


public abstract class Account {
    protected String number;
    protected double balance;
    protected String type;

    public Account(String number, double balance, String type) {
        this.number = number;
        this.balance = balance;
        this.type = type;
    }

    public String getТип() {
        return type;
    }

    public void setТип(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void block();

    @Override
    public String toString() {
        return "Номер: " + number + ", Баланс: " + balance + ", Тип: " + type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Account)) return false;
        Account acc = (Account) obj;
        return number.equals(acc.number);
    }
}
