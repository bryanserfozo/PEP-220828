package W3.D2.Lecture;

public class Rectangle extends Shape implements Drawable{

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color); // Call the parent class constructor
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle's color is " + color + " and its area is " + area();
    }

    @Override
    public String draw() {
        return null;
    }
}
