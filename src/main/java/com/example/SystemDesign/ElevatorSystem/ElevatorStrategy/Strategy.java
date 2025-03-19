package com.example.SystemDesign.ElevatorSystem.ElevatorStrategy;

import com.example.SystemDesign.ElevatorSystem.Direction;
import com.example.SystemDesign.ElevatorSystem.Elevator.ElevatorController;

import java.util.List;
import java.util.Optional;

public class Strategy {
    public List<ElevatorController> elevatorControllerList;

    public Strategy(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }


    public ElevatorController findElevator(int floor, Direction direction){
        List<ElevatorController> list = elevatorControllerList
                .stream()
                .filter(elevatorController -> elevatorController.getElevatorCar().getDirection() == direction)
                .toList();
        if(direction == Direction.UP){
            Optional<ElevatorController> first = list
                    .stream()
                    .filter(elevatorController -> elevatorController.getElevatorCar().getFloor() < floor)
                    .findFirst();
            if(first.isEmpty()){
                Optional<ElevatorController> any = list.stream().findAny();
                return any.orElseThrow();
            }
            return first.orElseThrow();
        }else{
            Optional<ElevatorController> first = list
                    .stream()
                    .filter(elevatorController -> elevatorController.getElevatorCar().getFloor() > floor)
                    .findFirst();
            if(first.isEmpty()){
                Optional<ElevatorController> any = list.stream().findAny();
                return any.orElseThrow();
            }
            return first.orElseThrow();
        }
    }
}
