package org.javarush.E3;

public class Demo {
    public static void main(String[] args) {
        Car car = Car.builder
                .setModel("MODEL")
                .build();

        System.out.println(car);

    }


}
