package com.example.SystemDesign.ObserverDesignPattern.Observable;

import com.example.SystemDesign.ObserverDesignPattern.Observer.CustomerObserver;

import java.util.HashSet;

public class IphoneProduct implements AmazonProduct{
    private final HashSet<CustomerObserver> customerObserverSet;
    private int quantity;
    public IphoneProduct(){
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
        this.quantity = val;
        // this is change in status of product.....
        // let update customer which subscribe for this product....
        notifyCustomer();
    }
}
