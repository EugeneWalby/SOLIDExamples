package com.example.eugene.solid.srp;

/**
 * Created by eugene on 03.01.18.
 */

// Single Responsibility Principle (SRP):
// Each class should have only one reason to change
// so each class should execute just certain functionality.
public class SingleResponsibilityPrincipleTester {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.count();
        Printer printer = new TotalCountPrinter();
        printer.print(counter);
    }
}

