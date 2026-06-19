package OOPS.ObjectClass;

public class CoreMethods {

    // toString
    public static void main(String[] args) {
    MyClass myClass = new MyClass();
    System.out.println(myClass);

    Integer num = 10;
    System.out.println("Is num a String: "+ (num.toString() instanceof String));

    // equals
    String langOne = new String("Java");
    String langTwo = new String("Java");
    System.out.println(langOne.equals(langTwo));
    System.out.println(langOne == langTwo);

    // hashCode()
    Student studentOne = new Student("Bhavesh", 60);
    Student studentTwo = new Student("Bhavesh", 60);
    System.out.println("is studentOne equals studentTwo: " + studentOne.equals(studentTwo));
    System.out.println(studentOne.hashCode() == studentTwo.hashCode());
    System.out.println(langOne.hashCode() == langTwo.hashCode());

    System.out.println("hashCode of studentOne: "+studentOne.hashCode());

    // getClass
    IO.println(studentOne.getClass().getName());
    IO.println(langOne.getClass().getName());

    // instanceOf
    IO.println(studentOne instanceof Student);
    IO.println(studentOne instanceof Object);
    }
}

class Student{
    String name;
    int enrollmentNumber;

    Student(String name, int enrollmentNumber){
        this.name = name;
        this.enrollmentNumber = enrollmentNumber;
    }
}

class MyClass{

    @Override
    public String toString(){
        return "Overridden";
    }
} 