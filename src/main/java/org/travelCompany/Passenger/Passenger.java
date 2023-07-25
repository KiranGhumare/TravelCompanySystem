package org.travelCompany.Passenger;

import org.travelCompany.Activity.Activity;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    protected String name;

    protected double balance;
    protected int passengerNumber;

    protected List<Activity> activities;

    public Passenger (String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.activities = new ArrayList<>();
    }

    public void attachActivityToPassenger (Activity a) {
        this.activities.add(a);
    }
    public void printPassengerDetails () {
        System.out.println("----------------------------------------------");
        System.out.println("PASSENGER ACTIVITY DETAILS: ");
        System.out.println("Passenger name is : " + this.name);
        System.out.println("Passenger Number: " + this.passengerNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Activities enrolled in: ");
        for (var activity: this.activities) {
            activity.printActivityDetails();
        }
    }

}

