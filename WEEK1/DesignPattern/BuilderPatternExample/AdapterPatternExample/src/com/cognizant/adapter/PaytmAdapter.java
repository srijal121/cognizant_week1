package com.cognizant.adapter;

public class PaytmAdapter implements PaymentProcessor {

    private PaytmGateway paytmGateway;

    public PaytmAdapter() {
        paytmGateway = new PaytmGateway();
    }

    @Override
    public void processPayment(double amount) {
        paytmGateway.makePayment(amount);
    }
}