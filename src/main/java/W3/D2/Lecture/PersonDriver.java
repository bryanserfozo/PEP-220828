package W3.D2.Lecture;

public class PersonDriver {

    public static void main(String[] args) {
        // Here we can create a person object and set the fields manually
        Person p = new Person();
        // p.name = "Walter White";
        // p.age = 50;
        // p.height = 6;

        // What we've done so far is access the instance fields DIRECTLY, this can become a problem further down the line

        // What is stopping us from storing irregular values inside of these variables?
        // p.age = -5;
        // For a variable this makes sense, but not in the context of a person's age
        // p.height = 60;

        // How fix?

        // Now I can retrieve the value of the person's name by calling p.getName()
        System.out.println(p.getName()); // Null prints out right now which isn't helpful, so we need a way to set the value

        p.setName("Walter White");

        System.out.println(p.getName());

        p.setAge(50);

        System.out.println(p.getAge());

    }
}
