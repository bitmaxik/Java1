package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String carModel){
        model = carModel;
    }

    public String getModel(){
        return model;
    }

    public void setColor(String carColor){
        color = carColor;
    }

    public String getColor(){
        return color;
    }

    public void setYear(int carYear){
        year = carYear;
    }

    public int getYear(){
        return year;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int year){
        return Math.abs(year - this.year);
    }
}
