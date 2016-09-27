package com.evpa.learnj8;

/**
 * Created by evgenypavlenko on 9/20/16.
 */
@FunctionalInterface
public interface InvoicePredicate {
    boolean test(Invoice invoice);
}
