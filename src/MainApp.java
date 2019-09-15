//Cannot import sub-packages
//import mainApp.orders.*;

//Need a separate import for each subpackage
//import mainApp.orders.items.*;

import java.util.*;
import java.time.LocalDate;
import mainApp.ChildTwo;
import mainApp.InitialisationTest;
import mainApp.ReferencePassingTest;
import mainApp.StringBuilderTest;
import mainApp.inheritance.InheritanceTest;

public class MainApp {

    public static void main(String[] args) {
        InheritanceTest.testMultipleChildren();
    }

    private static void throwsException() throws Exception {
        System.out.println("All fine");
    }
}
