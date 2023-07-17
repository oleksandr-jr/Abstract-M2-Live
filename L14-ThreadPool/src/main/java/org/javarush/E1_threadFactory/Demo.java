package org.javarush.E1_threadFactory;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) {

    }


    public static void fixed(){
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("1");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("2");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("3");
            return null;
        });

        System.out.println("ThreadPool size: " + executor.getPoolSize());  // 2
        System.out.println("Tasks in queue: " + executor.getQueue().size()); // 1
    }

    public static void cached(){
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("1");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("2");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("3");
            return null;
        });

        System.out.println("ThreadPool size: " + executor.getPoolSize());  // 3
        System.out.println("Tasks in queue: " + executor.getQueue().size()); // 0
    }



    public void scheduledThreadPool(){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        //corePoolSize — количество потоков, которые нужно хранить в пуле, даже если они простаивают.

        executor.schedule(() -> {
            System.out.println("Hello World");
        }, 2, TimeUnit.SECONDS);
    }

    public void scheduleAtFixedRate(){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);


        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hello World");
        }, 2, 1, TimeUnit.SECONDS);
    }


    public void scheduleAtFixedRateNTimes() throws InterruptedException {
        CountDownLatch lock = new CountDownLatch(5);

        ScheduledExecutorService executor2 = Executors.newScheduledThreadPool(5);

        ScheduledFuture<?> future = executor2.scheduleAtFixedRate(() -> {
            System.out.println("Hello World");
            lock.countDown();
        }, 2, 1, TimeUnit.SECONDS);

        lock.await(10, TimeUnit.SECONDS);
        future.cancel(true);
    }

}



