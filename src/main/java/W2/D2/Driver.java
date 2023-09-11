package W2.D2;

public class Driver {
    public static void main(String[] args) {
        // We've been using this as a list of instructions for what we want the program to do

        // What we want to do now is create a new class called Person who will model a real-life person

        // Now that we've defined the characteristics of a person how do we create one?

        // Syntax for new object --> ClassName variableName = new ClassConstructorMethod

//        Person dylan = new Person();
//        // How can we set the variables associated with dylan?
//        dylan.age = 167;
//        dylan.name = "Dylan";
//        dylan.height = 6;
//        dylan.isRightHanded = false;

        // We've created an all-args constructor now, which means we need to change HOW we create our objects
        Person dylan = new Person(167, "Dylan", 6, false);

        // If we created a new person they would have all different values for their properties since they
        // arent the same person
//        Person kaitlyn = new Person();
//        kaitlyn.age = 22;
//        kaitlyn.name = "Kaitlyn";
//        kaitlyn.height = 5.75;
//        kaitlyn.isRightHanded = true;

        Person kaitlyn = new Person(22, "Kaitlyn", 5.75, true);

        // So each person has their own values for each of the INSTANCE variables

        // So now that we've made our talk method we can call it for each person object here
        dylan.talk();
        kaitlyn.talk();

        // What is a constructor, why do we need it and all that

        Person vanessa = new Person(89, "Vanessa", 5.6, true);
        vanessa.talk(); // This is a problem, we want to make sure that a value exists before we try to call the talk
        // method


        // Now that we've redefined our constructor, we can create a person object with no-arguments
        Person p = new Person();

        p.talk();

        Person p2 = new Person(23, 6.5);
        p2.talk();
    }
}
