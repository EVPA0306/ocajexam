package com.evpa.learnj8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by evgenypavlenko on 1/18/17.
 */
public class TestStreamAndLambda {

    public static void main(String...args) {

        List<Invoice> allInvoices = new ArrayList<>();
        allInvoices.add(new Invoice(1,"Oracle",5000.00,"Training"));
        allInvoices.add(new Invoice(2,"IBM",67000.00,"Training"));
        allInvoices.add(new Invoice(3,"Netcracker",78000.40,"Training"));
        allInvoices.add(new Invoice(4,"Level3",7123.50,"Training"));
        allInvoices.add(new Invoice(5,"ID Software",9000.40,"Training"));
        allInvoices.add(new Invoice(6,"Oracle",125000.00,"Training"));

        List<Invoice> oracleAndTrainingInvoces = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        List<Integer> fiveFirstIDs = new ArrayList<>();

        for (Invoice inv: allInvoices)
        {
            if("Oracle".equals(inv.getCustomer())) {
                if(inv.getTitle().contains("Training")) {
                    oracleAndTrainingInvoces.add(inv);
                }
            }
        }

        Collections.sort(oracleAndTrainingInvoces, new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                return Double.compare(o1.getAmount(),o2.getAmount());
            }
        });

        for (Invoice inv: oracleAndTrainingInvoces) {
            ids.add(inv.getId());
        }

        /*for(int i = 0; i < ids.size(); i++) {
            fiveFirstIDs.add(ids.get(i));
        }*/


        Stream<Invoice> oracleAndTrainingInvoicesStream = allInvoices.stream()
                .filter(invoice -> invoice.getCustomer().contains("Oracle"))
                .filter(invoice -> invoice.getTitle().contains("Training"));

        Stream<Invoice> sortedInvoices = oracleAndTrainingInvoicesStream
                .sorted(Comparator.comparingDouble(Invoice::getAmount));

        Stream<Integer> idsStream = sortedInvoices.map(Invoice::getId);

        fiveFirstIDs = allInvoices.stream()
                .filter(invoice -> invoice.getCustomer().contains("Oracle") || invoice.getCustomer().contains("IBM"))
                //.findAny()
                .filter(invoice -> invoice.getTitle().contains("Training"))
                .sorted(Comparator.comparingDouble(Invoice::getAmount))
                .map(Invoice::getId)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("oracleAndTrainingInvoces " + oracleAndTrainingInvoces.size());
        System.out.println("ids " + ids.size());
        System.out.println("fiveFirstIDs " + fiveFirstIDs.size());
    }
}
