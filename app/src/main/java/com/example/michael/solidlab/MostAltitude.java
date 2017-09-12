package com.example.michael.solidlab;

/**
 * Created by michael on 12/09/2017.
 */

public class MostAltitude extends Competition {
    @Override
    public Athlete calculateWinner() {
        Athlete winner = null;
        double currentHighest = 0;

        for (Athlete athlete : athletes) {
            if (athlete.calculateAltitude() > currentHighest) {
                currentHighest = athlete.calculateAltitude();
                winner = athlete;
            }
        }

        return winner;
    }
}
