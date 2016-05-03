package com.evpa.ocajexam.exercises.chaptereleven;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

import javafx.scene.paint.Color;

/**
 * Created by evgenypavlenko on 4/29/16.
 */
public class PlanetPredicates {

    public static Predicate<Planet> hasMoonMoreThan(Integer moons) {
        return p -> p.getNumberOfMoons() > moons;
    }

    public static Predicate<Planet> hasAColor() {
        return p -> p.getPrimaryColor() != Color.BLACK;
    }

    public static List<Planet> filterPlanets(List<Planet> planetList, Predicate<Planet> predicate) {
        return planetList.stream().filter(predicate).collect(Collectors.<Planet>toList());
    }

    public static StringBuilder listFilteredPlanets(List<Planet> planetList, Predicate<Planet> predicate) {
        StringBuilder planets = new StringBuilder();
        planetList.stream().filter(
                    (planet -> predicate.test(planet))
                ).forEach(planet -> planets.append(planet).append(" "));
        return planets;
    }
}