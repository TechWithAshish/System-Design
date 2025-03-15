package com.example.SystemDesign.ParkingLot;

import com.example.SystemDesign.ParkingLot.CostStrategy.CostStrategy;
import com.example.SystemDesign.ParkingLot.CostStrategy.MinWiseCost;
import com.example.SystemDesign.ParkingLot.CostStrategy.SecWiseCost;
import com.example.SystemDesign.ParkingLot.Gate.EntranceGate;
import com.example.SystemDesign.ParkingLot.Gate.ExitGate;
import com.example.SystemDesign.ParkingLot.ParkingSpot.ParkingListManager;
import com.example.SystemDesign.ParkingLot.ParkingSpot.ParkingManagerFactory;
import com.example.SystemDesign.ParkingLot.ParkingSpot.ParkingSpotManager;
import com.example.SystemDesign.ParkingLot.Vehicle.Vehicle;
import com.example.SystemDesign.ParkingLot.Vehicle.VehicleType;
import com.example.SystemDesign.SolutionRunner;

public class ParkingLotSolutionRunner implements SolutionRunner {
    @Override
    public void run() {
        Vehicle fourWheeler = new Vehicle(VehicleType.FourWheeler, 123);
        Vehicle twoWheeler = new Vehicle(VehicleType.FourWheeler, 121);


        // vehicle arrived at entrance gate.....
        EntranceGate entranceGate = new EntranceGate(fourWheeler);
        if(entranceGate.checkSpace()){
            System.out.println("Sorry, Space is not present. Please look for other Parking");
            System.exit(0);
        }
        // for vehicle ticket is generated.....
        Ticket ticket = entranceGate.getTicket();

        System.out.println("Your parking spot is "+ticket.parkingSpot.spotId+" which have a cost of "+ticket.parkingSpot.getPrice());

        // let's create default cost strategy....
        // which is sec wise
        CostStrategy strategy = new SecWiseCost();

        // vehicle arrived at entrance gate.....
        EntranceGate entrance = new EntranceGate(twoWheeler);
        if(entrance.checkSpace()){
            System.out.println("Sorry, Space is not present. Please look for other Parking");
            System.exit(0);
        }
        // for vehicle ticket is generated.....
        Ticket ticket1 = entrance.getTicket();

        System.out.println("Your parking spot is "+ticket1.parkingSpot.spotId+" which have a cost of "+ticket1.parkingSpot.getPrice());

        // let's create default cost strategy....
        // which is sec wise
        CostStrategy strategy1 = new MinWiseCost();

        // let's exit parking now....
        ExitGate exitGate = new ExitGate(ticket, 1060, strategy);

        System.out.println("Your parking cost is "+exitGate.cost());

        exitGate.paymentDone();


        // let's exit parking now....
        ExitGate exit = new ExitGate(ticket1, 1250, strategy1);

        System.out.println("Your parking cost is "+exit.cost());

        exit.paymentDone();
    }
}
