package com.example.michael.solidlab;

/**
 * Created by michael on 12/09/2017.
 */

public class FastestAverage extends Competition {
    @Override
    public Athlete calculateWinner() {
        Athlete winner = null;
        double currentFastest = 0;

        for (Athlete athlete : athletes) {
            if (athlete.calculateAverageSpeed() > currentFastest) {
                currentFastest = athlete.calculateAverageSpeed();
                winner = athlete;
            }
        }

        return winner;
    }
}
