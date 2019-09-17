//Cannot import sub-packages
//import mainApp.orders.*;

//Need a separate import for each subpackage
//import mainApp.orders.items.*;

import java.util.*;
import java.time.LocalDate;

import mainApp.*;
import mainApp.inheritance.InheritanceTest;
import mainApp.orders.StringTest;

public class MainApp {

    public static void main(String[] args) {
        StringTest.assignThenPrintTest();
    }

    private static void throwsException() throws Exception {
        System.out.println("All fine");
    }
}
