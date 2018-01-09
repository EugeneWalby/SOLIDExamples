package com.example.eugene.solid.lsp.correct;

// Liskov Substitution Principle (LSP):
// Derived classes must be substitutable for their base classes
// without changing of main program functionality.
public class LiskovSubstitutionPrincipleTester {
    public static void main(String[] args) {
        final Account freeAccount = new FreeAccount();
        // correct - method getTotalPrice() returns a result price
        // but in dependency on the account type
        System.out.println(freeAccount.getTotalPrice());

        final Account premiumAccount = new PremiumAccount(100);
        System.out.println(premiumAccount.getTotalPrice());

        final Account newYearPremiumAccount = new NewYearPremiumAccount(100, 25);
        System.out.println(newYearPremiumAccount.getTotalPrice());
    }
}

abstract class Account {
    public abstract double getTotalPrice();
}

class FreeAccount extends Account {
    // correct - free account has no a price
    @Override
    public double getTotalPrice() {
        return 0;
    }
}

class PremiumAccount extends Account {
    protected double price;

    public PremiumAccount(final double price) {
        this.price = price;
    }

    // correct - premium account has a certain price
    @Override
    public double getTotalPrice() {
        return price;
    }
}

class NewYearPremiumAccount extends PremiumAccount {
    protected int discount;

    public NewYearPremiumAccount(final double price, final int discount) {
        super(price);
        this.discount = discount;
    }

    // correct - New Year premium account has a price with a discount
    @Override
    public double getTotalPrice() {
        return price - price * (discount / 100.0);
    }
}