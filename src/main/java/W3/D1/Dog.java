package W3.D1;

import java.util.Objects;

public class Dog extends Animal{
    // The dog class is an extension of the animal class, also known as a CHILD class or a subclass

    // This class may have some additional features
    String breed;

    // Let's start our polymorphism lesson with a constructor
    // When we built a constructor we started with a no-args constructor
    public Dog(){
        // This is the dog no-args constructor, can be used for default parameters
        this.breed = "Shiba Inu";
        this.hasFur = true;
        this.name = "Good boy";
        this.numOfLegs = 4;
    }

    // Where does overloading come into the mix?
    public Dog(String breed){
        this.breed = breed;
        this.hasFur = true;
        this.name = "Good boy";
        this.numOfLegs = 4;
    }

    public Dog(String breed, String name, int numOfLegs, boolean hasFur){
        super(name, numOfLegs, hasFur); // Calling parent class constructor
        this.breed = breed;
//        this.hasFur = hasFur;
//        this.name = name;
//        this.numOfLegs = numOfLegs;
    }

    // This is the core behind method overloading, we essentially change the number/type of parameters and change
    // functionality based off that


    // We want to change the functionality of the parent class method called speak
    @Override// Annotation
    public String speak(){
        // We are OVERRIDING the parent class functionality
        return "BARK BARK BARK!";
    }

    // We can override the object class's methods just like any other


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", numOfLegs=" + numOfLegs +
                ", hasFur=" + hasFur +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }


}
