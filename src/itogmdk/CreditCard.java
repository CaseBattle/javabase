package itogmdk;


public class CreditCard extends Account implements Payment {

    private double creditLimit;
    private boolean isBlocked;

    public CreditCard(String number, double balance, double creditLimit) {
        super(number, balance, "Кредитная карта");
        this.creditLimit = creditLimit;
        this.isBlocked = false;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void pay(double amount) {
        if (!isBlocked && balance + creditLimit >= amount) {
            balance -= amount;
            System.out.println("Оплата по карте выполнена");
        } else {
            System.out.println("Превышен лимит или карта заблокирована");
        }
    }

    public void block() {
        isBlocked = true;
        System.out.println("Карта заблокирована");
    }

    @Override
    public String toString() {
        return super.toString() + ", Лимит: " + creditLimit + ", Заблокирована: " + isBlocked;
    }
}
