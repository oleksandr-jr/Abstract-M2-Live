package org.javarush.E2;

public class Client {
    private volatile int balance;

    public Client(int balance) {
        this.balance = balance;
    }

    public synchronized void pay(int amount){
        balance -= amount;
    }

    public synchronized int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Client{" +
               "balance=" + balance +
               '}';
    }
}
