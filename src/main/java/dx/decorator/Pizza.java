package dx.decorator;

public class Pizza {
    public String toppings;

    public Pizza(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings='" + toppings + '\'' +
                '}';
    }
}
