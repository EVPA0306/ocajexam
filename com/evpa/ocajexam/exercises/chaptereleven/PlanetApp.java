package com.evpa.ocajexam.exercises.chaptereleven;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import static com.evpa.ocajexam.exercises.chaptereleven.PlanetPredicates.*;

/**
 * Created by evgenypavlenko on 4/29/16.
 */
public class PlanetApp {
    public static void main(String...args) {
        Planet mercury  = new Planet("Mercury"  , Color.GRAY    ,0  ,false);
        Planet venus    = new Planet("Venus"    , Color.YELLOW  ,0  ,false);
        Planet earth    = new Planet("Earth"    , Color.BLUE    ,1  ,false);
        Planet mars     = new Planet("Mars"     , Color.RED     ,2  ,false);
        Planet jupiter  = new Planet("Jupiter"  , Color.YELLOW  ,67 ,true);
        Planet saturn   = new Planet("Saturn"   , Color.ORANGE  ,62 ,true);

        List<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);

        //SCENARIO #1 Which planet has the rings?
        System.out.println("Has one or more rings: " + listFilteredPlanets(planets, p -> p.getRinged()));

        //SCENARIO #3 Which planets have more than 20 moons?
        //System.out.print("Has more that 20 moons: " + listFilteredPlanets(planets, p -> p.getNumberOfMoons() > 20));
        System.out.print("Has more that 20 moons: " + filterPlanets(planets,hasMoonMoreThan(20)));
    }
}
