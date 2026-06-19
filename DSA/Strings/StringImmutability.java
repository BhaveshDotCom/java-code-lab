package DSA.Strings;

public class StringImmutability {
    public static void main(String[] args) {
        String num = "12345"; // string pool
        String loopNum = "";

        for(int i=1; i<=5; i++){
            loopNum+=i; // heap memory

        }
        System.out.println(loopNum);
        System.out.println(".equals() method "+loopNum.equals(num)); //true
        System.out.println("== Operator "+(loopNum == num)); // false
    }
    
}
