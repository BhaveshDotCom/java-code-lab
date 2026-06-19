package Enum;

public class Enum {
    public static void main(String[] args) {
    
        Direction directionOne = Direction.WEST;
        System.out.println(directionOne.getDegree());

    }
     
}

enum Direction {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    private int degree; 

    public int getDegree(){
        return this.degree;
    }

    Direction(int degree){
        this.degree = degree;
    }
}
