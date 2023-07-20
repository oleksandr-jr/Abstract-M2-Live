package org.javarush.E3;

public class Car {

    public static Builder builder = new Builder();
    private static int COUNT;
    private int serialNumber;
    private String brand;
    private String model;

    private Car(String brand, String model) {
        this.serialNumber = COUNT++;
        this.brand = brand;
        this.model = model;
    }


    public static class Builder {
        private String brand;
        private String model;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Car build(){
            return new Car(brand, model);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
               "serialNumber=" + serialNumber +
               ", brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               '}';
    }
}
