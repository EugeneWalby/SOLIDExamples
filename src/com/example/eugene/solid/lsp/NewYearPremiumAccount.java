package com.example.eugene.solid.lsp;

class NewYearPremiumAccount extends PremiumAccount {
    // set New Year's discount to 25%
    @Override
    public void setDiscount() {
        this.discount = 25;
    }
}
