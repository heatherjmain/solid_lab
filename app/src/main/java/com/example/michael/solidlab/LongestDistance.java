package com.example.michael.solidlab;

/**
 * Created by michael on 12/09/2017.
 */

public class LongestDistance extends Competition {
    @Override
    public Athlete calculateWinner() {
        Athlete winner = null;
        double currentLongest = 0;

        for (Athlete athlete : athletes) {
            if (athlete.calculateDistance() > currentLongest) {
                currentLongest = athlete.calculateDistance();
                winner = athlete;
            }
        }

        return winner;
    }
}
