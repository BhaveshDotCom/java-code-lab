package Interface;

public class PolymorphismImplementation {
    public static void main(String[] args) {
        Payment paymentOne = new CardPayment();
        System.out.println(paymentOne.pay());
        Payment paymentTwo = new UPIPayment();
        System.out.println(paymentTwo.pay());

        
    }
}

interface Payment {
    String pay();
}

class CardPayment implements Payment {
    @Override
    public String pay(){
        return "Payment proceed via Card";
    }
}

class UPIPayment implements Payment {
    @Override
    public String pay(){
        return "Payment proceed via UPI";
    }
}
