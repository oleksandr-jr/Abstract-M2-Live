package org.javarush.E2;

import java.util.concurrent.Callable;

public interface Job extends Callable<Long>, Comparable<Job>{
    int getId();

    int getPriority();
    void setPriority(int priority);
}
