package org.travelCompany.TravelPackage;

import org.travelCompany.Activity.Activity;
import org.travelCompany.Destination.Destination;
import org.travelCompany.Passenger.Passenger;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;

    private List<Destination> destinations;
    private List<Passenger> passengers;

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public TravelPackage (String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestinationToTravelPackage (Destination d) {
        this.destinations.add(d);
    }

    public void addPassengerToTravelPackage (Passenger p) {
        this.passengers.add(p);
    }
    public void printTravelPackageDetails () {
        System.out.println("----------------------------------------------");
        System.out.println("TRAVEL PACKAGE DETAILS: ");
        System.out.println("Package name: " + this.name);
        System.out.println("Passenger Capacity: " + this.passengerCapacity);
        for (var destination:this.destinations) {
            destination.printDestinationDetails();
        }
    }

    public void printPassengerList () {
        System.out.println("----------------------------------------------");
        System.out.println("PASSENGER DETAILS: ");
        System.out.println("Travel Package: " + this.name);
        System.out.println("Passenger Capacity: " + this.passengerCapacity);
        System.out.println("Number of passengers enrolled: " + this.passengers.size());
        for (var passenger: this.passengers) {
            passenger.printPassengerDetails();
        }
    }

    public void printAvailableActivitiesForAllDestinations () {
        for (var destination: this.destinations) {
            destination.printAvailableActivities();
        }
    }
}
