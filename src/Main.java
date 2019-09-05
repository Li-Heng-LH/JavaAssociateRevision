//Cannot import sub-packages
import orders.*;

//Need a separate import for each subpackage
import orders.items.*;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        Item item = new Item();
    }
}
