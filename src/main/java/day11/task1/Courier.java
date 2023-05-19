package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    public static final int BONUS = 50000;
    public static final int DELIVEREDBONUSCOUNT = 10000;
    public static final int PAYMENT = 100;


    public Courier(Warehouse warehouse) {
        this.salary = 0;
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return this.salary;
    }

    public boolean getIsPayed() {
        return this.isPayed;
    }

    public String toString(){
        return "заработная плата " + this.salary + "\n";
    }

    @Override
    public void doWork() {
        this.salary += PAYMENT;
        warehouse.deliveredOrdersDone();
    }

    @Override
    public void bonus() {
        if (this.isPayed) System.out.println("Бонус уже был выплачен");
        else {
            if (warehouse.getCountDeliveredOrders() == DELIVEREDBONUSCOUNT) {
                this.salary += BONUS;
                this.isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }

        }
    }
}
