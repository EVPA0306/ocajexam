package com.evpa.learnj8;

public class MainClass { 
    public static void main(String args[]) { 
        int k = 2; 
        int m = 10; 
        int s =  1 >> k++ + ++m - --k - m-- << 1; 
        System.out.println("s = " + s); //1
        System.out.println("k = " + k); //2 
        System.out.println("m = " + m); //10
        System.out.println("a = " + (1 >> 2	));
        System.out.println("a = " + (2 << 1	));
    } 
}