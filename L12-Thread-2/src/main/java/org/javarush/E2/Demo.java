package org.javarush.E2;

public class Demo {

    public static void main(String[] args) {
        Client client = new Client(1000);

        Transaction transaction1 = new Transaction(client, 500);
        Transaction transaction2 = new Transaction(client, 500);
        Transaction transaction3 = new Transaction(client, 500);

        transaction1.start();
        transaction2.start();
        transaction3.start();

    }
}
