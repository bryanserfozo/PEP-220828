package W3.D1;

public class Animal {
    // This class will be our PARENT or super class for all the other animals we make

    // We can define some attributes
    String name;

    int numOfLegs;

    boolean hasFur;


    // Maybe the parent class also has some methods
    public String speak(){
        return "This animal has no speak method defined!";
    }

    public Animal() {
    }

    public Animal(String name, int numOfLegs, boolean hasFur) {
        this.name = name;
        this.numOfLegs = numOfLegs;
        this.hasFur = hasFur;
    }
}
