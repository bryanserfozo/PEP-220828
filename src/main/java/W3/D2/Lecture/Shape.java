package W3.D2.Lecture;

abstract class Shape { // This will be an abstract class which will contain general features we expect ALL shapes to have

    // Abstract keyword has a couple uses. When used on a class, you can no longer  instantiate the class directly
    // The class can contain concrete or abstract method

    // When abstract is applied to a method we DO NOT give it implementation

    String color;

    public Shape(String color) {

        System.out.println("The shape constructor was called!");
        this.color = color;
    }

    // Now we can in some methods

    // Example of a concrete method (contains a method body --> {})
    public String getColor() {
        return color;
    }

    // We can declare abstract methods
    public abstract double area(); // This guy will need to be implemented in a concrete subclass
    public abstract String toString();
}
