package com.evpa.learnj8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evgenypavlenko on 9/20/16.
 */
public class WorkWithInvoices {

    public List<Invoice> findInvoices(List<Invoice> invoices, InvoicePredicate ip) {
        List<Invoice> result = new ArrayList<>();
        for (Invoice inv : invoices) {
            if(ip.test(inv)) {
                result.add(inv);
            }
        }
        return result;
    }

    public static void main(String...args) {

        List<Invoice> allInvoices = new ArrayList<>();
        allInvoices.add(new Invoice(1,"Oracle",5000.00,"Training"));
        allInvoices.add(new Invoice(2,"IBM",67000.00,"Training"));
        allInvoices.add(new Invoice(3,"Netcracker",78000.40,"Training"));
        allInvoices.add(new Invoice(4,"Level3",7123.50,"Training"));
        allInvoices.add(new Invoice(5,"ID Software",9000.40,"Training"));

        WorkWithInvoices workWithInvoces = new WorkWithInvoices();
        List<Invoice> oracleInvoices = workWithInvoces.findInvoices(allInvoices, new InvoicePredicate() {
            @Override
            public boolean test(Invoice invoice) {
                return invoice.getAmount() > 4000.00 && "Oracle".equals(invoice.getCustomer());
            }
        });

        List<Invoice> ncInvoices =
                workWithInvoces.findInvoices(allInvoices, inv -> inv.getAmount() > 1000.00
                        && "Netcracker".equals(inv.getCustomer()));


        //List<Invoice> l3Invoices =
        //        workWithInvoces.findInvoices(allInvoices, InvoicePredicate::)

        List<Invoice> sortedInvoices = new ArrayList<>(allInvoices);

        sortedInvoices.sort((Invoice inv1, Invoice inv2)
                -> Double.compare(inv1.getAmount(),inv2.getAmount()));

        System.out.println(oracleInvoices.get(0).getAmount());
        System.out.println(ncInvoices.get(0).getAmount());
    }
}
