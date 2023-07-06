package org.javarush.E2;

public class Transaction extends Thread {

    private static int COUNTER = 0;
    private int id;
    private final Client client;
    private int sum;
    private boolean successful = false;

    public Transaction(Client client, int sum) {
        this.id = COUNTER++;

        this.client = client;
        this.sum = sum;
    }

    @Override
    public void run() {
        withdrawMoney();
    }

    private void withdrawMoney(){

//        synchronized (this){

            if (client.getBalance() - sum >= 0){


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                client.pay(sum);
                successful = true;
                System.out.println("After transaction: " + client );
            }else {
                System.out.println("Transaction declined");
            }

//        }

    }
}
