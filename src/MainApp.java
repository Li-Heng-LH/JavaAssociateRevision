//Cannot import sub-packages
//import mainApp.orders.*;

//Need a separate import for each subpackage
//import mainApp.orders.items.*;

import mainApp.IteratorTest;
import mainApp.StaticTest;
import mainApp.StringTest;
import mainApp.TestTryCatch;

public class MainApp {

    static {
        System.out.println("YAY");
    }

    public static void main(String[] args) throws Exception {
        IteratorTest.testRemoveWhileTraverse();
    }

    private static void throwsException() throws Exception {
        System.out.println("All fine");
    }

    private static void doOperation(int a) {
        System.out.println(a);
    }
}

//Cannot have 2 public classes
//public class Message { //error
class Message {

    //public static void main(String [] args) { //can run individually
    static void main(String [] args) {
        System.out.println("Message!");
    }
}
