package W2.D3;

public class WrapperClassBasics {

    public static void main(String[] args) {
        // What exactly is a wrapper class?

        // We have our prims that are like int, double, char, boolean etc
        // Then we have Object versions of these datatypes represented by Integer, Double, Boolean, and Character, etc

        // Recall that objects have methods whereas primitives do not

        int x = 3;
        Integer n = 4;

        char k = 'k';
        Character kay = 'L';

        // Basically what a wrapper class does is wrap up a primitive value and make it look like an object

        // If we wanted to call the method named add, we'd normally need to pass in an Integer object
        // But by using the wrapper class we can essentially pass primitive values as an object
        add(n, x);

        // The process I just did is called autoboxing --> wrapping a primitive value in an object

        // There's a similar process in reverse call unboxing --> extracting the primitive from a wrapper object
        subtract(x, n);

        // Why do we need this? Some things in Java require the use of objects instead of only allowing primitives
        // This allows us to essentially circumvent this concern

        // Some nice things that come from wrapper classes are some of the utility methods that work with strings
        // parseInt is a great example

        String five = "5";

        Integer i = Integer.parseInt(five);

        int j = 1 + i;

        System.out.println(j);
        System.out.println(1 + five);
    }

    public static void add(Integer a, Integer b){

    }

    public static void subtract(int a, int b){}

}
