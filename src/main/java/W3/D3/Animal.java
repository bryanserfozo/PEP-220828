package W3.D3;

public abstract class Animal { // Creates an abstract class, can't be instantiated
    // Can contain concrete and abstract methods
    // Expected to be extended

    private int legs;
    private String color;

    // Even though abstract classes can't be instantiated, they can still have constructors
    public Animal(){
        System.out.println("Animal Constructor was called!");
    }



    // Abstract classes can have both concrete (has a method body) and abstract methods
    public void exist(){
        System.out.println("I exist!");
    }


    public abstract void makeSound();


    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
