package StandardIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) throws IOException{

        int input = System.in.read(); // BU
        System.out.println(input); // 66
        System.out.println((char)input); // B 

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Input: ");
        String stringInput = br.readLine(); // reads string
        System.out.println("Output: "+stringInput);

        Scanner scan = new Scanner(System.in);
        // Scanner scan = new Scanner("Bhavesh Dot Com");
        String myString = scan.next();
        System.out.println("Name: "+myString); 

    }
    
}

// Scanner class is slow as compared to BufferedReader
