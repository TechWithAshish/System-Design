package com.example.SystemDesign.ParkingLot;

import com.example.SystemDesign.ParkingLot.ParkingSpot.ParkingSpot;
import com.example.SystemDesign.ParkingLot.Vehicle.Vehicle;

public class Ticket {
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;
    public long entryTime;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot, long entryTime) {
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }
}
