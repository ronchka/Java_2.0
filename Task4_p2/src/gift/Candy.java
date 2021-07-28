package gift;

public class Candy extends Gift {
    private int calory;

    public Candy(String name, int weight, Double price, int calory) {
        super(name, weight, price);
        this.calory = calory;
    }

    public int getCalory() {
        return calory;
    }

    public void setCalory(int calory) {
        this.calory = calory;
    }

    @Override
    public String toString() {
        return "Candy{" + super.toString() +
                "calory=" + calory +
                '}';
    }
}
