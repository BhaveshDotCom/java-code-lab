package OOPS.Abstraction.LowLevelAbstraction;

public class Car {
    String brand;
    String model;
    int speed;
    int yearOfManufacturing;

    Car(String brand,String model, int speed, int yearOfManufacturing){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.yearOfManufacturing = yearOfManufacturing;
    }

    // Abstraction
    void start(){
        System.out.println(brand + " " + model + " is starting...");
    }
    
    void accelerate() {
        speed += 10;
        System.out.println("Speed increased to " + speed + " km/h");
    }
}
