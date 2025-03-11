package com.example.SystemDesign.StrategyDesignPattern.Solution;


import com.example.SystemDesign.StrategyDesignPattern.Solution.Strategy.DriveStrategy;

public class SportyVehicleSolution extends VehicleSolution {
    public SportyVehicleSolution(DriveStrategy strategy) {
        super(strategy);
    }
}
