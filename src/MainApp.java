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

    public static void main(String[] args) {
        InitialisationTest test = new InitialisationTest();
        test.initialiseCDF();
    }
}
