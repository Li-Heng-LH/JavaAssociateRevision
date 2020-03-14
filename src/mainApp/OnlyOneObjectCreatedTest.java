package mainApp;

public class OnlyOneObjectCreatedTest {

    //If a superclass constructor is always called,
    //how many objects will be created when a child object is created?
    //One
    public static void run() {
        C c = new C();
        System.out.println("The created object is: " + c.hashCode());
    }
}

class P {
    P() {
        System.out.println("This object is being created: " + this.hashCode());
    }
}

class C extends P {
    C () {
        //super() is invoked implicitly
        System.out.println("This object is being created: " + this.hashCode());
    }
}
