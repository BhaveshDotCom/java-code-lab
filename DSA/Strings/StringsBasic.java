package DSA.Strings;

/*
Golden Rule
Only compile-time constants and literals go to the String Pool automatically.
Strings created at runtime go to the Heap.
*/

public class StringsBasic {
    public static void main(String[] args) {
        
        String langNamePart = "ja" + "va";
        String langName = "java";

        System.out.println(langName == langNamePart);
        System.out.println(langName.equals(langNamePart));


        String langOne = "ja";
        String langTwo = langOne + "va";

        System.out.println(langTwo == langName);
        System.out.println(langTwo.equals(langName));

        String stringOne = new String("Hello, World");
        /*
        Step by step
        "Hello, World" : the string literal is created (or reused if already present) in the String Pool.

        new String("Hello, World") : explicitly creates another String object in the normal heap.
        
        stringOne variable points to the newly created heap object, not the pooled object.
        */
    
        byte[] stringTwo = {'B','H','A','V','E','S','H'};
        String stringThree = new String(stringTwo, 0, 4); // [0,6)
        System.out.println(stringThree);

        byte[] stringFour = {'B','H','A','V','E','S','H'};
        String stringFive = new String(stringFour, 0, 4); // [0,6)
        System.out.println(stringFive);    

        StringBuilder stringSix = new StringBuilder("Python");
        StringBuffer stringSeven = new StringBuffer("Go"); 
    }

    
    
}
