package com.example.michael.solidlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 12/09/2017.
 */
public class FastestAverageTest {
    Competition competition;
    Athlete athlete1;
    Athlete athlete2;

    @Before
    public void before() {
        competition = new FastestAverage();

        athlete1 = new Athlete("Michael");
        athlete1.addRun( new Run(5.1, 3612, 0.4) );
        athlete1.addRun( new Run(3.2, 2015, 1.2) );
        competition.addAthlete(athlete1);

        athlete2 = new Athlete("Heather");
        athlete2.addRun( new Run(5.1, 3552, 0.2) );
        athlete2.addRun( new Run(3.0, 2552, 1.7) );
        competition.addAthlete(athlete2);
    }

    @Test
    public void calculateWinner() {
        assertEquals(athlete1, competition.calculateWinner());
    }

}