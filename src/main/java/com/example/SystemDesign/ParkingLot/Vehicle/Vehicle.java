package com.example.SystemDesign.ParkingLot.Vehicle;

public class Vehicle {
    public VehicleType vehicleType;
    public int vehicleNumber;

    public Vehicle(VehicleType vehicleType, int vehicleNumber) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }
}
