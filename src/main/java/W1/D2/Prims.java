package W1.D2;

public class Prims {

    public static void main(String[] args) {
        // This method is important, it's the instructions for what we want the program to do

        // We can print things out with System.out.println("Print me");
        System.out.println("Hello, World!");

        // We talked yesterday about building out variables to store values
        // Datatype name = value
        int x = 5;

        // Integer is a whole-number storage type, since java is strongly typed we can't put anything else in that
        // variable
        x = 6;

        // These don't work
        // x = 3.14159;
        // x = "Hello, World!";

        // Integer is a primitive datatype that stores whole numbers
        // There are a total of 8 primitive datatypes


        // True/False Datatype
        // boolean

        boolean isBald = false;
        isBald = true;

        // Whole number datatypes
        // byte
        // short
        // INT
        // long

        byte biteSized = 20;
        short shortStack = 500;
        int normalSized = 5000;
        long bigGuy = 12345678987654321L;

        // Decimal number datatypes
        // float
        // DOUBLE
        float smallDecimal = 3.14f;
        double largerDecimal = 3.14159265358979;

        // Character Datatype
        // char
        char letter = 'B';

        Calculator.add(2,3);
    }
}
