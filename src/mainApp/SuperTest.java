package mainApp;

public class SuperTest {

    public static void printDog() {
        Dog2 dog2 = new Dog2 ("yoyo");
        System.out.println(dog2.toString());
    }
}


abstract class Animal3 {
    private String name;

    //IMPORTANT
    //If there is no no-arg constructor, compilation error in mainApp.Dog Class
    Animal3() {}

    Animal3(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

}

class Dog3 extends Animal3 {
    private String breed;

    Dog3(String breed) {
        // implicit super() here
        this.breed = breed;
    }

    Dog3(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "[" + super.getName() + ", " + breed +  "]";
    }
}




abstract class Animal2 {
    private String name;

    //No no-arg constructor here

    Animal2(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

}

class Dog2 extends Animal2 {
    private String breed;

    Dog2(String breed) {

        //super() is not called as we have super(breed)
        super(breed);

        this.breed = breed;
    }

    Dog2(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "[" + super.getName() + ", " + breed +  "]";
    }
}