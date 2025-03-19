package com.example.SystemDesign.CarRentalSystem.Vehicle;

import java.util.*;

public class VehicleInventory {
    public LinkedList<Vehicle> vehicleList;

    public VehicleInventory(LinkedList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public LinkedList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(LinkedList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicle(){
        return vehicleList.stream().filter(Vehicle::isActive).toList();
    }

    public Vehicle remove(int id){
        return vehicleList.remove(id);
    }
}
