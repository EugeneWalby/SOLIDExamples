package com.example.eugene.solid.srp;

class TotalCountPrinter implements Printer {
    @Override
    public void print(final Counter counter) {
        System.out.println(counter.getCounter());
    }
}
