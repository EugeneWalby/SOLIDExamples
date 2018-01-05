package com.example.eugene.solid.ocp;

/**
 * Created by eugene on 03.01.18.
 */

// Open Closed Principle:
// Each class should be open for extension, but closed for modification.
public class OpenClosedPrincipleTester {
    public static void main(String[] args) {
        ShapeDataPrinter printer = new ShapeDataPrinter();
        printer.printSquare(new Circle(2));
        printer.printSquare(new Rectangle(4,4));
    }
}

interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}

class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

}

class ShapeDataPrinter {
    void printSquare(final Shape shape) {
        System.out.println(shape.getArea());
    }
}
