package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2010, 25, 50);
        Airplane airplane1 = new Airplane("Tu-154", 2000, 40, 60);
        Airplane.compareAirplanes(airplane, airplane1);

    }
}