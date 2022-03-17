import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class NumberConverter {
    public static void main(String[] args) throws IOException {
        String A, B, C, D, E, F, X;
        String UserInput = "", UserInputToDecimal, UserInputSystem;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //do {
        System.out.println("Menu");
        System.out.println("Choose what operation you want to perform: ");
        System.out.println("1. Convert from any system to the decimal system: ");
        System.out.println("B. Convert from Decimal system to another system: ");
        System.out.println("C. Summing up numbers from different systems: ");
        System.out.println("D. Subtracting numbers from different systems: ");
        System.out.println("E. Multiplying numbers from different systems: ");
        System.out.println("F. Dividing numbers from different systems: ");
        System.out.println("X. Exit the program: ");

        //UserInputToDecimal = br.readLine();


        if(UserInput == A){
            System.out.println("Enter the value you want to convert to the decimal system: ");
            UserInputToDecimal = br.readLine();

            System.out.println("What system is the number from? ");
            UserInputSystem = br.readLine();

            System.out.println(Integer.toBinaryString());

        }




    }
