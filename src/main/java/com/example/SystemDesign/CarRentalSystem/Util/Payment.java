package com.example.SystemDesign.CarRentalSystem.Util;

public class Payment {
    public int paymentId;
    public Bill bill;

    public Payment(int paymentId, Bill bill) {
        this.paymentId = paymentId;
        this.bill = bill;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public double makePayment(){
        bill.getReservation().setReservationStatus(ReservationStatus.PROGRESS);
        bill.getReservation().getVehicle().setActive(false);
        return bill.calculatePrice();
    }
}
