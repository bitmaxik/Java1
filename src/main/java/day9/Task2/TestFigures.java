package day9.Task2;

import day9.Task2.Circle;
import day9.Task2.Figure;
import day9.Task2.Rectangle;
import day9.Task2.Triangle;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures){
        double calculateRedPerimeter = 0;
        for (Figure figure: figures){
            if("Red".equals(figure.getColor()))
                calculateRedPerimeter += figure.perimeter();
        }
        return calculateRedPerimeter;
    }

    public static double calculateRedArea(Figure[] figures){
        double calculateRedArea = 0;
        for (Figure figure: figures){
            if("Red".equals(figure.getColor()))
                calculateRedArea += figure.area();
        }
        return calculateRedArea;
    }
}
