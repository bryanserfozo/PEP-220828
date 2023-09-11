package W3.D1;

import org.w3c.dom.ls.LSOutput;

public class PolymorphismDriver {

    public static void main(String[] args) {
        // Polymorphism is another pillar of OOP
        // Basically translates to many form
        // Means we get to have many ways to call the same method/ different functionality for the same method

        // Method Overloading: Changing the number and types of parameters to a method to give it different functionality

        // Let's try to create a new dog object
        Dog dog = new Dog("Husky");

        Dog dog2 = new Dog();

        Dog dog3 = new Dog("Dachshund", "Rocco", 4, true);

        // Same method different parameters

        // Method Overriding: changing the functionality from a parent class to a child class

        Animal animal = new Animal();

        System.out.println(animal.speak());

        System.out.println(dog.speak()); // We want to override this parent class method

        Bird bird = new Bird();

        System.out.println(bird.speak());
    }





}
