package com.cognizant.observer;

public class MobileClient implements Observer {

    private String name;

    public MobileClient(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " received update:");
        System.out.println(stockName + " price = ₹" + price);
    }
}