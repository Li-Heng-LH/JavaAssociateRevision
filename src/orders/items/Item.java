//cannot compile
//import java.util.*;

//Need to be first stmt
package orders.items;

//Need stmt to import parent package
import orders.Order;

public class Item {

    Order order = new Order();

    //protected : class in sub-package cannot access protected in parent package
    //int i1 = order.i1; //give error
}
