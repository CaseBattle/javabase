package task3;

public class Client {
    private int id;
    private String name;
    private String surname;
    private int birthYear;

    public Client(int id, String name, String surname, int birthYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        name = name;
    }

    public void printInfo() {
        System.out.println("Клиент: " + name + " " + surname +
                " (ID: " + id + ", год: " + birthYear + ")");
    }
}