package com.example.eugene.solid.ocp.incorrect;

public class OpenClosedPrincipleTester {
    public static void main(String[] args) {
        final ShapeDataPrinter printer = new ShapeDataPrinter();
        printer.printSquare(new Circle(2));
        printer.printSquare(new Rectangle(4,4));
    }
}

class ShapeDataPrinter {
    void printSquare(final Object shape) {
        try {
            // incorrect - classes have a similar methods but with different implementation.
            if (shape instanceof Circle) {
                System.out.println(((Circle) shape).getCircleArea());
            } else if (shape instanceof Rectangle) {
                System.out.println(((Rectangle) shape).getRectangleArea());
            }
        } catch (final ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// incorrect - if we need to change implementation we must modify class methods.
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getRectangleArea() {
        return height * width;
    }
}