package gift;

public abstract class Gift {
    private String name;
    private int weight;
    private Double price;

    public Gift(String name, int weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", ";
    }

}
