package academy.prog.extra.oop.lesson01.oopHW.task1;

public class ItemDescription {

    private double price;
    private String description;
    private int weight;

    public ItemDescription(double price, String description, int weight) {
        this.price = price;
        this.description = description;
        this.weight = weight;
    }

    public ItemDescription() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ItemDescription{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }
}
