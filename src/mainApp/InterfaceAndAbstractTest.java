package mainApp;

public class InterfaceAndAbstractTest {

}


interface Printable {
    void setMargin();
    void setOrientation();
}

//Abstract class implementing interface can be empty
abstract class Paper implements Printable {
}

class NewsPaper extends Paper {
    public void setMargin() {}
    public void setOrientation() {}
}