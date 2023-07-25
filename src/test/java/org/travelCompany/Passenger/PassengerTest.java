package org.travelCompany.Passenger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.travelCompany.Activity.Activity;
import org.travelCompany.Destination.Destination;
import org.travelCompany.TravelPackage.TravelPackage;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PassengerTest {
    TravelPackage tp1;
    StandardPassenger sp1;
    GoldPassenger gp1;
    PremiumPassenger pp1;
    Destination d1;
    Activity a1;
    @BeforeEach
    void setUp () {
        tp1 = new TravelPackage("tp1", 3);
        sp1 = new StandardPassenger("sp1", 1);
        gp1 = new GoldPassenger("gp1", 2);
        pp1 = new PremiumPassenger("pp1", 3);
        d1 = new Destination("d1");
        a1 = new Activity("a1","Hiking", 2000, 2, d1);
    }
    @Test
    void signUpActivityTestForGoldPassenger () {
        tp1.addDestinationToTravelPackage(d1);
        d1.addActivityToDestination(a1);
        assertFalse(gp1.signUpForActivity(a1, tp1));
        tp1.addPassengerToTravelPackage(gp1);
        assertFalse(gp1.signUpForActivity(a1, tp1));
        gp1.creditBalance(1000);
        assertFalse(gp1.signUpForActivity(a1, tp1));
        gp1.creditBalance(900);
        assertTrue(gp1.signUpForActivity(a1, tp1));
    }

    @Test
    void signUpActivityTestForStandardPassenger () {
        tp1.addDestinationToTravelPackage(d1);
        d1.addActivityToDestination(a1);
        assertFalse(sp1.signUpForActivity(a1, tp1));
        tp1.addPassengerToTravelPackage(sp1);
        assertFalse(sp1.signUpForActivity(a1, tp1));
        sp1.creditBalance(1000);
        assertFalse(sp1.signUpForActivity(a1, tp1));
        sp1.creditBalance(1100);
        assertTrue(sp1.signUpForActivity(a1, tp1));
    }

    @Test
    void signUpActivityTestForPremiumPassenger () {
        tp1.addDestinationToTravelPackage(d1);
        d1.addActivityToDestination(a1);
        assertFalse(pp1.signUpForActivity(a1, tp1));
        tp1.addPassengerToTravelPackage(pp1);
        assertTrue(pp1.signUpForActivity(a1, tp1));
    }
}
