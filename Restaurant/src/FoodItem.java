public class FoodItem {

    private double price;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public FoodItem(double price) {
        this.price = price;
    }

    public String getDetails() {
        return "Product: [name]" + " \n Price: " + getPrice();

    }
}
