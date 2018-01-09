package com.example.eugene.solid.lsp.correct;

// Liskov Substitution Principle (LSP):
// Derived classes must be substitutable for their base classes
// without changing of main program functionality.
public class LiskovSubstitutionPrincipleTester {
    public static void main(String[] args) {
        final PremiumAccount premiumAccount = new PremiumAccount();
        AccountPriceCalculator calculator = new AccountPriceCalculator(premiumAccount);
        // Method calculatePrice() will calculate a different values of price in depending on the account.
        calculator.calculatePrice();
        System.out.println(premiumAccount.getTotalPrice());

        final NewYearPremiumAccount newYearPremiumAccount = new NewYearPremiumAccount();
        calculator = new AccountPriceCalculator(newYearPremiumAccount);
        calculator.calculatePrice();
        System.out.println(newYearPremiumAccount.getTotalPrice());
    }
}

class AccountPriceCalculator {
    private PremiumAccount premiumAccount;

    public AccountPriceCalculator(final PremiumAccount premiumAccount) {
        this.premiumAccount = premiumAccount;
    }

    public void calculatePrice() {
        this.premiumAccount.setPrice(100);
        this.premiumAccount.setDiscount();
    }
}

class PremiumAccount {
    protected double price;
    protected int discount;

    public void setPrice(final double price) {
        this.price = price;
    }

    public void setDiscount() {
        this.discount = 0;
    }

    public double getTotalPrice() {
        return price - price * (discount / 100.0);
    }
}

class NewYearPremiumAccount extends PremiumAccount {
    // set New Year's discount to 25%
    @Override
    public void setDiscount() {
        this.discount = 25;
    }
}