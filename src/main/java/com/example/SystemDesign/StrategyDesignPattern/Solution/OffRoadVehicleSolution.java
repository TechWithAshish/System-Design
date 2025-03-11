package com.example.SystemDesign.StrategyDesignPattern.Solution;

import com.example.SystemDesign.StrategyDesignPattern.Solution.Strategy.DriveStrategy;

public class OffRoadVehicleSolution extends VehicleSolution {


    public OffRoadVehicleSolution(DriveStrategy strategy) {
        super(strategy);
    }
}
