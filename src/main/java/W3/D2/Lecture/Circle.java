package W3.D2.Lecture;

public class Circle extends Shape{

    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor was called");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle's color is " + color + " and its area is " + area();
    }
}
