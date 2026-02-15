package itogmdk;


public class Admin {

    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public void blockCardIfExceeded(CreditCard card) {
        if (card.getBalance() < -card.getCreditLimit()) {
            card.block();
            System.out.println("Администратор заблокировал карту");
        }
    }
}
