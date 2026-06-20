package Generics;

public class GenericsImplementstion {
    public static void main(String[] args) {
        // Single Parameter
        Box<Integer> item1 = new Box<>(100);
        System.out.println(item1.getValue() + 10);

        Box<String> item2 = new Box<>("Machine Learning");
        System.out.println(item2.getValue().split(" ")[1]);

        // Multi Parameter
        Pair<Integer, String> studentOne = new Pair<>(60, "Bhavesh");
        Pair.printDetail(60, "Bhavesh");

    }    

    
}

// Single Parameter Generic class
class Box<T> {
    private T value;

    Box(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

// Multi Parameter Generic class

class Pair<T, U>{
    T valueOne;
    U valueTwo;

    Pair(T valueOne, U valueTwo){
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public static <T, U> void printDetail(T valueOne, U valueTwo){
        System.out.println(String.format("Name......%s\nEnrollment number......%d",valueTwo,valueOne));

    }
}