package W2.D4;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionsDriver {

    public static void main(String[] args) {
        // What exactly is an exception?

        // Exceptions are essentially what happens when things go wrong in your code

        String[] colors = {"red", "green", "blue"};

        // colors[3] = "Yellow"; //This is an ArrayOutOfBoundsException

        for (String s: colors){
            System.out.println(s);
        }

        // Another common exception is an Arithmetic Exception

         // int x = 4 / 0; //We divided by zero which caused a problem


        // The Exceptions we caused above are called Unchecked Exceptions (Runtime exceptions)

        // The other big class of exceptions is compile time exceptions or Checked Exceptions

        // Checked exceptions are checked for by the compiler and must be handled before the code can be run

        // Let's say I wanted to read from a file
        // This will generate something called a FileNotFoundExceptions

        // Essentially the way this works is a method is called that throws an exception of some sort

        // fileNotFoundThrower();

        // SQLThrower();

        // How do we handle an exception?
        // There are two major ways we consider when trying to handle an exception
        // One is a try catch block
        // The other is by "ducking" the exception

        try{
            System.out.println("Start of the try block!");
            // Inside of a try block, we'll have some code that could possible throw an exception
            // This is mainly used for checked exceptions
            fileNotFoundThrower();

            System.out.println("End of the try block!");
        } catch (FileNotFoundException e) { // Here we catch the exception and do some logic instead of just breaking
            System.out.println("Jumping to the catch block!");
            e.printStackTrace();
        }

        System.out.println("Program made it to the end");


        // A couple other points to note
        // try catch finally is also another type of block
        // It will try to run the code in the try part
        // If it hits an exception it will run the catch
        // Either way it will still run the finally block

        // We can also have multiple catch blocks but the must be in order of most specific to least specific
        // We'll talk more about this once we understand inheritance

        // Calling our exception ducker
        try {
            exceptionDucker();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Can we do something useful inside a catch block
        int x = 4;
        int userInput = 0;
        int result;
        try {
             result = x / userInput;

        } catch (ArithmeticException e){
            System.out.println("You tried to divide by zero!");
            result = 1;
        }





    }


    public static void fileNotFoundThrower() throws FileNotFoundException { // Throws denotes we can possibly throw an exception
        // Whenever you have a method that throws an exception that's not a runtime exception you need to have it
        // declared in the method signature

        // To force this method to throw an exception, we'll use the throw keyword to throw a new exception
        throw new FileNotFoundException();
    }


    public static void SQLThrower() throws SQLException{
        // This method throws a different checked exception called a SQLException
    }

    public static void exceptionDucker() throws SQLException{
        // Let's pretend we're coding along and we call a method that throws a checked exception

        SQLThrower();
    }
}
