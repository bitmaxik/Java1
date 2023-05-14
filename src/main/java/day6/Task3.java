package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петр петрович", "Биология");
        Student student = new Student("Вася");
        teacher.evaluate(student);
    }
}
