package com.example.eugene.solid.lsp;

// Liskov Substitution Principle (LSP):
// Derived classes must be substitutable for their base classes
// without changing of main program functionality.
public class LiskovSubstitutionPrincipleTester {
    public static void main(String[] args) {
        final PremiumAccount premiumAccount = new PremiumAccount();
        AccountPriceCalculator calculator = new AccountPriceCalculator(premiumAccount);
        calculator.calculatePrice();

        final NewYearPremiumAccount newYearPremiumAccount = new NewYearPremiumAccount();
        calculator = new AccountPriceCalculator(newYearPremiumAccount);
        calculator.calculatePrice();
    }
}

