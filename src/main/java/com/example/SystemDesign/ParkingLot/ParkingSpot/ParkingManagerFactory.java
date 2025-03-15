package com.example.SystemDesign.ParkingLot.ParkingSpot;

import com.example.SystemDesign.ParkingLot.Vehicle.VehicleType;



public class ParkingManagerFactory {

    public static ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){
        if(vehicleType == VehicleType.TwoWheeler){
            return new TwoWheelerManager(ParkingListManager.twoWheelerParkingSpotList);
        }else if(vehicleType == VehicleType.FourWheeler){
            return new FourWheelerManager(ParkingListManager.fourWheelerParkingSpotList);
        }
        return null;
//        switch (vehicleType){
//            case TwoWheeler -> new TwoWheelerManager(ParkingListManager.twoWheelerParkingSpotList);
//            case FourWheeler -> new FourWheelerManager(ParkingListManager.fourWheelerParkingSpotList);
//        }
//        return null;
    }
}
