package W3.D3;

public class Cat extends Animal{ // Provides an extension on animal, must implement the abstract methods

    private boolean hasFur;


    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public Cat(boolean hasFur) {
        super();
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
