//Cannot import sub-packages
//import mainApp.orders.*;

//Need a separate import for each subpackage
//import mainApp.orders.items.*;

import java.util.*;
import java.time.LocalDate;
import mainApp.ChildTwo;
import mainApp.InitialisationTest;
import mainApp.StringBuilderTest;

public class MainApp {

    public static void main(String[] args) throws Exception {
        throwsException();
    }

    private static void throwsException() throws Exception {
        System.out.println("All fine");
    }
}
