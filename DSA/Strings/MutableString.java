package DSA.Strings;

public class MutableString {

    public static void main(String[] args) {


        // Mutable
        // Capacity = (16*2)+2 (dynamically expands)
        StringBuilder strZero = new StringBuilder(); // 16 Bytes
        StringBuilder strOne = new StringBuilder(100); // 100 Bytes
        StringBuilder str = new StringBuilder("Java"); // 16 + 4 Bytes

        System.out.println(str); 
        System.out.println(str.hashCode());
        str.append("26");
        System.out.println(str);
        System.out.println(str.hashCode());

        System.out.println(strOne.capacity());

        // StringBuffer provides thread safety

    }
    
}
