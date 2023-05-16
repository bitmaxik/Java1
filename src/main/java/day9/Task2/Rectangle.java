package day9.Task2;

import day9.Task2.Figure;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color){
        super(color);
        this.width = width;
        this.height =height;
    }

    @Override
    public double area() {
        return (this.height * this.width);
    }

    @Override
    public double perimeter() {
        return 2*(this.width + this.height);
    }
}
