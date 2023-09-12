package W3.D2.Lecture;

public class ShapeDriver {

    public static void main(String[] args) {
        // It's important to note that we cannot create an instance of the shape class
        // Shape shape = new Shape(); does not work

        // What I'm going to do instead is say the following
        Shape square = new Rectangle("Red", 3, 3);

        // What's the advantage of doing it like this?
        System.out.println(square);

        Shape circle = new Circle("Yellow", 5);

        System.out.println(circle);

        circle = new Rectangle("Blue", 3, 5);


    }
}
