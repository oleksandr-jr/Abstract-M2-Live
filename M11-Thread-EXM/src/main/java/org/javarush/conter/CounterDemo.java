package org.javarush.conter;

import org.javarush.oleksandr.Console;

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread");

        Thread conuterThread = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                Console.println(String.valueOf(i), Console.color.GREEN);
            }
        }, "Counter thread");

        conuterThread.start();

        conuterThread.join();

        System.out.println("Main end");
    }

}
