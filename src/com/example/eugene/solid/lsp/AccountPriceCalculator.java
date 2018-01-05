package com.example.eugene.solid.lsp;

class AccountPriceCalculator {
    private PremiumAccount premiumAccount;

    public AccountPriceCalculator(final PremiumAccount premiumAccount) {
        this.premiumAccount = premiumAccount;
    }

    public void calculatePrice() {
        this.premiumAccount.setPrice(100);
        this.premiumAccount.setDiscount();
        // Method getTotalPrice() will return a different values of price in depending on the account.
        System.out.println(this.premiumAccount.getTotalPrice());
    }
}
