package org.javarush.E2;

public class Fibonacci implements Job {

    private static int COUNT = 0;

    private int id;
    private int priority;
    private int inputValue;

    public Fibonacci(int inputValue, int priority) {
        this.id = COUNT++;
        this.inputValue = inputValue;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    private long fibonacci(int n){
        if (n <= 1){
            return n;
        }else{
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    @Override
    public Long call() throws Exception {
        long result = fibonacci(inputValue);
        System.out.println("Priority :" + this.priority  + '\n'
                           + "Thread: " + Thread.currentThread().getName() + '\n'
                           +  "Task with input value " + inputValue + " done with result " + result);
        return result;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int compareTo(Job o) {
        return o.getPriority() - this.priority;
    }

}
