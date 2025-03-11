package com.example.SystemDesign.StrategyDesignPattern.Solution;

import com.example.SystemDesign.StrategyDesignPattern.Solution.Strategy.DriveStrategy;

public class VehicleSolution {
    public DriveStrategy strategy;
    public VehicleSolution(DriveStrategy strategy){
        this.strategy = strategy;
    }
    public void drive(){
        strategy.drive();
    }
}
