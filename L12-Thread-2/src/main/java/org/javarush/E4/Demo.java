package org.javarush.E4;

// OBJ 1 L T0
// OBJ 2 L T1
// OBJ 3 L T2

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        String obj1 = "--- OBJECT 1 ---";
        String obj2 = "+++ OBJECT 2 +++";
        String obj3 = "^^^ OBJECT 3 ^^^";

        Thread thread1 = new Thread(new SyncThread(obj1, obj2));
        Thread thread2 = new Thread(new SyncThread(obj2, obj1));
//        Thread thread3 = new Thread(new SyncThread(obj3, obj1));

        thread1.start();
        Thread.sleep(5000);
        thread2.start();
//        Thread.sleep(5000);
//        thread3.start();
    }
}

class SyncThread implements Runnable {

    private String obj1;
    private String obj2;

    public SyncThread(String obj1, String obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName +  " намагається заблокувати " + obj1);
        synchronized (obj1) {

            System.out.println(threadName +  " заблокував " + obj1);
            work();
            System.out.println(threadName +  " намагається заблокувати" +  obj2);

            synchronized (obj2){
                System.out.println(threadName +  "заблокував " + obj2);
                work();
            }

            System.out.println(threadName +  "розблокував " + obj2);
        }

        System.out.println(threadName +  "розблокував " + obj1);
    }

    private void work(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
