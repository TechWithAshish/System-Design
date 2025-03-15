package com.example.SystemDesign.ParkingLot.ParkingSpot;

import java.util.LinkedList;
import java.util.List;

public class ParkingListManager {
    public static List<ParkingSpot> twoWheelerParkingSpotList = new LinkedList<>();
    public static List<ParkingSpot> fourWheelerParkingSpotList = new LinkedList<>();
    static {
        for(int i = 0; i < 10; i++){
            twoWheelerParkingSpotList.add(new ParkingSpot(i, true, 10));
            fourWheelerParkingSpotList.add(new ParkingSpot(i, true, 30));
        }
    }
}
