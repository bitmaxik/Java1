package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Kia");
        car.setColor("White");
        car.setYear(2018);
        System.out.println("У меня автомобиль " + car.getModel() + ", цвет " + car.getColor() + ", год выпуска " + car.getYear());
    }
}
