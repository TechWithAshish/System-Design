package com.example.SystemDesign.StrategyDesignPattern.Solution;


import com.example.SystemDesign.StrategyDesignPattern.Solution.Strategy.DriveStrategy;

public class PassengerVehicleSolution extends VehicleSolution {
    public PassengerVehicleSolution(DriveStrategy strategy) {
        super(strategy);
    }
    // let's make use of same drive mode as parent....
}
