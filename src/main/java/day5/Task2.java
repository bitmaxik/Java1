package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike("Honda","White", 2020);
        System.out.println("У меня есть мотоцикл модель " + bike.getModel() + ", цвет " + bike.getColor() + ", год выпуска " + bike.getYear());
    }
}
