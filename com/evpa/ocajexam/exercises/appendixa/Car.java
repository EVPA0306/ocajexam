package com.evpa.ocajexam.exercises.appendixa;

/**
 * Created by evgenypavlenko on 5/3/16.
 */
public class Car {

    Wheel[] wheels = new Wheel[4];
    TrafficLight[] allTrafficLights;

    public Car(TrafficLight[] trafficLights) {
        allTrafficLights = trafficLights;
    }

    void setWheels(Wheel wheel) {
        wheels[0] = wheel;
        wheels[1] = wheel;
        wheels[2] = wheel;
        wheels[3] = wheel;
    }
}
