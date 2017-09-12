package com.example.michael.solidlab;

/**
 * Created by michael on 12/09/2017.
 */

public class Runner {
    public static void main(String[] args) {
        Athlete athlete1 = new Athlete("Michael");
        athlete1.addRun( new Run(5.1, 3612, 0.4) );
        athlete1.addRun( new Run(3.2, 2015, 1.2) );

        Athlete athlete2 = new Athlete("Heather");
        athlete2.addRun( new Run(5.1, 3552, 0.2) );
        athlete2.addRun( new Run(3.0, 2552, 1.7) );

        Competition mostAltitude = new MostAltitude();

        mostAltitude.addAthlete(athlete1);
        mostAltitude.addAthlete(athlete2);

        System.out.println(mostAltitude.calculateWinner().getName() +
                " wins the Most Altitude competition.");

        Competition fastestAverage = new FastestAverage();

        fastestAverage.addAthlete(athlete1);
        fastestAverage.addAthlete(athlete2);

        System.out.println(fastestAverage.calculateWinner().getName() +
                " wins the Fastest Average competition.");
    }
}
