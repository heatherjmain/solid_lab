package com.example.michael.solidlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michael on 12/09/2017.
 */

public class AthleteTest {
    private Athlete athlete;
    private Run run1;
    private Run run2;

    @Before
    public void before() {
        athlete = new Athlete("Michael");
        run1 = new Run(5.1, 3612, 0.4);
        run2 = new Run(3.2, 2015, 1.2);
    }

    @Test
    public void canGetName() {
        assertEquals("Michael", athlete.getName());
    }

    @Test
    public void startsWithNoRuns() {
        assertNotNull(athlete.getActivities());
        assertEquals(0, athlete.getActivities().size());
    }

    @Test
    public void canAddRun() {
        athlete.addRun(run1);
        assertEquals(1, athlete.getActivities().size());
    }

    @Test
    public void canCalculateDistance() {
        athlete.addRun(run1);
        athlete.addRun(run2);
        assertEquals(8.3, athlete.calculateDistance(), 0.001);
    }

    @Test
    public void canCalculateAverageSpeed() {
        athlete.addRun(run1);
        athlete.addRun(run2);
        assertEquals(1.475, athlete.calculateAverageSpeed(), 0.001);
    }

    @Test
    public void canCalculateAltitude() {
        athlete.addRun(run1);
        athlete.addRun(run2);
        assertEquals(1.6, athlete.calculateAltitude(), 0.001);
    }

}