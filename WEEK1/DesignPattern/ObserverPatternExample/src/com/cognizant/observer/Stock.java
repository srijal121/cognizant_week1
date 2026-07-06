package com.cognizant.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void setPrice(String stockName, double price) {

        System.out.println("\nStock Updated!");

        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}
