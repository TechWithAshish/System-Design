package com.example.SystemDesign.CarRentalSystem.User;

public class User {
    public String name;
    public String mobileNumber;
    public String drivingLicense;

    public User(String name, String mobileNumber, String drivingLicense) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.drivingLicense = drivingLicense;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
