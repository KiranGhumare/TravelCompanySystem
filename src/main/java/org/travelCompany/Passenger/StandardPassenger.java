package org.travelCompany.Passenger;

import org.travelCompany.Activity.Activity;
import org.travelCompany.TravelPackage.TravelPackage;
import org.travelCompany.Validation.Validation;

public class StandardPassenger extends Passenger {
    public StandardPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    public void creditBalance (double balance) {
        this.balance += balance;
    }
    public boolean signUpForActivity (Activity activity, TravelPackage travelPackage) {
        if (Validation.travelPackageValidation(travelPackage, this, activity)) {
            if (Validation.activityValidation(activity.getCapacity(), activity.getCost(), this.balance)) {
                attachActivityToPassenger(activity);
                this.balance -= activity.getCost();
                activity.setCapacity(activity.getCapacity() - 1);
                System.out.println(this.name + " are enrolled for " + activity.getName());
                return true;
            }
        }
        return false;
    }
}
