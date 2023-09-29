package Order;

//Attributes: orderID, foodItems, totalPrice

public class Order {

    private int orderID;
    private String foodItem;
    private double totalPrice;

    public Order(int orderID, String foodItem, double totalPrice) {
        this.orderID = orderID;
        this.foodItem = foodItem;
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
