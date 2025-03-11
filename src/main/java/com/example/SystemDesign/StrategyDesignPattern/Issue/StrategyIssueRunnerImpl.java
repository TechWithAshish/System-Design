package com.example.SystemDesign.StrategyDesignPattern.Issue;

import com.example.SystemDesign.IssueRunner;

public class StrategyIssueRunnerImpl implements IssueRunner {
    public void run(){
        Vehicle passengerVehicle = new PassengerVehicle();
        Vehicle sportyVehicle = new SportyVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();

        passengerVehicle.drive();
        sportyVehicle.drive();
        offRoadVehicle.drive();
    }
}
