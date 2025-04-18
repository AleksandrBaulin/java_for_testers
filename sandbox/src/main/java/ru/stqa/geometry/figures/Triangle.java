package ru.stqa.geometry.figures;

public class Triangle {
    public static void printTrianglePerimeter(double a, double b, double c) {
        var text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", a, b, c, perimeter(a, b, c));
        System.out.println(text);
    }

    public static double perimeter(double a, double b, double c) {
        return a +b + c;
    }
    public static void printTriangleArea(double a, double b, double c) {
        var text = String.format("Площадь теугольника со сторонами %f, %f и %f = %f", a, b, c, area(a, b, c));
        System.out.println(text);
    }

    public static double area(double a, double b, double c) {
        double p = (a +b +c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
