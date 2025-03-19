package com.example.SystemDesign.ElevatorSystem.ButtonDispatcher;

import com.example.SystemDesign.ElevatorSystem.Elevator.ElevatorController;

public class InternalButtonDispatcher {
    public ElevatorController elevatorController;

    public InternalButtonDispatcher(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    public void pressButton(int floor){
        elevatorController.acceptNewRequest(floor);
    }
}
