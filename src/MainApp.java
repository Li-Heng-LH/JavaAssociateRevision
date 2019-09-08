//Cannot import sub-packages
//import mainApp.orders.*;

//Need a separate import for each subpackage
//import mainApp.orders.items.*;

import mainApp.inheritance.Child;

public class MainApp {

    public static void main(String[] args) {
        Child child = new Child();
        child.print();
    }
}
