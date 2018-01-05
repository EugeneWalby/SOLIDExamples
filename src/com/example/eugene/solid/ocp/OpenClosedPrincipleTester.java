package com.example.eugene.solid.ocp;

/**
 * Created by eugene on 03.01.18.
 */

// Open Closed Principle (OCP):
// Each class should be open for extension, but closed for modification.
public class OpenClosedPrincipleTester {
    public static void main(String[] args) {
        ShapeDataPrinter printer = new ShapeDataPrinter();
        printer.printSquare(new Circle(2));
        printer.printSquare(new Rectangle(4,4));
    }
}

