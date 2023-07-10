package org.javarush.E2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) throws InterruptedException{
        JobQueue jobQueue = new JobQueue(50);

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0, priority = 1; i < 10; i++, priority++) {
            jobQueue.put(new Fibonacci(45, priority));
        }


        executorService.invokeAll(jobQueue.getAll());

    }
}
