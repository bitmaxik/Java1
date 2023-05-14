package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

public Teacher(String name, String subject){
    this.name = name;
    this.subject = subject;
}



    public void evaluate(Student student){
        Random random = new Random();
        int i = random.nextInt(4) + 2;
        String assessment = "";
        switch (i){
            case 2:
                assessment = "Неудовлетворительно";
                break;
            case 3:
                assessment = "Удовлетворительно";
                break;
            case 4:
                assessment = "Хорошо";
                break;
            case 5:
                assessment = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + "оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку " + assessment);
    }
}
