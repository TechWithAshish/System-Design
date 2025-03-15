package com.example.SystemDesign.ParkingLot.ParkingSpot;


import com.example.SystemDesign.ParkingLot.Vehicle.Vehicle;

public class ParkingSpot {
    public int spotId;
    public boolean isEmpty;
    public Vehicle vehicle;
    public int price;


    public ParkingSpot(int spotId, boolean isEmpty, int price) {
        this.spotId = spotId;
        this.isEmpty = isEmpty;
        this.price = price;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
