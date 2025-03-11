package com.example.SystemDesign.StrategyDesignPattern.Issue;

public class SportyVehicle extends Vehicle{
    // let's make use of new drive mode for sporty vehicle. To drive fast...

    @Override
    public void drive() {
        System.out.println("This is sport drive mode for Sporty vehicle.....");
    }
}
