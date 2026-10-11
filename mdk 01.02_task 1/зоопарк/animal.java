public class animal {
    private String name;
    private int age;
    private double weight;
    private int aviaryNumber;
    private int daysInZoo;
    private double foodCostToday;
    private double foodCostTotal;

    public animal(String name, int age, double weight, int aviaryNumber, int daysInZoo) {
        if (age < 0 || weight <= 0 || daysInZoo < 0) {
            throw new IllegalArgumentException("Ошибка: не могут быть отрицательными");
        }
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.aviaryNumber = aviaryNumber;
        this.daysInZoo = daysInZoo;
        this.foodCostToday = 0;
        this.foodCostTotal = 0;
    }

    public String getName() { return name; }
    public double getFoodCostToday() { return foodCostToday; }
    public double getFoodCostTotal() { return foodCostTotal; }

    public void addFoodCost(double cost) {
        if (cost < 0) {
            System.out.println("Расход не может быть отрицательным");
            return;
        }
        this.foodCostToday += cost;
        this.foodCostTotal += cost;
    }

    public void printInfo() {
        System.out.println("Кличка: " + name + " | Возраст: " + age + " | Вес: " + weight +
                " | Вольер: " + aviaryNumber + " | Дней в зоопарке: " + daysInZoo);
    }
}