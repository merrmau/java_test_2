package ru.ann.geometry.figures;

public record Rectangle(
        double a,
        double b
) {


    public static void printRectangleArea(Rectangle r) {
        var text = String.format("Площадь прямоугольника со сторонами %.1f и %.1f = %.1f", r.a, r.b, r.rectangleArea());
        System.out.println(text);
    }

    private double rectangleArea() {
        return this.a * this.b;
    }
}
