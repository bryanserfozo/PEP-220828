package W3.D1;

public class InheritanceDriver {

    public static void main(String[] args) {
        // The first topic we're going to talk about is inheritance, which is a pillar of OOP
        // 4 Pillars: Inheritance, Polymorphism, Encapsulation, Abstraction

        // What does it mean to inherit something?

        // Some level of attributes/traits that come from parent classes to child classes

        // We can build some instance of a dog and show that it has the properties of an animal
        Dog dog = new Dog();

        dog.breed = "Boxer"; // This variable came from the child class
        dog.name = "Maya"; // These variables came from the parent class
        dog.numOfLegs = 4;
        dog.hasFur = true;

        System.out.println(dog.speak());

        Animal animal = new Animal();
        // Should animal have access to the features that dog has?
        // animal.breed doesn't work because this belongs to a child class

        Bird bird = new Bird();

        bird.canFly = true; // Child class attribute
        bird.name = "Polly"; // Parent class attribute

        // Liskov Substitution
        // Basically can use a child class as reference for a parent class/interface
        // List list = new Arraylist();

        // We can provide some substitution for different implementations of our class
        Animal pug = new Dog(); // Parent name = new Child();
        // Dog d = new Animal(); // Doesn't work? Why?
        // Let's look at what a pub can do
        pug.name = "Otis"; // Animal Class attributes
        pug.hasFur = true;
        pug.numOfLegs = 4;

        // Do we get child class functionality?
        // pug.breed does not work so no


    }
}
