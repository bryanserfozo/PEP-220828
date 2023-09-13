package W3.D3;

public class AnimalDriver {

    public static void main(String[] args) {


        Cat a1 = new Cat(true);

        a1.makeSound();

        Frog a2 = new Frog();

        a2.makeSound();

        // Liskov Principle

        // Animal will be our reference type
        Animal a3 = new Frog();

        a3.exist();

        a3.makeSound();

        Amphibious frog = new Frog();

        frog.swim();
    }
}
