package org.travelCompany.Validation;

import org.travelCompany.Activity.Activity;
import org.travelCompany.Passenger.Passenger;
import org.travelCompany.TravelPackage.TravelPackage;

public class Validation {
    public static boolean travelPackageValidation (TravelPackage tp, Passenger p, Activity a) {
        if (!tp.getPassengers().contains(p)) {
            System.out.println("Please enroll in the " + tp.getName() + " first");
            return false;
        }
        if (!tp.getDestinations().contains(a.getDestination())) {
            System.out.println("This activity is not included in your package");
            return false;
        }
        return true;
    }
    public static boolean activityValidation (int capacity, double activityCost, double balance) {
        if (capacity <= 0) {
            System.out.println("No spots lefts for this Activity");
            return false;
        }
        if (balance < activityCost) {
            System.out.println("Insufficient balance");
            return false;
        }
        return true;
    }
}
