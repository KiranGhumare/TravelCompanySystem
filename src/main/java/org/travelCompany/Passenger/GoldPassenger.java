package org.travelCompany.Passenger;

import org.travelCompany.Activity.Activity;
import org.travelCompany.TravelPackage.TravelPackage;
import org.travelCompany.Validation.Validation;

public class GoldPassenger extends Passenger {
    public GoldPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    public void creditBalance (double balance) {
        this.balance += balance;
    }
    public boolean signUpForActivity (Activity activity, TravelPackage travelPackage) {
        if (Validation.travelPackageValidation(travelPackage, this, activity)) {
            double discountedPrice = (0.9 * activity.getCost());
            if (Validation.activityValidation(activity.getCapacity(), discountedPrice, this.balance)) {
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
