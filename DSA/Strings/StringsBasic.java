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
    }
    
}
