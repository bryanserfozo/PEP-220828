package W2.D4;

import java.sql.SQLException;

public class ExceptionsDriverAgain {

    public static void main(String[] args) {
        // A CHECKED Exception is CHECKED by the compiler and must be handled in some way BEFORE the code compiles
        // throw new SQLException();

        // How do we handle the CHECKED exception? Use a try catch block or a throws declaration
        try{
            // We try to run everything in the try block
            throw new SQLException();


            // If we hit an exception, we go to the catch block
        } catch (SQLException e) {
//            e.printStackTrace();
            System.out.println("SQLException was caught here!");
            // Catching an exception is important bc otherwise the entire application will halt
        }

        // UNCHECKED Exceptions are NOT CHECKED by the compiler, meaning the code can compile and run even if we don't
        // handle it, BUT if we do hit an exception, then the program will halt

        int[] numberArray = new int[3];

        numberArray[7] = 67; // This causes an exception

        System.out.println("If the program prints this line, then no exception was found!");
    }
}
