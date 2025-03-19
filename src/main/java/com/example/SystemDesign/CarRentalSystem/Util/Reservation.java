package com.example.SystemDesign.CarRentalSystem.Util;

import com.example.SystemDesign.CarRentalSystem.User.User;
import com.example.SystemDesign.CarRentalSystem.Vehicle.Vehicle;

import java.time.LocalDate;

public class Reservation {
    public int reservationId;
    public Vehicle vehicle;
    public ReservationStatus reservationStatus;
    public User user;
    public LocalDate bookingDate;
    public LocalDate fromDate;
    public LocalDate tillDate;

    public Reservation(int reservationId, Vehicle vehicle, ReservationStatus reservationStatus, User user, LocalDate bookingDate, LocalDate fromDate, LocalDate tillDate) {
        this.reservationId = reservationId;
        this.vehicle = vehicle;
        this.reservationStatus = reservationStatus;
        this.user = user;
        this.bookingDate = bookingDate;
        this.fromDate = fromDate;
        this.tillDate = tillDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", vehicle=" + vehicle +
                ", reservationStatus=" + reservationStatus +
                ", user=" + user +
                ", bookingDate=" + bookingDate +
                ", fromDate=" + fromDate +
                ", tillDate=" + tillDate +
                '}';
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getTillDate() {
        return tillDate;
    }

    public void setTillDate(LocalDate tillDate) {
        this.tillDate = tillDate;
    }
}
