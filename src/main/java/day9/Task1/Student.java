package day9.Task1;

import day9.Task1.Human;

public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName(){
        return this.groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }

}
