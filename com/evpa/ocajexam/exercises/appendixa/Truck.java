package com.evpa.ocajexam.exercises.appendixa;

/**
 * Created by evgenypavlenko on 5/3/16.
 * This is an example of on-to-one direct association
 */
public class Truck {
    Trailer trailer;

    void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
}
