package com.example.SystemDesign.CarRentalSystem;

import com.example.SystemDesign.CarRentalSystem.Store.Store;
import com.example.SystemDesign.CarRentalSystem.User.User;
import com.example.SystemDesign.CarRentalSystem.Util.*;
import com.example.SystemDesign.CarRentalSystem.Vehicle.Car;
import com.example.SystemDesign.CarRentalSystem.Vehicle.Vehicle;
import com.example.SystemDesign.CarRentalSystem.Vehicle.VehicleInventory;
import com.example.SystemDesign.CarRentalSystem.Vehicle.VehicleType;
import com.example.SystemDesign.SolutionRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RentalSystemSolutionRunner implements SolutionRunner {
    @Override
    public void run() {
        User user1 = new User("Ashish", "912e8719","871298731892");
        User user2 = new User("Kumar", "912e8719","871298731892");
        List<User> userList = new ArrayList<>(Arrays.asList(user1, user2));

        Vehicle vehicle1 = new Car(9898, 97878, true, VehicleType.CAR);
        Vehicle vehicle2 = new Car(87726, 8783, true, VehicleType.CAR);
        Vehicle vehicle3 = new Car(66726, 7678, true, VehicleType.BIKE);
        LinkedList<Vehicle> vehicleList = new LinkedList<>(Arrays.asList(vehicle1, vehicle2, vehicle3));
        VehicleInventory vehicleInventory = new VehicleInventory(vehicleList);

        Vehicle vehicle4 = new Car(763276, 37673, true, VehicleType.CAR);
        Vehicle vehicle5 = new Car(62716, 87287, true, VehicleType.CAR);
        LinkedList<Vehicle> vehicleList1 = new LinkedList<>(Arrays.asList(vehicle4, vehicle5));
        VehicleInventory vehicleInventory1 = new VehicleInventory(vehicleList1);

        Location location1 = new Location("kjadhj", "Meerut", "UP", 250001);
        Location location2 = new Location("kjadhj", "Noida", "UP", 201304);

        Store store2 = new Store(vehicleInventory, location1);
        Store store1 = new Store(vehicleInventory1, location2);
        List<Store> storeList = Arrays.asList(store2, store1);


        RentalSystem rentalSystem = new RentalSystem(userList, storeList);
        Location location = new Location("jhadha", "Meerut", "UP", 250001);
        List<Store> list = rentalSystem.getStoreList().stream().filter(store -> store.getLocation().getPinCode() == location.getPinCode()).toList();

        Store store = list.get(0);

        Vehicle vehicle = store.getVehicleInventory().getVehicle().get(2);
        Reservation reservation = new Reservation(1, vehicle, ReservationStatus.PENDING, user1, LocalDate.now(), LocalDate.now().plusDays(2), LocalDate.now().plusDays(4));

        store.addReservation(reservation);
        System.out.println(reservation.toString());

        Bill bill = new Bill(1, reservation);

        Payment payment = new Payment(1, bill);
        double cost = payment.makePayment();
        System.out.println("your total price for selected date is "+cost);

        System.out.println(vehicle.toString());
        System.out.println(reservation.toString());

        Dropping dropping = new Dropping(store, vehicle);
        dropping.droppingVehicle();

        System.out.println(reservation.toString());


    }
}
