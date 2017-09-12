package com.example.michael.solidlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michael on 12/09/2017.
 */
public class RunTest {
    private Run run;

    @Before
    public void before() {
        run = new Run(5.1, 3612, 0.4);
    }

    @Test
    public void getDistance() {
        assertEquals(5.1, run.getDistance(), 0.01);
    }

    @Test
    public void getTimeInSeconds() {
        assertEquals(3612, run.getTimeInSeconds());
    }

    @Test
    public void getAltitude() {
        assertEquals(0.4, run.getAltitude(), 0.01);
    }

}