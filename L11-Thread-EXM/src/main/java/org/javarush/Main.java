package org.javarush;

import org.javarush.oleksandr.Console;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Toaster toaster = new Toaster();
        Teapot teapot = new Teapot();

        Runnable microwave = () -> {
            Console.println("Microwave is on", Console.color.GREEN);
            try {
                System.out.println( Thread.currentThread().getName() );
                Thread.sleep(3000);
                Console.println("Microwave has finished", Console.color.RED);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread = new Thread(toaster, "Toaster Thread");
        Thread thread2 = new Thread(teapot, "Teapot Thread");
        Thread thread3 = new Thread(microwave, "Microwave Thread");

        thread.start();
        thread2.start();
        thread3.start();

        System.out.println("Action 1");
        Thread.sleep(1000);
        System.out.println("Action 2");
        Thread.sleep(1000);
        System.out.println("Action 3");




    }

    public static class Toaster implements Runnable{
        @Override
        public void run() {
            Console.println("Toaster is on", Console.color.GREEN);
            try {
                System.out.println( Thread.currentThread().getName() );

                Thread.sleep(3000);
                Console.println("Toaster has finished", Console.color.RED);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class Teapot extends Thread{
        @Override
        public void run() {
            Console.println("Teapot is on", Console.color.GREEN);
            try {
                Thread.sleep(3000);
                Console.println("Teapot has finished", Console.color.RED);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}

