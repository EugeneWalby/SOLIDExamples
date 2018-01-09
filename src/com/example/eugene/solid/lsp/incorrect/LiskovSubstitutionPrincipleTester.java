package com.example.eugene.solid.lsp.incorrect;

public class LiskovSubstitutionPrincipleTester {
    public static void main(String[] args) {
        // incorrect - realization is different for each of classes
        // so it breaks the main program functionality
        // because if we want to change the price of any account
        // the results will be unpredictable
        final FreeAccount freeAccount = new FreeAccount(100, 25);
        System.out.println(freeAccount.getTotalPrice());

        final PremiumAccount premiumAccount = new PremiumAccount(100, 25);
        System.out.println(premiumAccount.getTotalPrice());

        final PremiumAccount newYearPremiumAccount = new NewYearPremiumAccount(100, 25);
        System.out.println(newYearPremiumAccount.getTotalPrice());
    }
}

class FreeAccount {
    protected double price;
    protected int discount;

    // incorrect - free account has no price or discount
    // but has a constructor for derived classes with these fields
    public FreeAccount(final double price, final int discount) {
        this.price = 0;
        this.discount = 0;
    }

    public double getTotalPrice() {
        return price - price * (discount / 100.0);
    }
}

class PremiumAccount extends FreeAccount {
    // incorrect - premium account has no discount
    // but has a field in the constructor
    // for derived classes or if we want to add it for account
    public PremiumAccount(final double price, final int discount) {
        super(price, discount);
        this.price = price;
    }
}

class NewYearPremiumAccount extends PremiumAccount {
    public NewYearPremiumAccount(final double price, final int discount) {
        super(price, discount);
        this.price = price;
        this.discount = discount;
    }
}