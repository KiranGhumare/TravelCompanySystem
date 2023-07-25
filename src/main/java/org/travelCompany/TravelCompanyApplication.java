package org.travelCompany;

import org.travelCompany.Activity.Activity;
import org.travelCompany.Destination.Destination;
import org.travelCompany.Passenger.GoldPassenger;
import org.travelCompany.Passenger.Passenger;
import org.travelCompany.Passenger.PremiumPassenger;
import org.travelCompany.Passenger.StandardPassenger;
import org.travelCompany.TravelPackage.TravelPackage;

public class TravelCompanyApplication {
    public static void main(String[] args) {
        TravelPackage tp1 = new TravelPackage("tp1", 3);
        TravelPackage tp2 = new TravelPackage("tp2", 2);
        tp1.printTravelPackageDetails();
        tp2.printTravelPackageDetails();

        StandardPassenger sp1 = new StandardPassenger("sp1", 1);
        GoldPassenger gp1 = new GoldPassenger("gp1", 2);
        PremiumPassenger pp1 = new PremiumPassenger("pp1", 3);

        sp1.printPassengerDetails();
        gp1.printPassengerDetails();
        pp1.printPassengerDetails();

        Destination d1 = new Destination("d1");
        Destination d2 = new Destination("d2");
        Destination d3 = new Destination("d3");
        Destination d4 = new Destination("d4");

        tp1.addDestinationToTravelPackage(d1);
        tp1.addDestinationToTravelPackage(d2);
        tp1.printTravelPackageDetails();

        Activity a1 = new Activity("a1","Hiking", 2000, 2, d1);
        Activity a2 = new Activity("a2","Rock Climbing", 1500, 1, d2);
        Activity a3 = new Activity("a3","Sky diving", 3000, 1, d2);

        d1.addActivityToDestination(a1);
        d2.addActivityToDestination(a2);
        d2.addActivityToDestination(a3);

        tp1.printTravelPackageDetails();

        gp1.signUpForActivity(a1, tp1);

        tp1.addPassengerToTravelPackage(gp1);

        gp1.signUpForActivity(a1, tp1);

        gp1.creditBalance(1000);

        gp1.signUpForActivity(a1, tp1);

        gp1.creditBalance(700);

        gp1.signUpForActivity(a1, tp1);
    }
}