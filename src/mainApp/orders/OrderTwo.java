package mainApp.orders;

public class OrderTwo {

    //Same package level, no need to import
    Order order = new Order();

    //protected: can be accessed by class in same package
    int i1 = order.i1;
}
