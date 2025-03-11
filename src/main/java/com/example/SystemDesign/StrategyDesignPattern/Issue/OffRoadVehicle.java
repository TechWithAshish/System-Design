package com.example.SystemDesign.StrategyDesignPattern.Issue;

public class OffRoadVehicle extends Vehicle{

    // let's use same drive mode as sport for off-road vehicle also.

    // are you able to see issue
    // code got duplicate again we need to again write same code here....
    // so this issue will be resolve by strategy design pattern...


    @Override
    public void drive() {
        System.out.println("This is sport drive mode for Off-Road vehicle.....");
    }
}
