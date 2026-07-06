package com.cognizant.adapter;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaytmAdapter();
        paymentProcessor.processPayment(2500);
    }
}