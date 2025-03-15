package com.example.SystemDesign.ParkingLot.Gate;

import com.example.SystemDesign.ParkingLot.ParkingSpot.ParkingManagerFactory;
import com.example.SystemDesign.ParkingLot.ParkingSpot.ParkingSpotManager;
import com.example.SystemDesign.ParkingLot.Ticket;
import com.example.SystemDesign.ParkingLot.Vehicle.Vehicle;


public class EntranceGate {
    public Vehicle vehicle;
    public ParkingSpotManager parkingSpotManager;
    public EntranceGate(Vehicle vehicle){
        this.vehicle = vehicle;
        parkingSpotManager = ParkingManagerFactory.getParkingSpotManager(vehicle.vehicleType);
    }

    public boolean checkSpace(){
        return parkingSpotManager.findSpace();
    }
    public Ticket getTicket(){
        if(!checkSpace()){
            return new Ticket(vehicle, parkingSpotManager.getParkingSpace(), 1000);
        }
        return null;
    }
}
