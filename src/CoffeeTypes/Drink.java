package CoffeeTypes;

public class Drink {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}
