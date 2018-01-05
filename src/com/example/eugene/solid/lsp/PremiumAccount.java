package com.example.eugene.solid.lsp;

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
