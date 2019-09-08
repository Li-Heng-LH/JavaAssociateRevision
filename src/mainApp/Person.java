package mainApp;

public class Person {

    private String name;
    private int age;

    public Person() {
        //Wrong way to chain constructors
        //mainApp.Person("abc", 20);

        //proper way to chain constructors
        this("abc", 20);
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

}
