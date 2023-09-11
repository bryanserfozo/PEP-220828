package com.revature.W2.D3;

public class Item {

    String name;

    double price;

    int quantity;

    static String storeName = "Walmart";

    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Create a toString method inside our Item class

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", store=" + storeName +
                '}';
    }
}
