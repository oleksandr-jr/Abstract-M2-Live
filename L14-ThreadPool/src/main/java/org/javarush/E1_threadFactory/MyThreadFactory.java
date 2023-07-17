package org.javarush.E1_threadFactory;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
    private static int COUNT = 0;
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r, "Thread-" + COUNT++);
        thread.setPriority(Thread.MAX_PRIORITY);
        return thread;
    }
}
