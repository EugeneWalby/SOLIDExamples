package com.example.eugene.solid.srp;

// Single Responsibility Principle (SRP):
// Each class should have only one reason to change
// so each class should execute just certain functionality.
public class SingleResponsibilityPrincipleTester {
    public static void main(String[] args) {
        final Counter counter = new Counter();
        counter.count();
        final Printer printer = new TotalCountPrinter();
        printer.print(counter);
    }
}

