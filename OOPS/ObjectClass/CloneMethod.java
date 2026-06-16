package OOPS.ObjectClass;

public class CloneMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
     
        Human humanOne = new Human("Bhavesh", 19);
        Human humanTwo = (Human)humanOne.clone();

        IO.println(humanTwo.name);

    }
}

class Human implements Cloneable  {
    String name;
    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/* 
Marker Interface
Shallow Copy
*/
