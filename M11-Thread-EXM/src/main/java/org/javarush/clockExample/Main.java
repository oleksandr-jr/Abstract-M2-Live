package org.javarush.clockExample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock, "Clock Thread");

        long before = System.currentTimeMillis();
        System.out.println(before);
        clockThread.start();
        Thread.sleep(5000);


        System.out.println();


    }
}
