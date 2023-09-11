package W1.D2;

public class Calculator {




    // This is a class that describes a calculator

    // It should define all the things a calculator can do

    // We should be able to use this to add, subtract, multiply, and square

    public static int add(int a, int b){

        return a + b;
    }

    public static int copy(int text){
        return text;
    }


    public static int subtract(int x, int y){
        return x - y;
    }

    public static double multiply(double i, double j){
        // This method takes in doubles meaning we can use decimals when we multiply
        return i * j;
    }

    public static void main(String[] args) {
        // We call the add method from the calculator class
        // We hand it 2 integers, one for each parameter
        // It returns us a single integer
        // We print out the number
        System.out.println(add(2,3));
        System.out.println(add(3,29));
        System.out.println(add(51,46));

        System.out.println("------------------------");

        System.out.println(subtract(6,10));
        System.out.println(subtract(7, 18));
        System.out.println(subtract(19, 12));

        System.out.println("-------------------------");

        System.out.println(multiply(5,6));
        System.out.println(multiply(-12.4, 5));
        System.out.println(multiply(19.234, 1.27));

        System.out.println("-------------------------");
        System.out.println(square(16));
        System.out.println(square(1.441));
    }

    public static double square(double toBeSquared){
        return toBeSquared * toBeSquared;
    }


}
