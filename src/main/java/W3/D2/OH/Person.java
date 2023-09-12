package W3.D2.OH;

public class Person { // Implicitly extends the object class

    // People have some traits that we want to model
    String name;

    int age;

    // An introduce method
    public String introduce(){
        // Allows the person object to introduce itself
        return "Hi, my name is " + name;
    }

    // TODO Overload the constructor to provide multiple functionality for the same method

    // No-arg constructor
    public Person(){
        System.out.println("The no-arg constructor was called!");
    }

    // Now we're going to create a new constructor (which is a method with the same name as the last one)
    // BUT this one will take in different parameters
    public Person(String name, int age){
        System.out.println("The all-arg constructor was called!");
        this.name = name;
        this.age = age;
    }

    // TODO override the toString method inherited from the Object class
    public String toString(){ // This is the same method signature from the toString method in the Object class
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
