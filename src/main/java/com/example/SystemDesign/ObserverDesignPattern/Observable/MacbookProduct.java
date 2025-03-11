package com.example.SystemDesign.ObserverDesignPattern.Observable;

import com.example.SystemDesign.ObserverDesignPattern.Observer.CustomerObserver;

import java.util.HashSet;

public class MacbookProduct implements AmazonProduct{

    private final HashSet<CustomerObserver> customerObserverSet;
    private int quantity;
    public MacbookProduct(){
        this.customerObserverSet = new HashSet<>();
        this.quantity = 0;
    }
    @Override
    public void add(CustomerObserver customerObserver) {
        customerObserverSet.add(customerObserver);
    }

    @Override
    public void remove(CustomerObserver customerObserver) {
        customerObserverSet.remove(customerObserver);
    }

    @Override
    public void notifyCustomer() {
        for(CustomerObserver observer : customerObserverSet){
            observer.update(quantity);
        }
    }

    @Override
    public void setQuantity(int val) {
        quantity = val;
        notifyCustomer();
    }
}
