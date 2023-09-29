public class FoodItem {


    //Maria: FoodItem : name attribute plus get and set method
    private String name;
    private double price;

    public FoodItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void getDetails() {
            System.out.println("Name: " + name);
            System.out.println("Price: $" + price);
        }
    }


