package ru.ann.geometry.figures;

public class Square {

    public static void printSquareArea(double side) {
        String text = String.format("Площадь квадрата со стороной %.1f = %.1f", side, Area(side));
        System.out.println(text);

    }
    public static void printSquareAreaPer (double side) {
        String text = String.format("Периметр квадрата со стороной %.1f = %.1f", side, perimeter(side));
        System.out.println(text);

    }

    public static double Area(double a) {
        return a * a;
    }

    public static double perimeter(double a) {
        return 4 * a;
    }
}

