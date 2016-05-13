package com.evpa.learnj8;

import java.util.function.*;

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
    } 
}