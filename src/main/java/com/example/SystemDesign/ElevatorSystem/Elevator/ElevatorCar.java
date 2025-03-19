package com.example.SystemDesign.ElevatorSystem.Elevator;

import com.example.SystemDesign.ElevatorSystem.Button.InternalButton;
import com.example.SystemDesign.ElevatorSystem.Direction;

public class ElevatorCar {
    public Display display;
    public int floor;
    public Direction direction;
    public InternalButton internalButton;

    public ElevatorCar(Display display, int floor, Direction direction, InternalButton internalButton) {
        this.display = display;
        this.floor = floor;
        this.direction = direction;
        this.internalButton = internalButton;
    }
    public ElevatorCar(){

    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
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

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }
}
