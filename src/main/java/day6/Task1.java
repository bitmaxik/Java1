package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Kia");
        car1.setColor("White");
        car1.setYear(2018);
        Motorbike motorbike = new Motorbike("Honda", "White", 2020);
        car1.info();
        motorbike.info();
        System.out.println(car1.yearDifference(2010));
        System.out.println(motorbike.yearDifference(2030));
    }
}
