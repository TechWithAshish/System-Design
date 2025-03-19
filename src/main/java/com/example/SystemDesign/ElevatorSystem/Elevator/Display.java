package com.example.SystemDesign.ElevatorSystem.Elevator;

import com.example.SystemDesign.ElevatorSystem.Direction;

public class Display {
    public int floor;
    public Direction direction;

    public Display(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public Display(){

    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
