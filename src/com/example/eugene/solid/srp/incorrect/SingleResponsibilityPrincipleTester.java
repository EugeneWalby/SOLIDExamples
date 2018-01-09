package com.example.eugene.solid.srp.incorrect;

public class SingleResponsibilityPrincipleTester {
    public static void main(String[] args) {
        final Counter counter = new Counter();
        counter.count();
        counter.print();
    }
}

// incorrect - one class has a different responsibilities: counting and printing results
class Counter {
    private int counter;

    public void count() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void print() {
        System.out.println(getCounter());
    }
}
