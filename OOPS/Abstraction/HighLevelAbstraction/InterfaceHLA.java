package OOPS.Abstraction.HighLevelAbstraction;

public class InterfaceHLA {
    public static void main(String[] args) {
        
        flyable f1 = new Birds();
        flyable f2 = new Aeroplane();

        f1.fly();
        f2.fly();
    }
}

interface flyable {
    void fly();
}

class Aeroplane implements flyable {

    @Override
    public void fly() {
        System.out.println("Airplane flies using wings, engines, and aerodynamics.");
    }
}

class Birds implements flyable {

    @Override
    public void fly(){
        System.out.println("Bird flies using wings and body balance.");   
    }
}