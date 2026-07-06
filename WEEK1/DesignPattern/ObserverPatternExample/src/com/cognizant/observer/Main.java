package com.cognizant.observer;

public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock();

        Observer user1 = new MobileClient("Srijal");
        Observer user2 = new MobileClient("Rahul");

        stock.registerObserver(user1);
        stock.registerObserver(user2);

        stock.setPrice("TCS", 3800);
    }
}