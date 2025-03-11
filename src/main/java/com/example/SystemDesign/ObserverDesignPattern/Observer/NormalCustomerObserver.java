package com.example.SystemDesign.ObserverDesignPattern.Observer;

public class NormalCustomerObserver implements CustomerObserver{
    private String email;
    public NormalCustomerObserver(String email){
        this.email = email;
    }
    @Override
    public void update(int data) {
        System.out.println("Dear Customer there is update in product quantity!!! "+data+" Details are shared on you Email "+email);
    }
}
