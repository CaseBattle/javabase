import java.util.ArrayList;

public class zoo {
    public ArrayList<animal> animals = new ArrayList<>();

    public void addAnimal(animal a) {
        animals.add(a);
        System.out.println("Животное " + a.getName() + " добавлено в зоопарк.");
    }

    public void showAll() {
        if (animals.isEmpty()) {
            System.out.println("Зоопарк пуст.");
            return;
        }
        System.out.println("Список животных:");
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).printInfo();
        }
    }

    public void removeAnimal(String name) {
        boolean found = false;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getName().equals(name)) {
                animals.remove(i);
                System.out.println("Животное " + name + " удалено.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Животное с кличкой " + name + " не найдено.");
        }
    }

    public double getTotalCostToday() {
        double sum = 0;
        for (int i = 0; i < animals.size(); i++) {
            sum += animals.get(i).getFoodCostToday();
        }
        return sum;
    }

    public double getTotalCostAllTime() {
        double sum = 0;
        for (int i = 0; i < animals.size(); i++) {
            sum += animals.get(i).getFoodCostTotal();
        }
        return sum;
    }
}