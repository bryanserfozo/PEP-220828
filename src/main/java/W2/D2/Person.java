package com.revature.W2.D2;

public class Person {
    // This person is going to be used to create Person objects that have all the characteristics of real people

    // We store characteristics in properties/variables
    int age;

    String name;

    double height;

    boolean isRightHanded;


    // We're going to create a constructor which defines HOW we can create our object (special method)
    public Person(int ageInput, String nameInput, double heightInput, boolean isRightHandedInput){
        // This is called an ALL-ARGS constructor, meaning it sets the value for EVERY argument
        this.age = ageInput;
        this.name = nameInput;
        this.height = heightInput;
        this.isRightHanded = isRightHandedInput;
    }

    // We can also create multiple constructors
    // The original/default constructor is a NO-ARGS constructor
    // It will always be defined if no other constructor exists

    // What we can do is build a no-args constructor so we have the capability to do BOTH
    public Person(){
        this.age = 1;
        this.name = "John";
        this.height = 2.3;
        this.isRightHanded = true;
    }

    // We can create as many constructors as we realistically need, some may have a couple but not all arguments
    public Person(int age, double height){
        this.age = age;
        this.height = height;
        this.name="Jane";
    }




    // We also utilize methods to describe what a person can DO
    // TODO create a walk method, and a talk method

    // Let's start with a talk method
    public void talk(){
        // So this is a basic method and we want the person object to introduce itself when called
        System.out.println("Hi, my name is " + name + "!");
    }
}
