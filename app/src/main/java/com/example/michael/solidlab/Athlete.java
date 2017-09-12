package com.example.michael.solidlab;

import java.util.ArrayList;

/**
 * Created by michael on 12/09/2017.
 */

public class Athlete {
    private String name;
    private ArrayList<Activity> activities;

    public Athlete(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void addRun(Run runToAdd) {
        activities.add(runToAdd);
    }

    public double calculateDistance() {
        double totalDistance = 0;
        for (Activity activity : activities) {
            totalDistance += activity.getDistance();
        }
        return totalDistance;
    }

    public double calculateAverageSpeed() {
        double totalDistanceInMetres = calculateDistance() * 1000;
        int totalTime = 0;
        for (Activity activity : activities) {
            totalTime += activity.getTimeInSeconds();
        }
        return totalDistanceInMetres / totalTime;
    }

    public double calculateAltitude() {
        double totalAltitude = 0;
        for (Activity activity : activities) {
            totalAltitude += activity.getAltitude();
        }
        return totalAltitude;
    }


}
