package ru.ann.geometry;

import ru.ann.geometry.figures.Rectangle;
import ru.ann.geometry.figures.Square;
import ru.ann.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(5.0));
        Square.printSquarePer(new Square(5.0));

        Rectangle.printRectangleArea(new Rectangle(3.0, 5.0));
        Rectangle.printRectangleArea(new Rectangle(7.0, 9.0));

        Triangle.printTriangleArea(new Triangle(5,6,7));
        Triangle.printTrianglePer(new Triangle(5,6,7));
    }

}
