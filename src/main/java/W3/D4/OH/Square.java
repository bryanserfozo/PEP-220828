package W3.D4.OH;

public class Square implements Drawable{
    @Override
    public void draw() {
        String rect = " ____ \n" + "|    |\n" + "|    |\n" + " ____ \n";
        System.out.println(rect);
    }
}
