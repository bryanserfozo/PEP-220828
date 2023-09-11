package W1.D2;

public class StringBasics {

    public static void main(String[] args) {
        // Strings are one of the simplest reference types that you will use frequently

        // Strings describes regular words and sentences and are implicitly just an array of characters

        String words = "Hello World!";
        // Datatype name =  value;

        // The main difference is that a string is an object and not a primitive, meaning it has methods associated
        // with it

        System.out.println(words);

        // Strings have a fixed length, we can see that length
        System.out.println(words.length());

        // We can convert strings to uppercase and lowercase
        System.out.println(words.toLowerCase());
        System.out.println(words.toUpperCase());

        System.out.println("----------------------------");

        // There are all sorts of methods associated with the string class that can do a variety of things
        // We'll learn more about what the following code does later
        for(char c: words.toCharArray()){
            System.out.println(c);
        }
    }
}
