package mainApp;

public class AbstractClassInheritanceTest {
}

abstract class Super {
    public abstract void m1();
}

class Sub extends Super {
    //A concrete class has to implement abstract parent's methods

    @Override
    public void m1() {
        //Need to implement
    }
}