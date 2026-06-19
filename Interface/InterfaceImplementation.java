package Interface;

public class InterfaceImplementation {
    public static void main(String[] args) {
        Car myM5 = new M5();
        System.out.println(myM5.drive());
    }
    
}

interface Car {
    String drive();
}

abstract class BMW implements Car {
    abstract public String drive(); // must be public, can't narrow down visibility of drive
}

class M5 extends BMW {

    public String drive(){
        return "BMW M5 is accelerating...";
    }
}

/*
Declaration not definition
class -> Blueprint of an object
interface blueprint of behaviour (Contract)
*/