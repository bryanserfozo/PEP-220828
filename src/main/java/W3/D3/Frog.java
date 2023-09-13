package W3.D3;

public class Frog extends Animal implements Ectothermic, Amphibious{
    @Override
    public void makeSound() {
        System.out.println("Ribbit ribbit!");
    }

    @Override
    public void heatUp() {
        // We now have the ability to provide a method body to heatUp and coolDown
    }

    @Override
    public void swim() {
        System.out.println("Swim swim swim");
    }

    @Override
    public void coolDown() {

    }
}
