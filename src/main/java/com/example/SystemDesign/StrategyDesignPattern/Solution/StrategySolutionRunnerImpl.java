package com.example.SystemDesign.StrategyDesignPattern.Solution;

import com.example.SystemDesign.SolutionRunner;
import com.example.SystemDesign.StrategyDesignPattern.Solution.Strategy.DriveStrategy;
import com.example.SystemDesign.StrategyDesignPattern.Solution.Strategy.NormalStrategy;
import com.example.SystemDesign.StrategyDesignPattern.Solution.Strategy.SportyStrategy;

public class StrategySolutionRunnerImpl implements SolutionRunner {
    public void run(){
        DriveStrategy normalStrategy = new NormalStrategy();
        DriveStrategy sportyStrategy = new SportyStrategy();
        VehicleSolution passengerVehicle = new PassengerVehicleSolution(normalStrategy);
        VehicleSolution sportyVehicle = new SportyVehicleSolution(normalStrategy);
        VehicleSolution offRoadVehicle = new OffRoadVehicleSolution(normalStrategy);

        System.out.println("This is passenger vehicle drive:-");
        passengerVehicle.drive();
        System.out.println("This is sporty vehicle drive:-");
        sportyVehicle.drive();
        System.out.println("This is off-road vehicle drive:-");
        offRoadVehicle.drive();
    }
}
