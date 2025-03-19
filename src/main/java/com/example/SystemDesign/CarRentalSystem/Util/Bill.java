package com.example.SystemDesign.CarRentalSystem.Util;

import java.time.LocalDate;

public class Bill {
    public int billNo;
    public Reservation reservation;

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Bill(int billNo, Reservation reservation) {
        this.billNo = billNo;
        this.reservation = reservation;
    }
    public double calculatePrice(){
        int days =  reservation.getTillDate().getDayOfMonth() - reservation.getFromDate().getDayOfMonth();
        return reservation.getVehicle().getPrice() * days;
    }
}
