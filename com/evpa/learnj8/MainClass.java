package com.evpa.learnj8;

import java.util.function.*;
//import java.

public class MainClass { 
    public static void main(String args[]) { 
       Runnable ru = () -> System.out.println("Hi");
       /* Runnable ru = new Runnable() {
            public void run() {
                System.out.println("Hi five!");   
            }
        };*/
       //Thread th = new Thread(ru);
       //th.start();
        ru.run();
        Consumer<Object> print = System.out::println;
        print.accept("Hi six!");
        int iArray[] = new int[]{1,2,3,4,5};
        System.out.println(iArray[0]);  
        System.out.println("emptiness".substring(9));
        String month = "Jun";
        int numMonth = 0;
        switch (month) {
          case "Jan" : numMonth = 1; break;
          case "Jun" : numMonth = 6; break;
          case "Sep" : numMonth = 9; break;
        }
        System.out.println("numMonth: " + numMonth);
        System.out.println("1"+(1+1)+1);
        //func(3);  
        System.out.println("recFunc: " + recFunc(2,3));
    }

    public static int func(int x) {
      //int prod = x*y;
      if (x == 1) {
        return 1;
      } else {
        //System.out.println("x: " + x);  
        if (x <= 1000000) 
          System.out.println("x: " + x);
          return x * func(x-1);
      }
    }

    public static int recFunc(int a, int cnt) {
      if ( cnt != 1 ) {
        a = a * recFunc(a,--cnt);
      }
      return a;
    } 
}