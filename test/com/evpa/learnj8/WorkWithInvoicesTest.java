package com.evpa.learnj8;

import com.evpa.learnj8.WorkWithInvoices;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by evgenypavlenko on 9/20/16.
 */
public class WorkWithInvoicesTest {

    List<Invoice> listOfInvoices;
    String customerName = "Oracle";
    Double ammount = 4000.00;


    @Before
    public void setUp() {

        WorkWithInvoices workWithInvoices = new WorkWithInvoices();

        List<Invoice> allInvoices = new ArrayList<>();
        allInvoices.add(new Invoice(1,"Oracle",5000.00,"Training"));
        allInvoices.add(new Invoice(2,"IBM",67000.00,"Training"));
        allInvoices.add(new Invoice(3,"Netcracker",78000.40,"Training"));

        listOfInvoices = workWithInvoices.findInvoices(allInvoices, new InvoicePredicate() {
            @Override
            public boolean test(Invoice invoice) {
                return invoice.getAmount() > ammount && customerName.equals(invoice.getCustomer());
            }
        });
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getEmptyList() {
        listOfInvoices.get(-1);
    }

    @Test
    public void testOracleInvoce() {
        assertEquals(customerName, listOfInvoices.get(0).getCustomer());
    }

    //@After
}
