package com.example.SystemDesign.ElevatorSystem;

import com.example.SystemDesign.ElevatorSystem.Button.ExternalButton;

public class Floor {
    public int floorId;
    public ExternalButton externalButton;

    public Floor(int floorId, ExternalButton externalButton) {
        this.floorId = floorId;
        this.externalButton = externalButton;
    }

    public Floor(){
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public ExternalButton getExternalButton() {
        return externalButton;
    }

    public void setExternalButton(ExternalButton externalButton) {
        this.externalButton = externalButton;
    }
}
