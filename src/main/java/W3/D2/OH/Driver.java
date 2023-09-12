package W3.D2.OH;

public class Driver {

    public static void main(String[] args) {
        Person bryan = new Person();
        bryan.name = "Bryan";
        bryan.age = 25;

        System.out.println(bryan.introduce());

        // We'll create an employee now
        Employee employee = new Employee();
        employee.name = "Nick";
        employee.age = 42;

        // Employee inherits from person, so it gets all the functionality that exists in the Person class

        // We've now added a company name
        employee.companyName = "Revature";
        System.out.println(employee.introduce());

        // Overloading gives a single function multiple functionality by changing the number/type of parameters

        // We'll create two new people objects with the different constructors
        Person p = new Person(); // Creates a default no-arg person
        Person p2 = new Person("Ben", 24);
        // we have overloaded the method called Person by providing 2 functionalities for 2 sets of parameters

        // If we tried to print a person without overriding the toString functionality, it will only print the memory address
        System.out.println(p2);
    }
}
