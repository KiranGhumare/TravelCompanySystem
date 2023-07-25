package org.travelCompany.Destination;

import org.travelCompany.Activity.Activity;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination (String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivityToDestination (Activity a) {
        this.activities.add(a);
    }
    public void printDestinationDetails () {
        System.out.println("Destination name: " + this.name);
        for (var activity:this.activities) {
            activity.printActivityDetails();
        }
    }

    public void printAvailableActivities () {
        System.out.println("Destination name: " + this.name);
        for (var activity:this.activities) {
            if (activity.getCapacity() > 0) {
                activity.printActivityDetails();
            }
        }
    }
}
