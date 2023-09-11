package W1.D4;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    // So far we've really only dealt with only variable at a time
    // But how we represent lists of variables

    public static void main(String[] args) {

        // Switch statement
        // Another type of control flow is a switch statement
        // It's useful for when you have a lot of discrete categories that something will fall into

        String color = "Green";

        // How do we call the sortByColor method on the color listed above?
//        sortByColor(color);

//        // Declare a switch statement
//        switch (color){ // Inside the parentheses is some variable to switch on
//            // Describe a case
//            // Basically a value for the switch variable
//            case "Blue":
//                System.out.println("The paper is Blue");
//                break;
//            case "Yellow":
//                System.out.println("The paper is Yellow");
//                break;
//            case "Green":
//                System.out.println("The paper is Green");
//                break;
//            case "Red":
//                System.out.println("The paper is Red");
//                break;
//            default:
//                System.out.println("This paper belongs in the 'other' pile");
//        }

        // Now what we want to do is consider if we have a pile of papers to sort
        // I plan on reusing the switch statement, so for practice lets try removing it to a separate method

        // How do I create a list/series of papers
        // This simplest way is with an array
        String[] pileOfPapers = {"Blue", "Green", "Red", "Green", "Red", "Purple"};

        // Now all of my papers are stored inside the pileOfPapers variable
        // How can we access them?
        // System.out.println(pileOfPapers);

        // We can access each individual item by using its index
        System.out.println(pileOfPapers[1]);
        // Why is it printing green and not blue?
        // Arrays in Java and lots of other programming languages start indexing at 0
        // {"Blue", "Green", "Red", "Green", "Red", "Purple"};
        //    0       1         2      3       4       5

        // We could also explore this by trying to get index 6
//        System.out.println(pileOfPapers[6]);

        // What if we're not sure about the length?
        // Arrays are of fixed length, so you can't add new items to the array
        // This means that length is a property meaning we call it by saying arr.length
        System.out.println(pileOfPapers.length);

        // How might we iterate over this array
        for (int i = 0; i < pileOfPapers.length; i++){
            // What we need to do is call the sortByColor method on each array item
            sortByColor(pileOfPapers[i]);
        }

        System.out.println("=================================");

        // What the heck is an enhanced for loop?
        // It's like a regular for loop but for things that can be iterated over (arrays/collections)
        // It's nice for writing shorthand for loops that allow you to do some logic for each item in a group of items
        // BUT you lose the power of the index position
        for (String paper: pileOfPapers){
            // Paper will represent every item in the array in order
            // We will call the sortByColor method on the single sheet of paper
            sortByColor(paper);
        }

        User[] users = {new User("Bryan", 25), new User("Kaitlyn", 22)};

        for (Object user: users){
            System.out.println(user);
        }

    }


    // We are outside the main method, let's declare a new method
    public static void sortByColor(String colorToSort){
        // Declare a switch statement
        switch (colorToSort){ // Inside the parentheses is some variable to switch on
            // Describe a case
            // Basically a value for the switch variable
            case "Blue":
                System.out.println("The paper is Blue");
                break;
            case "Yellow":
                System.out.println("The paper is Yellow");
                break;
            case "Green":
                System.out.println("The paper is Green");
                break;
            case "Red":
                System.out.println("The paper is Red");
                break;
            default:
                System.out.println("This paper belongs in the 'other' pile");
        }
    }
}

class User{
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
