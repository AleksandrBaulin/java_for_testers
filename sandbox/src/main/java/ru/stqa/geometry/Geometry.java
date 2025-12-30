package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7));
        Rectangle.printRectangleArea(new Rectangle(3.0, 4.0));
        Triangle.printTrianglePerimeter(new Triangle(3, 4, 5));
        Triangle.printTriangleArea(new Triangle(3, 4, 5));
    }

}
