package mainApp;

public abstract class AbstractClass {

    //Illegal:
    //public static abstract void a();w

    public void publicConcreteMethod(){}
    public abstract void publicAbstractMethod();

    private void privateConcreteMethod(){}

    //Illegal: abstract methods cannot be private.
    //private abstract void privateAbstractMethod();
}

class ConcreteClass extends AbstractClass {

    //Yes, can have empty implementations for void abstract methods.
    public void publicAbstractMethod() {}
}
