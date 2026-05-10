package OOPS.Abstraction.HighLevelAbstraction;

public class HLAusingInheritance {
    public static void main(String[] args) {
        Car ec = new ElectricCar();
        Car fc = new FuelCar();

        ec.start();
        fc.start();
    }
}


// Parent Class: Car
class Car{
    void applyHandbrake() {
        System.out.println("Handbrake applied. Car has stopped.");
    }

    void start(){
        System.out.println("Car is starting...");
    }
}

// Child Class: Electric Car
class ElectricCar extends Car {

    void start() {
        System.out.println("Electric car is starting silently...");
    }
}

// Child class: Fuel Car
class FuelCar extends Car {

    void start() {
        System.out.println("Fuel car engine is starting with ignition...");
    }
}