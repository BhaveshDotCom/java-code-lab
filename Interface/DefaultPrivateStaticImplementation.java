package Interface;


public class DefaultPrivateStaticImplementation {
    public static void main(String[] args) {
        
    }
    
}



interface Car {

    default void start(){
        System.out.println("Engine Started...");
        accelerate();
    }

    private static void accelerate(){
        System.out.println("Car is accelerating...");
    }
}
        
/*
Java 8
Added default methods (default) so interfaces can provide method implementations without breaking existing classes.
Added static methods (static) that belong to the interface itself.

java 9
Added private methods inside interfaces.
Added private static methods inside interfaces.
*/
