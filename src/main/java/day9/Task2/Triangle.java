package day9.Task2;

import day9.Task2.Figure;

public class Triangle extends Figure {
    private int sideFirst;
    private int sideSecond;
    private int sideThird;

    public Triangle(int sideFirst, int sideSecond, int sideThird, String color){
        super(color);
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.sideThird = sideThird;
    }

    @Override
    public double area() {
        double perimeterDivTwo = (perimeter()/2);
        return Math.pow((perimeterDivTwo * (perimeterDivTwo - this.sideFirst)*(perimeterDivTwo - this.sideSecond)*(perimeterDivTwo - this.sideThird)), 0.5);
    }

    @Override
    public double perimeter() {
        return (this.sideFirst+this.sideSecond+this.sideThird);
    }
}
