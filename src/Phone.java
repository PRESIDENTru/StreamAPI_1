public class Phone implements Comparable<Phone> {

    private String model;
    private String name;
    private int price;

    public Phone(String name, String model, int price) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Phone o) {
        return this.price - o.price;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", model: " + this.model + ", price: " + this.price;
    }
}
