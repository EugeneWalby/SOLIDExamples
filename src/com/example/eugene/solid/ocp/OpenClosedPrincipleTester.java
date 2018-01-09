package com.example.eugene.solid.ocp;

// Open Closed Principle (OCP):
// Each class should be open for extension,
// but closed for modification.
public class OpenClosedPrincipleTester {
    public static void main(String[] args) {
        final ShapeDataPrinter printer = new ShapeDataPrinter();
        printer.printSquare(new Circle(2));
        printer.printSquare(new Rectangle(4,4));
    }
}

