public class Client {
    public int id;
    public String name;
    public String surname;
    public int year;

    public Client(int id, String name, String surname, int year) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public void printClient() {
        System.out.println(name + " " + surname + " " + year + "г. (ID: " + id + ")");
    }
}