package mainApp;

public class OverrideAndExceptionTest {}

class Animal {

    public void method () throws ParentException {}

}

class Dog extends Animal3 {

    //Not throwing exception is allowed
    //public void method() {} //Not throwing exception is allowed

    //Throwing child exception is allowed
    //public void method() throws ChildExceptionA {}

    //Throwing multiple child exceptions is allowed
    //public void method() throws ChildExceptionA, ChildExceptionB {}

    //Throwing parent and child exceptions is allowed
    public void method() throws ParentException, ChildExceptionA, ChildExceptionB {}



    //Throwing more generic exception is not allowed
    //public void method() throws Exception {}

    //Throwing another exception is not allowed
    //public void method() throws AnotherException {}
}

class ParentException extends Exception {}

class ChildExceptionA extends ParentException {}

class ChildExceptionB extends ParentException {}

class AnotherException extends Exception {}
