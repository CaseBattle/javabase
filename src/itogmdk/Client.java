package itogmdk;


public class Client {

    private String name;
    private BankAccount account;
    private CreditCard card;

    public Client(String name, BankAccount account, CreditCard card) {
        this.name = name;
        this.account = account;
        this.card = card;
    }

    public void payOrder(double amount) {
        card.pay(amount);
    }

    public void transferMoney(BankAccount other, double amount) {
        account.transfer(other, amount);
    }

    public void blockCard() {
        card.block();
    }

    public void closeAccount() {
        account.block();
    }

    @Override
    public String toString() {
        return "Клиент: " + name + "\n" + account + "\n" + card;
    }
}
