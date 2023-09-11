package W1.D1;

public class HelloWorld {

    public static void main(String[] args) {
        // This is for a comment, it gets ignored when the code is run
        // The very first thing we want to try is to print out "Hello, World!"

        // This is the Java way to just say "print"
        System.out.println("Hello, World!");
        System.out.println("My name is Bryan!");

        // System.out.println(51);

        // We'll talk more about data types later
        int x = 51;

        // Leverage the variable listed here to print out a statement
        System.out.println(x);

        // What's the utility of this?
        // Change the value of x whenever I want and the print statement will still work
        x = x + 10;

        System.out.println(x);

        // We can call the speak method like so
        speak("Calling from the speak method");
    }

    public static void speak(String word){
        System.out.print(word);
    }

}
