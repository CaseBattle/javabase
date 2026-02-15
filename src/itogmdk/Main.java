
package itogmdk;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("1111", 1000);
        CreditCard card1 = new CreditCard("2222", 0, 500);

        Client client = new Client("Иван", acc1, card1);
        Admin admin = new Admin("Петр");

        System.out.println(client);

        client.payOrder(300);
        client.transferMoney(new BankAccount("3333", 500), 200);

        admin.blockCardIfExceeded(card1);

        client.blockCard();
        client.closeAccount();

        System.out.println(client);
    }
}
