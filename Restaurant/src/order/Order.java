package order;

import foodItem.FoodItem;

public class Order {
    private int orderID;
    private FoodItem[] foodItems;
    private double totalPrice;

    public Order(int orderID, FoodItem[] foodItems, double totalPrice) {
        this.orderID = orderID;
        this.foodItems = foodItems;
        this.totalPrice = totalPrice;
    }


    public Order(){};

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public FoodItem[] getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(FoodItem[] foodItems) {
        this.foodItems = foodItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
