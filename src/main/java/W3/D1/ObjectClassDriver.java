package W3.D1;

public class ObjectClassDriver {

    // Each class we create implicitly extends the Object class meaning we can override these methods accordingly
    // There are several useful methods in the Object class that we'll likely want to override (equals and toString)

    public static void main(String[] args) {
        Dog dog = new Dog("German Shepard");

        // What happens if I try to print out this dog?
        System.out.println(dog); // Implicitly calls the toString which prints out the memory address

        // By overriding the toString method we make it very nice to print and read

        // Let's say we created a second Dog
        Dog dog2 = new Dog("German Shepard");
        // When we check equality of objects we often want to see if they have the same values for their instance variables

        System.out.println(dog2);

        // What happens when we call dog == dog2
        System.out.println(dog == dog2); // Looks at the memory address to see if it's the same

        System.out.println(dog.equals(dog2)); // This is also why we usually call .equals on strings
    }
}
