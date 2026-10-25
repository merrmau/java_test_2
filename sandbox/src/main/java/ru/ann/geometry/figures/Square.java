package ru.ann.geometry.figures;

public record Square(double side) {
    public Square {
        if (side < 0) {
            throw new IllegalArgumentException("Square side should be non-negative");
        }
    }

    public static void printSquareArea(Square s) {
        String text = String.format("Площадь квадрата со стороной %.1f = %.1f", s.side, s.area());
        System.out.println(text);

    }
    public static void printSquarePer(Square a) {
        String text = String.format("Периметр квадрата со стороной %.1f = %.1f", a.side, a.perimeter());
        System.out.println(text);

    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}

