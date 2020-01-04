public class SuperTest {

    public static void printDog() {
        Dog dog = new Dog ("hihi", "yoyo");
        System.out.println(dog.toString());
    }
}


abstract class Animal {
    private String name;

    //IMPORTANT
    //If there is no no-arg constructor, compilation error in Dog Class
    Animal() {}

    Animal(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

}

class Dog extends Animal {
    private String breed;

    Dog(String breed) {
        // implicit super() here
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "[" + super.getName() + ", " + breed +  "]";
    }
}