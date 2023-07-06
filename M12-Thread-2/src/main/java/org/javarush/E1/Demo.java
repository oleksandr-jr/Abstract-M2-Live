package org.javarush.E1;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            Resource resource = new Resource();

            resource.value = 10;

            MyThread thread1 = new MyThread(resource);
            MyThread thread2 = new MyThread(resource);

            thread1.start();
            thread2.start();


            Thread.sleep(10);

            if (resource.value != 12){
                System.out.println(resource.value);
                throw new RuntimeException();
            }
        }
    }
}

class MyThread extends Thread {

    Resource resource;

    public MyThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeValue();
    }
}

class Resource {
    int value;

    public void changeValue(){
        synchronized (this) {
            int i = this.value;
            i++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.value = i;
        }
    }
}
