//Cannot import sub-packages
//import mainApp.orders.*;

//Need a separate import for each subpackage
//import mainApp.orders.items.*;

import java.sql.SQLOutput;
import java.util.*;
import java.time.LocalDate;

import mainApp.*;
import mainApp.inheritance.InheritanceTest;
import mainApp.orders.StringTest;

public class MainApp {

    static {
        System.out.println("YAY");
    }

    public static void main(String[] args) {
        int a = 100;
        System.out.println(-a++);//-100
        doOperation(a++);//101
        System.out.println(a);//102
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
