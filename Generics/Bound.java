package Generics;

public class Bound {
    public static void main(String[] args) {
        NumberClass<Float> val = new NumberClass<>(3.1415F);

        LivingBeing<Aquatic> being1 = new LivingBeing<>();
        // LivingBeing<Terrestrial> being2 = new LivingBeing<>(); // Error: Bound mismatch
         
    }    
}

// only deals with Number
class NumberClass<T extends Number>{
    T value;

    NumberClass(T value){
        this.value = value;
    }
}

// <T extends class & interface1, interface2>

class LivingBeing<T extends Creature & Swimable> {
    T beingOne;
}

class Creature {

    void eat() {
        System.out.println("Creature is eating");
    }

    void sleep() {
        System.out.println("Creature is sleeping");
    }
}

class Terrestrial extends Creature {

    void walk() {
        System.out.println("Terrestrial creature is walking");
    }
}

interface Swimable {

    void swim();
}

class Aquatic extends Creature implements Swimable {

    @Override
    public void swim() {
        System.out.println("Aquatic creature is swimming");
    }

    void dive() {
        System.out.println("Aquatic creature is diving");
    }
}

