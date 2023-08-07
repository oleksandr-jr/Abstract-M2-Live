package org.javarush;

import org.javarush.E1_threadFactory.MyThreadFactory;
import org.javarush.E1_threadFactory.Task;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThreadFactory myThreadFactory = new MyThreadFactory();

        ExecutorService executor = Executors.newFixedThreadPool(5, myThreadFactory);

        for (int i = 0; i < 5; i++) {
            executor.execute(new Task());
        }

        Thread.sleep(5000);
        executor.shutdown();
    }

}