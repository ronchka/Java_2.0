package gift;

public class Jellybean extends Gift{
    private String color;

    public Jellybean(String name, int weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void getColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jellybean{" + super.toString() +
                "color=" + color +
                '}';
    }
}

