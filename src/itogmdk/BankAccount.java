package itogmdk;


public class BankAccount extends Account implements Payment {

    private boolean isActive;

    public BankAccount(String number, double balance) {
        super(number, balance, "Банковский счет");
        isActive = true;
    }

    public void pay(double amount) {
        if (isActive && balance >= amount) {
            balance -= amount;
            System.out.println("Оплата выполнена");
        } else {
            System.out.println("Недостаточно средств или счет заблокирован");
        }
    }

    public void transfer(BankAccount other, double amount) {
        if (balance >= amount) {
            balance -= amount;
            other.balance += amount;
            System.out.println("Перевод выполнен");
        }
    }

    public void block() {
        isActive = false;
        System.out.println("Счет аннулирован");
    }

    @Override
    public String toString() {
        return super.toString() + ", Активен: " + isActive;
    }
}
