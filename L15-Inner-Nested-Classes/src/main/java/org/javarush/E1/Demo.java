package org.javarush.E1;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("BRAND1", "MODEL1");

        Car.CarComputer carComputer = car.getCarComputer();

//        Car.CarComputer carComputer1 = new Car("a","B").new CarComputer();
//
//        Car.CarComputer carComputer2 = car.new CarComputer();



        carComputer.triggerCall();


    }
}
