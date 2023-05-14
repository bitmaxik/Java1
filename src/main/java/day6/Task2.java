package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 50, 10000);
        airplane.setYear(2001);
        airplane.setLength(55);
        airplane.fillUp(100);
        airplane.fillUp(54);
        airplane.info();
    }
}
