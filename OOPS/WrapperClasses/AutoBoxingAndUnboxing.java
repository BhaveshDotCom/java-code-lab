package OOPS.WrapperClasses;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {

        // Auto Boxing
        int varOne = 100;
        Integer wrapVarOne = varOne; // Integer wrapVarOne = Integer.valueOf(varOne);

        // Unboxing 
        Integer varTwo = 99;
        int unwrapVarTwo = varTwo; // int unwrapVarTwo = varTwo.intValue();

        Integer nullableValue = null;   
        // int unwrapNullableValue = nullableValue; // NullPointerException


    }
    
}
