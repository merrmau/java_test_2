package ru.ann.geometry.figures;

public record Triangle
        (double a,
         double b,
         double c)

{
public static void printTriangleArea(Triangle a) {
    var text = String.format("Площать треугольника со сторонами %.1f, %.1f и %.1f = %.1f", a.a, a.b, a.c, a.triangleArea());
    System.out.println(text);
}

public static void printTrianglePer(Triangle s) {
        var text = String.format("Периметр треугольника со сторонами %.1f, %.1f и %.1f = %.1f", s.a, s.b, s.c, s.trianglePerimeter());
        System.out.println(text); }

    public double triangleArea() {
    double p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double trianglePerimeter() {
        return a + b + c;
    }
}
