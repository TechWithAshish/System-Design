package com.example.SystemDesign.ParkingLot.CostStrategy;

public class MinWiseCost extends CostStrategy{
    @Override
    public int cost(long entryTime, int cost, long exitTime) {
        return (int) (((exitTime - entryTime) / 60) * cost);
    }
}
