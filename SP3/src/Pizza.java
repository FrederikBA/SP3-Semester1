public class Pizza {
    int id;
    private final double price;
    private final String title;

    public Pizza(int id, double price, String title) {
        this.id = id;
        this.price = price;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getId() + ". " + getTitle() + ": " + getPrice() + ",-";
    }
}
