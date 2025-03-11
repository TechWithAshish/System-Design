package com.example.SystemDesign.ObserverDesignPattern;

import com.example.SystemDesign.ObserverDesignPattern.Observable.AmazonProduct;
import com.example.SystemDesign.ObserverDesignPattern.Observable.IphoneProduct;
import com.example.SystemDesign.ObserverDesignPattern.Observable.MacbookProduct;
import com.example.SystemDesign.ObserverDesignPattern.Observer.CustomerObserver;
import com.example.SystemDesign.ObserverDesignPattern.Observer.NormalCustomerObserver;
import com.example.SystemDesign.ObserverDesignPattern.Observer.PrimeCustomerObserver;
import com.example.SystemDesign.SolutionRunner;

public class ObserverSolutionRunner implements SolutionRunner {
    @Override
    public void run() {
        CustomerObserver normalObserver1 = new NormalCustomerObserver("Ashish@gmail.com");
        CustomerObserver primeObserver1 = new PrimeCustomerObserver("AshishPrime@gmail.com");
        CustomerObserver normalObserver2 = new NormalCustomerObserver("Ashish1@gmail.com");
        CustomerObserver primeObserver2 = new PrimeCustomerObserver("AshishPrime1@gmail.com");

        AmazonProduct iphoneObservable = new IphoneProduct();
        AmazonProduct macbookObservable = new MacbookProduct();

        iphoneObservable.add(normalObserver1);
        iphoneObservable.add(primeObserver1);
        macbookObservable.add(normalObserver2);
        macbookObservable.add(primeObserver2);
        macbookObservable.add(primeObserver1);

        iphoneObservable.setQuantity(100); // updating quantity for these product...
        macbookObservable.setQuantity(200); // same updating quantity....

    }
}
