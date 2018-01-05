package com.example.eugene.solid.lsp;

/**
 * Created by eugene on 05.01.18.
 */

// Liskov Substitution Principle (LSP):
// Derived classes must be substitutable for their base classes
// without changing of main program functionality.
public class LiskovSubstitutionPrincipleTester {
    public static void main(String[] args) {
        PremiumAccount premiumAccount = new PremiumAccount();
        AccountPriceCalculator calculator = new AccountPriceCalculator(premiumAccount);
        calculator.calculatePrice();

        NewYearPremiumAccount newYearPremiumAccount = new NewYearPremiumAccount();
        calculator = new AccountPriceCalculator(newYearPremiumAccount);
        calculator.calculatePrice();
    }
}

