package W3.D2.Lecture;

public class Person {
    // The first topic we'll discuss is encapsulation

    // TODO we want to encapsulate and protect these values from being altered in an incorrect way

    // TODO make the fields private so they can only be accessed inside the class
    private String name; // Be declaring this as private it can only be accessed inside this class

    private int age;

    private double height;

    // First step is to mark the instance fields as private

    // TODO create getter and setter methods

    // Now that we've marked the fields as private we need to create a way to set the field and get the value

    // Getters retrieve the value from the variable
    public String getName(){
        return this.name;
    }

    // Setters set or change the value of a variable

    public void setName(String name){
        // This does the actual setting of the variable
        this.name = name;
    }

    // The whole idea behind protecting these values with the mutator methods is that you allow it to do some internal checking
    // before setting the value

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        // We'll leverage this mutator to do some checking to make sure only positive values >= 1 are passed in
        if (age >= 1){
            this.age = age;
        } else{
            // How could we handle the alternative?
            // We could set a default value, such as 1-year-old
            // this.age = 1;
            // We could throw an exception, maybe an IllegalArgumentException
            throw new IllegalArgumentException("Age must be a positive number");
            // We could just do nothing as well
            // System.out.println("Hey no don't do that, bad!");
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        // If we wanted to protect this field we'd have to add in logic to do so
        this.height = height;
    }
}
