package com.example.michael.solidlab;

/**
 * Created by michael on 12/09/2017.
 */

public class Run implements Activity {
    private double distance;
    private int timeInSeconds;
    private double altitude;

    public Run(double distance, int timeInSeconds, double altitude) {
        this.distance = distance;
        this.timeInSeconds = timeInSeconds;
        this.altitude = altitude;
    }

    public double getDistance() {
        return distance;
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }

    public double getAltitude() {
        return altitude;
    }
}
