package W3.D4.OH;

public class ShapeDriver {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.draw();

        // Liskov Principle
        Drawable shape = new Square();

        shape.draw(); // Imagine this is 100 lines of code relying on shape

        UserDAO ud = new SQLUserDAO();

        ud.createUser();

        ud.deleteUser();

        ud.createUser();

        ud.deleteUser();

        ud.findUserByUsername();

        ud.deleteUser();
    }
}
