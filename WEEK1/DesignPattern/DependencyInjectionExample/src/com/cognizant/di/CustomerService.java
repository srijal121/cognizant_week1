package com.cognizant.di;

public class CustomerService {

    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void addCustomer() {
        repository.saveCustomer();
    }
}