package com.example.SystemDesign.ParkingLot.ParkingSpot;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }
    public boolean findSpace(){
        return parkingSpotList.isEmpty();
    }
    public ParkingSpot getParkingSpace(){
        ParkingSpot parkingSpot = parkingSpotList.remove(0);
        parkingSpot.setEmpty(false);
        return parkingSpot;
    }
    public void freeParking(ParkingSpot parkingSpot){
        parkingSpot.isEmpty = true;
        parkingSpotList.add(0, parkingSpot);
    }
}
