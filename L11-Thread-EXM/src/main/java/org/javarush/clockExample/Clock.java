package org.javarush.clockExample;

public class Clock implements Runnable{

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();

        while (!currentThread.isInterrupted()){
//            System.out.println(currentThread.isInterrupted());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
////                currentThread.interrupt();
//                System.out.println(currentThread.isInterrupted());
//            }

            System.out.println("Tik");
        }

        long after = System.currentTimeMillis();

        System.out.println(after);
    }
}
