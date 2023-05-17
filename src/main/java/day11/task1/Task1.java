package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("Moscow"); // добавил имя склада для большей наглядности
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(courier);
        System.out.println(picker.toString());
        System.out.println(courier.toString());
        System.out.println(warehouse.toString());

        Warehouse warehouse1 = new Warehouse("Rostov");
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        picker1.doWork();
        courier1.doWork();

        System.out.println(warehouse.toString());
        System.out.println(picker.toString());
        System.out.println(courier.toString());

        System.out.println(warehouse1.toString());
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());


    }
    static void businessProcess(Worker worker){
        for(int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
