package com.example.SystemDesign.CarRentalSystem.Vehicle;

public class Vehicle {
    public int vehicleNo;
    public double price;
    public boolean isActive;
    public VehicleType vehicleType;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNo=" + vehicleNo +
                ", price=" + price +
                ", isActive=" + isActive +
                ", vehicleType=" + vehicleType +
                '}';
    }

    public Vehicle(int vehicleNo, double price, boolean isActive, VehicleType vehicleType) {
        this.vehicleNo = vehicleNo;
        this.price = price;
        this.isActive = isActive;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
