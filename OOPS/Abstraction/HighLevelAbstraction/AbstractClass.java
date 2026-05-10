package OOPS.Abstraction.HighLevelAbstraction;

public class AbstractClass {
    
    public static void main(String[] args) {

        Device d1 = new Laptop();
        d1.turnOn();
        Device d2 = new Smartphone();
        d2.turnOn();
    }
}


// Parent Class
abstract class Device {

    Device(){
        System.out.println("Power On");
    }
    void charge() {
        System.out.println("Device is charging...");
    }

    abstract void turnOn();
}


// Child Class: Laptop
class Laptop extends Device {

    @Override
    void turnOn() {
        System.out.println("Laptop is booting Windows...");
    }
}


// Child Class: Smartphone
class Smartphone extends Device {

    @Override
    void turnOn() {
        System.out.println("Smartphone is starting Android...");
    }
}
