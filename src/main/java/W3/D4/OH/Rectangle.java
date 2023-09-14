package W3.D4.OH;

public class Rectangle implements Drawable{
    @Override
    public void draw() {
        // Inside of here is a method body that describes what to do when calling the draw method
        String rect = "------\n" + "|    |\n" + "|    |\n" + "------\n";
        System.out.println(rect);
    }
}
