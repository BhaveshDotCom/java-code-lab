package OOPS;

public class ObjectClass {

    // toString
    public static void main(String[] args) {
    MyClass myClass = new MyClass();
    System.out.println(myClass);

    String langOne = new String("Java");
    String langTwo = new String("Java");
    System.out.println(langOne.equals(langTwo)); // Checks Content (Value)
    System.out.println(langOne == langTwo); // Checks Reference (Memory Address)
    }
    
}

class MyClass{

    @Override
    public String toString(){
        return "Overridden";
    }
} 