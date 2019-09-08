//Cannot import sub-packages
//import mainApp.orders.*;

//Need a separate import for each subpackage
//import mainApp.orders.items.*;

import mainApp.ChildTwo;

public class MainApp {

    public static void main(String[] args) {
        ChildTwo childTwo = new ChildTwo();
        childTwo.print();
    }
}
