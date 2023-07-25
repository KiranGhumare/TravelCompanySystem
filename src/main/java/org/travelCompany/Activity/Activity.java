package org.travelCompany.Activity;

import org.travelCompany.Destination.Destination;
import org.travelCompany.Passenger.Passenger;

public class Activity {
    private String name;
    private String description;
    private double cost;

    private int capacity;

    private Destination destination;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public Activity (String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }

    public void printActivityDetails () {
        System.out.println("Activity name: " + this.name);
        System.out.println("Activity description: " + this.description);
        System.out.println("Activity cost: " + this.cost);
        System.out.println("No of spots left: " + this.capacity);
    }

}
