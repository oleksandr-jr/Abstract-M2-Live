package org.javarush.E1;

public class Car {
    private static int COUNT;
    private int serialNumber;
    private String brand;
    private String model;
    private CarComputer carComputer;

    private double fuelTank = 50;

    public Car(String brand, String model) {
        this.serialNumber = COUNT++;
        this.brand = brand;
        this.model = model;
        this.carComputer = this.new CarComputer();
    }
    public static int getCOUNT() {
        return COUNT;
    }

    public static void setCOUNT(int COUNT) {
        Car.COUNT = COUNT;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarComputer getCarComputer() {
        return carComputer;
    }

    public void start(){
        privateMethod();

        try {
            carComputer.checkFuel();
            carComputer.checkBrakes();
            carComputer.checkSensors();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void staticCarMethod(){
    // CarComputer carComputer1 = new CarComputer(); // Так не можна
    }

    private void privateMethod(){
        System.out.println("Car private method");
        carComputer.privateMethod();

    }

    public class CarComputer {
        private boolean testPassed = false;

        private static void staticComputerMethod(){
            staticCarMethod();
        }


        public void triggerCall(){
//            Car.this.privateMethod();
            this.privateMethod();
            Car.this.privateMethod();
        }

        private void privateMethod(){
            System.out.println("Computer private method");
        }

        void checkFuel(){
            if (fuelTank < 5){
                throw new RuntimeException();
            }
        }

        private void checkBrakes(){
            if (Math.random() > 0.95){
                throw new RuntimeException("Brakes exception");
            }
        }

        private void checkSensors(){
            if (Math.random() > 0.95){
                throw new RuntimeException("Sensors exception");
            }
        }

        private void showHelloMessage(){
            System.out.println("Hello from " + getBrand());
        }

    }

}
