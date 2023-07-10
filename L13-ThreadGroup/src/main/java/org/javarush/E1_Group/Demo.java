package org.javarush.E1_Group;

public class Demo {
    public static void main(String[] args) {


        ThreadGroup threadGroup = new ThreadGroup("Simple Group");

        Thread thread1 = new Thread(threadGroup, "T1");
        Thread thread2 = new Thread(threadGroup,  "T2");
        Thread thread3 = new Thread(threadGroup,"T3");

        thread1.setPriority(10);
        thread2.setPriority(5);
        thread3.setPriority(1);


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
