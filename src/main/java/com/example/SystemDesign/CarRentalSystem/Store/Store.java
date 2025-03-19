package com.example.SystemDesign.CarRentalSystem.Store;

import com.example.SystemDesign.CarRentalSystem.Location;
import com.example.SystemDesign.CarRentalSystem.Util.Reservation;
import com.example.SystemDesign.CarRentalSystem.Vehicle.VehicleInventory;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public VehicleInventory vehicleInventory;
    public Location location;
    public List<Reservation> reservationList;

    public Store(VehicleInventory vehicleInventory, Location location) {
        this.vehicleInventory = vehicleInventory;
        this.location = location;
        this.reservationList = new ArrayList<>();
    }

    public void addReservation(Reservation reservation){
        reservationList.add(reservation);
    }

    public VehicleInventory getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
