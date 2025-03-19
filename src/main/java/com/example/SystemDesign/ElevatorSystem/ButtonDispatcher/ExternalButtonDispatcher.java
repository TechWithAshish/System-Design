package com.example.SystemDesign.ElevatorSystem.ButtonDispatcher;

import com.example.SystemDesign.ElevatorSystem.Direction;
import com.example.SystemDesign.ElevatorSystem.Elevator.ElevatorController;
import com.example.SystemDesign.ElevatorSystem.ElevatorStrategy.Strategy;


public class ExternalButtonDispatcher {
    public Strategy elevatorStrategy;

    public ExternalButtonDispatcher(Strategy elevatorStrategy) {
        this.elevatorStrategy = elevatorStrategy;
    }

    public void submitRequest(int floor, Direction direction){
        ElevatorController elevator = elevatorStrategy.findElevator(floor, direction);
        elevator.acceptNewRequest(floor);
    }

}
