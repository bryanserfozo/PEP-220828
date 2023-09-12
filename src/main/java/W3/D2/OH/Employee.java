package W3.D2.OH;

public class Employee extends Person{ // Want this class to extend the person class

    // Now we'll add some new functionality
    String companyName;

    // TODO override the original introduce method from the Person class
    public String introduce(){
        // This will contain a more specific version of the introduce method from the Person class
        return "Hi, my name is " + name + " and I work at " + companyName;
    }
}
