package com.example.michael.solidlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michael on 12/09/2017.
 */
public class CompetitionTest {
    private Competition competition;
    private Athlete athlete;

    @Before
    public void before() {
        competition = new LongestDistance();
        athlete = new Athlete("Michael");
    }

    @Test
    public void canGetAthletes() {
        assertNotNull(competition.getAthletes());
    }

    @Test
    public void CanAddAthlete() {
        competition.addAthlete(athlete);

        assertEquals(1, competition.getAthletes().size());
    }

}