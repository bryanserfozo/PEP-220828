package com.revature.W2.D3;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {

    // Lists are a way to store a collection of objects

    public static void main(String[] args) {

        // Syntax for making a list is a little different from what we've seen previously
        // Person p = new Person

        List<String> colors = new ArrayList<>();
        // What happens here is a slight mismatch between the left and the right
        // Basically we can't create a List object since it's an interface so we provide an implementing class

        // What's going on with those angles brackets?
        String[] colorArray = {"Red", "Green", "Blue"};

        // Now that we've created our list, how do we add items to it?
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Well we should be able to do all the things we could with an array
        // We can get the size/length of an array
        System.out.println(colorArray.length); // Notice that length is called like a property because it's fixed
        System.out.println(colors.size()); // We need to call a method since the size is dynamic

        // Like I said we can also remove items from the list
        colors.remove(1); // This removes the item at index 1 so the color "Green"

        // We can validate this by printing the items in the list
        for (String color: colors){
            System.out.println(color);
        }

        // Other things we did with arrays that we can also do with lists
        // Update the value of an item
        colorArray[1] = "Yellow";
        colors.set(2, "Green");


        // So lets try to make a list of numbers
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // We can create lists of our custom objects as well
        List<Item> groceryList = new ArrayList<>();

        Item eggs = new Item("Eggs", 6.99, 1);
        Item milk = new Item("Milk", 5.00, 3);
        Item cheese = new Item("Cheddar Chese", 7.83, 5);

        // Let's say I don't shop at walmart anymore
        // I can change the store name and that will apply to EVERY item instance
        Item.storeName = "Publix";

        groceryList.add(eggs);
        groceryList.add(milk);
        groceryList.add(cheese);

        Item pubSub = new Item("Pub Sub", 9.09, 1);
        groceryList.add(pubSub);

        for (Item i: groceryList){
            System.out.println(i);
        }
    }
}
