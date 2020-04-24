package mainApp;

public class TestObjectReference {

    public static void test() {

        Person person = new Person();
        Person personCopy = person;

        System.out.println(person.hashCode());
        System.out.println(personCopy.hashCode());

        person = new Person("a", 11);

        System.out.println("After reassign:");
        System.out.println(person.hashCode());
        System.out.println(personCopy.hashCode());
    }
}
