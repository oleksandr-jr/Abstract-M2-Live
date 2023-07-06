package org.javarush.E3;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread0 = new MyThread();
        MyThread thread2 = new MyThread();

        thread0.start();

        thread0.join();

        thread2.start();
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.yield();
            System.out.println("Thread started : " + getName() + " " + i);
        }

        System.out.println("Thread ended : " + getName());
    }
}

