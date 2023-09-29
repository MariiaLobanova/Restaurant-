package table;

public class Table {
   private int tableNumber;
   public void reserve(){

   }

    public Table(int tableNumber, boolean isAvailable) {
        this.tableNumber = tableNumber;
        this.isAvailable = isAvailable;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    private boolean isAvailable;

    public int getTableNumber() {
        return tableNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void release() {
        System.out.println("Release");
    }

}
