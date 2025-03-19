package com.example.SystemDesign.ElevatorSystem.Elevator;



import java.util.PriorityQueue;

public class ElevatorController {
    public ElevatorCar elevatorCar;
    public PriorityQueue<Integer> forUpDirection;
    public PriorityQueue<Integer> forDownDirection;


    public ElevatorController(ElevatorCar elevatorCar, PriorityQueue<Integer> forUpDirection, PriorityQueue<Integer> forDownDirection) {
        this.elevatorCar = elevatorCar;
        this.forUpDirection = forUpDirection;
        this.forDownDirection = forDownDirection;
    }
    public ElevatorController(){

    }

    public void acceptNewRequest(int floor){
        // let's get current elevator floor...
        int currentFloor = elevatorCar.getFloor();
        if(floor > currentFloor){
            forUpDirection.add(floor);
        }else{
            forDownDirection.add(floor);
        }
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void setElevatorCar(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public PriorityQueue<Integer> getForUpDirection() {
        return forUpDirection;
    }

    public void setForUpDirection(PriorityQueue<Integer> forUpDirection) {
        this.forUpDirection = forUpDirection;
    }

    public PriorityQueue<Integer> getForDownDirection() {
        return forDownDirection;
    }

    public void setForDownDirection(PriorityQueue<Integer> forDownDirection) {
        this.forDownDirection = forDownDirection;
    }
}
