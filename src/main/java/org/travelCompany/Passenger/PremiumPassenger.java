package org.travelCompany.Passenger;

import org.travelCompany.Activity.Activity;
import org.travelCompany.TravelPackage.TravelPackage;
import org.travelCompany.Validation.Validation;

public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    public boolean signUpForActivity (Activity activity, TravelPackage travelPackage) {
        if (Validation.travelPackageValidation(travelPackage, this, activity)) {
            if (activity.getCapacity() > 0) {
                attachActivityToPassenger(activity);
                this.balance -= activity.getCost();
                activity.setCapacity(activity.getCapacity() - 1);
                System.out.println(this.name + " are enrolled for " + activity.getName());
                return true;
            }
            else {
                System.out.println("No spots left in " + activity.getName());
            }
        }
        return false;
    }

    @Override
    public void printPassengerDetails() {
        System.out.println("Passenger name is : " + this.name);
        System.out.println("Passenger Number: " + this.passengerNumber);
        System.out.println("Activities enrolled in: ");
        for (var activity: this.activities) {
            activity.printActivityDetails();
        }
    }

    //directly signup an activity
}
