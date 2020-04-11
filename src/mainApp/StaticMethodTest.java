package mainApp;

class StaticMethodParent {
    //Yes, static methods can be private.
    private static void aMethod(){}

    public static void staticMethod() {
        System.out.println("Parent static method");
    }
}

class StaticMethodChild extends StaticMethodParent {
    public static void staticMethod() {
        System.out.println("Child static method");
    }
}


public class StaticMethodTest {
    public static void run() {
        StaticMethodParent sp = new StaticMethodParent();
        StaticMethodParent sp2 = new StaticMethodChild();
        StaticMethodChild sc = new StaticMethodChild();

        sp.staticMethod(); //parent
        sp2.staticMethod(); //parent
        sc.staticMethod(); //child
    }
}