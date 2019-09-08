package mainApp.orders;

//invalid import stmt
//import items.*;

//Need stmt to import sub-package
//Need to state full sub-package name to import
import mainApp.orders.items.*;

public class Order {

    protected int i1;
    Item item;

    //protected: class in parent package cannot access protected in sub-package
    //int i2 = item.i2; //give error
}