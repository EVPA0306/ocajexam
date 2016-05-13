package com.evpa.ocajexam.exercises.appendixa;

/**
 * Created by evgenypavlenko on 5/3/16.
 */
public class TrafficSimulator {
    Car[] cars = new Car[3];
    TrafficLight[] trafficLights = new TrafficLight[8];

    public TrafficSimulator() {
        for (int i = 0; i < trafficLights.length; i++) {
            trafficLights[i] = new TrafficLight(i);
        }
        cars[0] = new Car(trafficLights);
        cars[1] = new Car(trafficLights);
        cars[2] = new Car(trafficLights);
    }

    public static void main(String ... args) {
        new TrafficSimulator();
    }
}
