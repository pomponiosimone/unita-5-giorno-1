package pomponiosimone.unita_5_giorno_1.entities;

public class Pizza extends Menu {
    public Pizza(String name, int calories, double price) {
        super (name,calories,price);
    }
    @Override
    public String toString() {
        return "Topping{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
