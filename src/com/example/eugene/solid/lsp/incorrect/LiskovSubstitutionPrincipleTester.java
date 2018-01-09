package com.example.eugene.solid.lsp.incorrect;

public class LiskovSubstitutionPrincipleTester {
    public static void main(String[] args) {
        final FreeAccount freeAccount = new FreeAccount(100, 25);
        // incorrect - realization is different for each of classes
        // so it breaks the main program functionality
        // because the results will be unpredictable
//        freeAccount.setPrice(100);
//        freeAccount.setDiscount(25);
        System.out.println(freeAccount.getTotalPrice());

        final PremiumAccount premiumAccount = new PremiumAccount(100, 25);
//        premiumAccount.setPrice(100);
//        premiumAccount.setDiscount(25);
        System.out.println(premiumAccount.getTotalPrice());

        final PremiumAccount newYearPremiumAccount = new NewYearPremiumAccount(100, 25);
//        newYearPremiumAccount.setPrice(100);
//        newYearPremiumAccount.setDiscount(25);
        System.out.println(newYearPremiumAccount.getTotalPrice());
    }
}

class FreeAccount {
    protected double price;
    protected int discount;

    // free account have no price or no discount
    public FreeAccount(final double price, final int discount) {
        this.price = 0;
        this.discount = 0;
    }

//    public void setPrice(final double price) {
//        this.price = 0;
//    }
//
//    public void setDiscount(final int discount) {
//        this.discount = 0;
//    }

    public double getTotalPrice() {
        return price - price * (discount / 100.0);
    }
}

class PremiumAccount extends FreeAccount {
    public PremiumAccount(final double price, final int discount) {
        super(price, discount);
        this.price = price;
    }

//    @Override
//    public void setPrice(final double price) {
//        this.price = price;
//    }

    // premium account is full priced
    // and have not a discount
//    @Override
//    public void setDiscount(final int discount) {
//        this.discount = 0;
//    }
}

class NewYearPremiumAccount extends PremiumAccount {
    public NewYearPremiumAccount(final double price, final int discount) {
        super(price, discount);
        this.price = price;
        this.discount = discount;
    }

    // this account have a discount on new year holiday
//    @Override
//    public void setDiscount(final int discount) {
//        this.discount = discount;
//    }
}