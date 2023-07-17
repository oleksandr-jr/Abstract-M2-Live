package org.javarush.E1_threadFactory;

public class Task implements Runnable{
    private static int COUNT = 0;
    private int taskID;

    private ThreadLocal<Integer> result = new ThreadLocal<>();
    private int counter = 0;

    public Task() {
        taskID = COUNT++;
    }

    @Override
    public void run() {
        counter++;

        if (result.get() != null){
            result.set(result.get() + 1);
        } else {
            result.set(0);
        }

        System.out.println("counter: " + counter);
        System.out.println("ThreadLocal: " + result.get());

        System.out.println("--------");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(Thread.currentThread().getName() + " | " + "Task ID: " + taskID);
    }
}
