package com.example.SystemDesign.ParkingLot.CostStrategy;

public class CostStrategy {
    public int cost(long entryTime, int cost, long exitTime){
        return (int) ((exitTime - entryTime) * cost);
    }
}
