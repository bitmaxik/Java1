package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;
    private String name;

    public Warehouse(String name){
        this.name = name;
    }

    public int getCountPickedOrders(){
        return this.countPickedOrders;
    }
    public int getCountDeliveredOrders(){
        return this.countDeliveredOrders;
    }

    public void deliveredOrdersDone() {
        this.countDeliveredOrders += 1;
    }

    public void pickedOrdersDone() {
        this.countPickedOrders += 1;
    }

    public String toString(){
        return "Количество доставленных заказов на складе " + this.name + " " + this.getCountDeliveredOrders() + "\n" +
                "Количество собранных заказов на складе " + this.name + " " + this.getCountPickedOrders();

    }
}
