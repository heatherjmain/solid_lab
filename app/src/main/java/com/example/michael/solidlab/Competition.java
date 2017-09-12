package com.example.michael.solidlab;

import java.util.ArrayList;

/**
 * Created by michael on 12/09/2017.
 */

public abstract class Competition {
    protected ArrayList<Athlete> athletes;

    public Competition() {
        athletes = new ArrayList<>();
    }

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    public abstract Athlete calculateWinner();
}
