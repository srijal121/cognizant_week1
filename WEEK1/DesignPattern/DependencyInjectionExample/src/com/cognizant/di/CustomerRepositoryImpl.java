package com.cognizant.di;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public void saveCustomer() {
        System.out.println("Customer saved successfully.");
    }
}