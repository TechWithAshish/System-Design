package com.example.SystemDesign.ParkingLot.Gate;

import com.example.SystemDesign.ParkingLot.CostStrategy.CostStrategy;
import com.example.SystemDesign.ParkingLot.ParkingSpot.ParkingManagerFactory;
import com.example.SystemDesign.ParkingLot.ParkingSpot.ParkingSpot;
import com.example.SystemDesign.ParkingLot.ParkingSpot.ParkingSpotManager;
import com.example.SystemDesign.ParkingLot.Ticket;

public class ExitGate {
    public Ticket ticket;
    public ParkingSpotManager parkingSpotManager;
    public long currentTime;
    public CostStrategy strategy;
    public ExitGate(Ticket ticket, long currentTime, CostStrategy costStrategy){
        this.strategy = costStrategy;
        this.currentTime = currentTime;
        this.ticket = ticket;
        parkingSpotManager = ParkingManagerFactory.getParkingSpotManager(ticket.vehicle.vehicleType);
    }

    public int cost(){
        return strategy.cost(ticket.entryTime, ticket.parkingSpot.price, currentTime);
    }

    public boolean paymentDone(){
        ParkingSpot parkingSpot = ticket.parkingSpot;
        parkingSpotManager.freeParking(parkingSpot);
        return true;
    }
}
