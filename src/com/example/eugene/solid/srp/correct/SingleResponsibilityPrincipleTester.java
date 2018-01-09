package com.example.eugene.solid.srp.correct;

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

// correct - each class has only one certain responsibility
// Counter for counting
class Counter {
    private int counter;

    public void count() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

// TotalCountPrinter for print results of counting
class TotalCountPrinter implements Printer {
    @Override
    public void print(final Counter counter) {
        System.out.println(counter.getCounter());
    }
}

interface Printer {
    void print(final Counter counter);
}