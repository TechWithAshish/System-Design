package com.example.SystemDesign.ObserverDesignPattern.Observable;

import com.example.SystemDesign.ObserverDesignPattern.Observer.CustomerObserver;

public interface AmazonProduct {
    public void add(CustomerObserver customerObserver);
    public void remove(CustomerObserver customerObserver);
    public void notifyCustomer();
    public void setQuantity(int val);
}
