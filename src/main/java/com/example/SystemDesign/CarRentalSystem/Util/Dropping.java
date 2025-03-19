package com.example.SystemDesign.CarRentalSystem.Util;

import com.example.SystemDesign.CarRentalSystem.Store.Store;
import com.example.SystemDesign.CarRentalSystem.Vehicle.Vehicle;


public class Dropping {
    public Store store;
    public Vehicle vehicle;

    public Dropping(Store store, Vehicle vehicle) {
        this.store = store;
        this.vehicle = vehicle;
    }

    public void droppingVehicle(){
        Reservation reservation = store.getReservationList().stream().filter(reservation1 -> reservation1.getVehicle().getVehicleNo() == vehicle.getVehicleNo()).findFirst().orElseThrow();
        reservation.setReservationStatus(ReservationStatus.COMPLETE);
        vehicle.setActive(true);
    }
}
