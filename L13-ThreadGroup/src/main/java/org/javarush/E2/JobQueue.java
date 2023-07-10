package org.javarush.E2;

import java.util.PriorityQueue;
import java.util.Queue;

public class JobQueue {
    Queue<Job> jobQueue = new PriorityQueue<>(20);

    public JobQueue(int initCapacity) {
        this.jobQueue = new PriorityQueue<>(initCapacity);
    }

    public synchronized void put(Job job){
        jobQueue.add(job);
    }

    public synchronized Job getJob(){
        return jobQueue.remove();
    }

    public synchronized Queue<Job> getAll(){
        return jobQueue;
    }


}
