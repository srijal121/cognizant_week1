package com.cognizant.strategy;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(1500);

        cart.setPaymentStrategy(new UPIPayment());
        cart.checkout(750);
    }
}